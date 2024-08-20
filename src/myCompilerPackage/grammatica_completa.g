grammar grammatica_completa;

options {
  language = Java;
  k=1;
}

@lexer::header{
    package myCompilerPackage;   
}

@parser::header{
    package myCompilerPackage;   
    import myCompilerPackage.HtmlHandler;
}

@parser::members{
    HtmlHandler handler = new HtmlHandler();
}

/* ***********************************************
    Syntactic Rule definition starts here
************************************************** */ 

startRule
    : {handler.startHtml();}
      tagBgColor? 
      tagFontType? 
      tagMarginTop? 
      tagMarginBottom? 
      tagMarginLeft? 
      tagMarginRight? 
      tagTextAlign? 
      tagTextLineHeight? 
      tagCss
      (bookRule)*
      {handler.endHtml();}
      EOF
    ;

bookRule
    :
    tagTitleDefinitionRule 
    tagAuthorDefinitionRule( tagGenreDefinitionRule 
    tagCompositionDateDefinitionRule 
    tagPublicationYearDefinitionRule 
    tagPublisherDefinitionRule 
    tagNarratorDefinitionRule 
    tagPagesDefinitionRule 
    tagPriceDefinitionRule 
    tagStructureDefinitionRule 
    tagPlotDefinitionRule 
    tagMessageDefinitionRule 
    tagCharactersDefinitionRule )*
    {handler.addBookSeparator();}
    ;

tagPageTitleDefinitionRule
    : {handler.addPageTitle();}
    ;

tagBgColor
  : BGCOLOR COLON text = STRING {handler.setBgColor($text.text);}
  ;

tagFontType
  : FONT COLON text = STRING {handler.setFontType($text.text);}
  ;

tagMarginTop
  : MARGINTOP COLON text = STRING {handler.setMarginTop($text.text);}
  ;

tagMarginBottom
  : MARGINBOTTOM COLON text = STRING {handler.setMarginBottom($text.text);}
  ;
  
tagMarginLeft
  : MARGINLEFT COLON text = STRING {handler.setMarginLeft($text.text);}
  ;
  
tagMarginRight
  : MARGINRIGHT COLON text = STRING {handler.setMarginRight($text.text);}
  ;

tagTextAlign
  : TEXTALIGN COLON text = STRING {handler.setTextAlign($text.text);}
  ;

tagTextLineHeight
  : TEXTLINEHEIGHT COLON text = STRING {handler.setTextLineHeight($text.text);}
  ;

tagCss
  : {handler.addCss();}
  ;

tagTitleDefinitionRule
    : TITOLO COLON text = STRING {handler.addTitle($text.text);}
    ;

tagAuthorDefinitionRule
    : AUTORE COLON text=STRING {handler.addAuthor($text.text);}
    ;

tagGenreDefinitionRule
    : GENERE COLON text=STRING {handler.addGenre($text.text);}
    ;    

tagCompositionDateDefinitionRule
    : DATA_DI_COMPOSIZIONE COLON text=STRING {handler.addCompositionDate($text.text);}
    ;

tagPublicationYearDefinitionRule
    : ANNO_DI_PUBBLICAZIONE COLON text=INT {handler.addPublicationYear($text.text);}
    ;

tagPublisherDefinitionRule
    : EDITORE COLON text=STRING {handler.addPublisher($text.text);}
    ;

tagNarratorDefinitionRule
    : NARRATORE COLON text=STRING {handler.addNarrator($text.text);}
    ;

tagPagesDefinitionRule
    : NUMERO_PAGINE COLON text=INT {handler.addPages($text.text);}
    ;

tagPriceDefinitionRule
    : PREZZO COLON text=STRING {handler.addPrice($text.text);}
    ;

tagStructureDefinitionRule
    : STRUTTURA COLON text=STRING {handler.addStructure($text.text);}
    ;

tagPlotDefinitionRule
    : TRAMA COLON text=STRING {handler.addPlot($text.text);}
    ;

tagMessageDefinitionRule
    : MESSAGGIO_LANCIATO COLON text=STRING {handler.addMessage($text.text);}
    ;

tagCharactersDefinitionRule
    : PERSONAGGI COLON text=STRING {handler.addCharacters($text.text);}
    ;

TAG_OPEN : '<';
TAG_CLOSE : '>';
TAG_TITLE: 'title';
TAG_HEAD: 'head';
SLASH  : '/';
SC  : ';';
DOT : '.';
COLON : ':';
COMMA : ',';
TRATTINO: '-';
EURO  : '€';

AUTORE     : 'Autore';
TITOLO     : 'Titolo';
BGCOLOR    : 'BgColor';
MARGINTOP : 'margin-top';
MARGINBOTTOM : 'margin-bottom';
MARGINLEFT : 'margin-left';
MARGINRIGHT : 'margin-right';
TEXTALIGN  : 'text-align';  
TEXTLINEHEIGHT : 'line-height';
FONT : 'fontType';
CSS : 'addCss';

GENERE     : 'Genere';
DATA_DI_COMPOSIZIONE: 'Data_di_composizione';
ANNO_DI_PUBBLICAZIONE: 'Anno_di_pubblicazione';
EDITORE: 'Editore';
NARRATORE: 'Narratore';
NUMERO_PAGINE: 'Pagine';
PREZZO : 'Prezzo';
STRUTTURA: 'Struttura';
TRAMA    : 'Trama';
MESSAGGIO_LANCIATO: 'Messaggio';
PERSONAGGI: 'Personaggi';
LIBRO : 'libro';

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;

INT : '0'..'9'+ ;

FLOAT
    : ('0'..'9')+ '.' ('0'..'9')* EXPONENT?
    | '.' ('0'..'9')+ EXPONENT?
    | ('0'..'9')+ EXPONENT
    ;

COMMENT
    : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  : ( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;} ;

STRING
    : '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;

CHAR : '\'' ( ESC_SEQ | ~('\''|'\\') ) '\''
    ;

fragment
EXPONENT : ('e'|'E') ('+'|'-')? ('0'..'9')+ ;

fragment
HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment
ESC_SEQ
    : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    | UNICODE_ESC
    ;

fragment
UNICODE_ESC
    : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;