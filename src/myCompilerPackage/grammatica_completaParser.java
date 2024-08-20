// $ANTLR 3.5.1 C:\\Users\\bened\\Downloads\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g 2024-06-03 14:59:33


    package myCompilerPackage;   
    import myCompilerPackage.HtmlHandler;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammatica_completaParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANNO_DI_PUBBLICAZIONE", "AUTORE", 
		"BGCOLOR", "CHAR", "COLON", "COMMA", "COMMENT", "CSS", "DATA_DI_COMPOSIZIONE", 
		"DOT", "EDITORE", "ESC_SEQ", "EURO", "EXPONENT", "FLOAT", "FONT", "GENERE", 
		"HEX_DIGIT", "ID", "INT", "LIBRO", "MARGINBOTTOM", "MARGINLEFT", "MARGINRIGHT", 
		"MARGINTOP", "MESSAGGIO_LANCIATO", "NARRATORE", "NUMERO_PAGINE", "PERSONAGGI", 
		"PREZZO", "SC", "SLASH", "STRING", "STRUTTURA", "TAG_CLOSE", "TAG_HEAD", 
		"TAG_OPEN", "TAG_TITLE", "TEXTALIGN", "TEXTLINEHEIGHT", "TITOLO", "TRAMA", 
		"TRATTINO", "UNICODE_ESC", "WS"
	};
	public static final int EOF=-1;
	public static final int ANNO_DI_PUBBLICAZIONE=4;
	public static final int AUTORE=5;
	public static final int BGCOLOR=6;
	public static final int CHAR=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int COMMENT=10;
	public static final int CSS=11;
	public static final int DATA_DI_COMPOSIZIONE=12;
	public static final int DOT=13;
	public static final int EDITORE=14;
	public static final int ESC_SEQ=15;
	public static final int EURO=16;
	public static final int EXPONENT=17;
	public static final int FLOAT=18;
	public static final int FONT=19;
	public static final int GENERE=20;
	public static final int HEX_DIGIT=21;
	public static final int ID=22;
	public static final int INT=23;
	public static final int LIBRO=24;
	public static final int MARGINBOTTOM=25;
	public static final int MARGINLEFT=26;
	public static final int MARGINRIGHT=27;
	public static final int MARGINTOP=28;
	public static final int MESSAGGIO_LANCIATO=29;
	public static final int NARRATORE=30;
	public static final int NUMERO_PAGINE=31;
	public static final int PERSONAGGI=32;
	public static final int PREZZO=33;
	public static final int SC=34;
	public static final int SLASH=35;
	public static final int STRING=36;
	public static final int STRUTTURA=37;
	public static final int TAG_CLOSE=38;
	public static final int TAG_HEAD=39;
	public static final int TAG_OPEN=40;
	public static final int TAG_TITLE=41;
	public static final int TEXTALIGN=42;
	public static final int TEXTLINEHEIGHT=43;
	public static final int TITOLO=44;
	public static final int TRAMA=45;
	public static final int TRATTINO=46;
	public static final int UNICODE_ESC=47;
	public static final int WS=48;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public grammatica_completaParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammatica_completaParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return grammatica_completaParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g"; }


	    HtmlHandler handler = new HtmlHandler();



	// $ANTLR start "startRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:25:1: startRule : ( tagBgColor )? ( tagFontType )? ( tagMarginTop )? ( tagMarginBottom )? ( tagMarginLeft )? ( tagMarginRight )? ( tagTextAlign )? ( tagTextLineHeight )? tagCss ( bookRule )* EOF ;
	public final void startRule() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:26:5: ( ( tagBgColor )? ( tagFontType )? ( tagMarginTop )? ( tagMarginBottom )? ( tagMarginLeft )? ( tagMarginRight )? ( tagTextAlign )? ( tagTextLineHeight )? tagCss ( bookRule )* EOF )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:26:7: ( tagBgColor )? ( tagFontType )? ( tagMarginTop )? ( tagMarginBottom )? ( tagMarginLeft )? ( tagMarginRight )? ( tagTextAlign )? ( tagTextLineHeight )? tagCss ( bookRule )* EOF
			{
			handler.startHtml();
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:27:7: ( tagBgColor )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==BGCOLOR) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:27:7: tagBgColor
					{
					pushFollow(FOLLOW_tagBgColor_in_startRule71);
					tagBgColor();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:28:7: ( tagFontType )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FONT) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:28:7: tagFontType
					{
					pushFollow(FOLLOW_tagFontType_in_startRule81);
					tagFontType();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:29:7: ( tagMarginTop )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==MARGINTOP) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:29:7: tagMarginTop
					{
					pushFollow(FOLLOW_tagMarginTop_in_startRule91);
					tagMarginTop();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:30:7: ( tagMarginBottom )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==MARGINBOTTOM) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:30:7: tagMarginBottom
					{
					pushFollow(FOLLOW_tagMarginBottom_in_startRule101);
					tagMarginBottom();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:31:7: ( tagMarginLeft )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==MARGINLEFT) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:31:7: tagMarginLeft
					{
					pushFollow(FOLLOW_tagMarginLeft_in_startRule111);
					tagMarginLeft();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:32:7: ( tagMarginRight )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==MARGINRIGHT) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:32:7: tagMarginRight
					{
					pushFollow(FOLLOW_tagMarginRight_in_startRule121);
					tagMarginRight();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:33:7: ( tagTextAlign )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==TEXTALIGN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:33:7: tagTextAlign
					{
					pushFollow(FOLLOW_tagTextAlign_in_startRule131);
					tagTextAlign();
					state._fsp--;

					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:34:7: ( tagTextLineHeight )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==TEXTLINEHEIGHT) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:34:7: tagTextLineHeight
					{
					pushFollow(FOLLOW_tagTextLineHeight_in_startRule141);
					tagTextLineHeight();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_tagCss_in_startRule151);
			tagCss();
			state._fsp--;

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:36:7: ( bookRule )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==TITOLO) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:36:8: bookRule
					{
					pushFollow(FOLLOW_bookRule_in_startRule160);
					bookRule();
					state._fsp--;

					}
					break;

				default :
					break loop9;
				}
			}

			handler.endHtml();
			match(input,EOF,FOLLOW_EOF_in_startRule178); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "startRule"



	// $ANTLR start "bookRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:41:1: bookRule : tagTitleDefinitionRule tagAuthorDefinitionRule ( tagGenreDefinitionRule tagCompositionDateDefinitionRule tagPublicationYearDefinitionRule tagPublisherDefinitionRule tagNarratorDefinitionRule tagPagesDefinitionRule tagPriceDefinitionRule tagStructureDefinitionRule tagPlotDefinitionRule tagMessageDefinitionRule tagCharactersDefinitionRule )* ;
	public final void bookRule() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:42:5: ( tagTitleDefinitionRule tagAuthorDefinitionRule ( tagGenreDefinitionRule tagCompositionDateDefinitionRule tagPublicationYearDefinitionRule tagPublisherDefinitionRule tagNarratorDefinitionRule tagPagesDefinitionRule tagPriceDefinitionRule tagStructureDefinitionRule tagPlotDefinitionRule tagMessageDefinitionRule tagCharactersDefinitionRule )* )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:43:5: tagTitleDefinitionRule tagAuthorDefinitionRule ( tagGenreDefinitionRule tagCompositionDateDefinitionRule tagPublicationYearDefinitionRule tagPublisherDefinitionRule tagNarratorDefinitionRule tagPagesDefinitionRule tagPriceDefinitionRule tagStructureDefinitionRule tagPlotDefinitionRule tagMessageDefinitionRule tagCharactersDefinitionRule )*
			{
			pushFollow(FOLLOW_tagTitleDefinitionRule_in_bookRule199);
			tagTitleDefinitionRule();
			state._fsp--;

			pushFollow(FOLLOW_tagAuthorDefinitionRule_in_bookRule206);
			tagAuthorDefinitionRule();
			state._fsp--;

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:44:28: ( tagGenreDefinitionRule tagCompositionDateDefinitionRule tagPublicationYearDefinitionRule tagPublisherDefinitionRule tagNarratorDefinitionRule tagPagesDefinitionRule tagPriceDefinitionRule tagStructureDefinitionRule tagPlotDefinitionRule tagMessageDefinitionRule tagCharactersDefinitionRule )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==GENERE) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:44:30: tagGenreDefinitionRule tagCompositionDateDefinitionRule tagPublicationYearDefinitionRule tagPublisherDefinitionRule tagNarratorDefinitionRule tagPagesDefinitionRule tagPriceDefinitionRule tagStructureDefinitionRule tagPlotDefinitionRule tagMessageDefinitionRule tagCharactersDefinitionRule
					{
					pushFollow(FOLLOW_tagGenreDefinitionRule_in_bookRule209);
					tagGenreDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagCompositionDateDefinitionRule_in_bookRule216);
					tagCompositionDateDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagPublicationYearDefinitionRule_in_bookRule223);
					tagPublicationYearDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagPublisherDefinitionRule_in_bookRule230);
					tagPublisherDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagNarratorDefinitionRule_in_bookRule237);
					tagNarratorDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagPagesDefinitionRule_in_bookRule244);
					tagPagesDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagPriceDefinitionRule_in_bookRule251);
					tagPriceDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagStructureDefinitionRule_in_bookRule258);
					tagStructureDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagPlotDefinitionRule_in_bookRule265);
					tagPlotDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagMessageDefinitionRule_in_bookRule272);
					tagMessageDefinitionRule();
					state._fsp--;

					pushFollow(FOLLOW_tagCharactersDefinitionRule_in_bookRule279);
					tagCharactersDefinitionRule();
					state._fsp--;

					}
					break;

				default :
					break loop10;
				}
			}

		//	handler.addBookSeparator();
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "bookRule"



	// $ANTLR start "tagPageTitleDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:58:1: tagPageTitleDefinitionRule :;
	public final void tagPageTitleDefinitionRule() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:59:5: ()
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:59:7: 
			{
			handler.addPageTitle();
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPageTitleDefinitionRule"



	// $ANTLR start "tagBgColor"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:62:1: tagBgColor : BGCOLOR COLON text= STRING ;
	public final void tagBgColor() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:63:3: ( BGCOLOR COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:63:5: BGCOLOR COLON text= STRING
			{
			match(input,BGCOLOR,FOLLOW_BGCOLOR_in_tagBgColor320); 
			match(input,COLON,FOLLOW_COLON_in_tagBgColor322); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagBgColor328); 
			handler.setBgColor((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagBgColor"



	// $ANTLR start "tagFontType"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:66:1: tagFontType : FONT COLON text= STRING ;
	public final void tagFontType() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:67:3: ( FONT COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:67:5: FONT COLON text= STRING
			{
			match(input,FONT,FOLLOW_FONT_in_tagFontType343); 
			match(input,COLON,FOLLOW_COLON_in_tagFontType345); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagFontType351); 
			handler.setFontType((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagFontType"



	// $ANTLR start "tagMarginTop"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:70:1: tagMarginTop : MARGINTOP COLON text= STRING ;
	public final void tagMarginTop() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:71:3: ( MARGINTOP COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:71:5: MARGINTOP COLON text= STRING
			{
			match(input,MARGINTOP,FOLLOW_MARGINTOP_in_tagMarginTop366); 
			match(input,COLON,FOLLOW_COLON_in_tagMarginTop368); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagMarginTop374); 
			handler.setMarginTop((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMarginTop"



	// $ANTLR start "tagMarginBottom"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:74:1: tagMarginBottom : MARGINBOTTOM COLON text= STRING ;
	public final void tagMarginBottom() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:75:3: ( MARGINBOTTOM COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:75:5: MARGINBOTTOM COLON text= STRING
			{
			match(input,MARGINBOTTOM,FOLLOW_MARGINBOTTOM_in_tagMarginBottom389); 
			match(input,COLON,FOLLOW_COLON_in_tagMarginBottom391); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagMarginBottom397); 
			handler.setMarginBottom((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMarginBottom"



	// $ANTLR start "tagMarginLeft"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:78:1: tagMarginLeft : MARGINLEFT COLON text= STRING ;
	public final void tagMarginLeft() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:79:3: ( MARGINLEFT COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:79:5: MARGINLEFT COLON text= STRING
			{
			match(input,MARGINLEFT,FOLLOW_MARGINLEFT_in_tagMarginLeft414); 
			match(input,COLON,FOLLOW_COLON_in_tagMarginLeft416); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagMarginLeft422); 
			handler.setMarginLeft((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMarginLeft"



	// $ANTLR start "tagMarginRight"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:82:1: tagMarginRight : MARGINRIGHT COLON text= STRING ;
	public final void tagMarginRight() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:83:3: ( MARGINRIGHT COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:83:5: MARGINRIGHT COLON text= STRING
			{
			match(input,MARGINRIGHT,FOLLOW_MARGINRIGHT_in_tagMarginRight439); 
			match(input,COLON,FOLLOW_COLON_in_tagMarginRight441); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagMarginRight447); 
			handler.setMarginRight((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMarginRight"



	// $ANTLR start "tagTextAlign"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:86:1: tagTextAlign : TEXTALIGN COLON text= STRING ;
	public final void tagTextAlign() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:87:3: ( TEXTALIGN COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:87:5: TEXTALIGN COLON text= STRING
			{
			match(input,TEXTALIGN,FOLLOW_TEXTALIGN_in_tagTextAlign462); 
			match(input,COLON,FOLLOW_COLON_in_tagTextAlign464); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagTextAlign470); 
			handler.setTextAlign((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagTextAlign"



	// $ANTLR start "tagTextLineHeight"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:90:1: tagTextLineHeight : TEXTLINEHEIGHT COLON text= STRING ;
	public final void tagTextLineHeight() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:91:3: ( TEXTLINEHEIGHT COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:91:5: TEXTLINEHEIGHT COLON text= STRING
			{
			match(input,TEXTLINEHEIGHT,FOLLOW_TEXTLINEHEIGHT_in_tagTextLineHeight485); 
			match(input,COLON,FOLLOW_COLON_in_tagTextLineHeight487); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagTextLineHeight493); 
			handler.setTextLineHeight((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagTextLineHeight"



	// $ANTLR start "tagCss"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:94:1: tagCss :;
	public final void tagCss() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:95:3: ()
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:95:5: 
			{
			handler.addCss();
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagCss"



	// $ANTLR start "tagTitleDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:98:1: tagTitleDefinitionRule : TITOLO COLON text= STRING ;
	public final void tagTitleDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:99:5: ( TITOLO COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:99:7: TITOLO COLON text= STRING
			{
			match(input,TITOLO,FOLLOW_TITOLO_in_tagTitleDefinitionRule523); 
			match(input,COLON,FOLLOW_COLON_in_tagTitleDefinitionRule525); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagTitleDefinitionRule531); 
			handler.addTitle((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagTitleDefinitionRule"



	// $ANTLR start "tagAuthorDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:102:1: tagAuthorDefinitionRule : AUTORE COLON text= STRING ;
	public final void tagAuthorDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:103:5: ( AUTORE COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:103:7: AUTORE COLON text= STRING
			{
			match(input,AUTORE,FOLLOW_AUTORE_in_tagAuthorDefinitionRule550); 
			match(input,COLON,FOLLOW_COLON_in_tagAuthorDefinitionRule552); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagAuthorDefinitionRule556); 
			handler.addAuthor((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagAuthorDefinitionRule"



	// $ANTLR start "tagGenreDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:106:1: tagGenreDefinitionRule : GENERE COLON text= STRING ;
	public final void tagGenreDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:107:5: ( GENERE COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:107:7: GENERE COLON text= STRING
			{
			match(input,GENERE,FOLLOW_GENERE_in_tagGenreDefinitionRule575); 
			match(input,COLON,FOLLOW_COLON_in_tagGenreDefinitionRule577); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagGenreDefinitionRule581); 
			handler.addGenre((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagGenreDefinitionRule"



	// $ANTLR start "tagCompositionDateDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:110:1: tagCompositionDateDefinitionRule : DATA_DI_COMPOSIZIONE COLON text= STRING ;
	public final void tagCompositionDateDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:111:5: ( DATA_DI_COMPOSIZIONE COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:111:7: DATA_DI_COMPOSIZIONE COLON text= STRING
			{
			match(input,DATA_DI_COMPOSIZIONE,FOLLOW_DATA_DI_COMPOSIZIONE_in_tagCompositionDateDefinitionRule604); 
			match(input,COLON,FOLLOW_COLON_in_tagCompositionDateDefinitionRule606); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagCompositionDateDefinitionRule610); 
			handler.addCompositionDate((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagCompositionDateDefinitionRule"



	// $ANTLR start "tagPublicationYearDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:114:1: tagPublicationYearDefinitionRule : ANNO_DI_PUBBLICAZIONE COLON text= INT ;
	public final void tagPublicationYearDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:115:5: ( ANNO_DI_PUBBLICAZIONE COLON text= INT )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:115:7: ANNO_DI_PUBBLICAZIONE COLON text= INT
			{
			match(input,ANNO_DI_PUBBLICAZIONE,FOLLOW_ANNO_DI_PUBBLICAZIONE_in_tagPublicationYearDefinitionRule629); 
			match(input,COLON,FOLLOW_COLON_in_tagPublicationYearDefinitionRule631); 
			text=(Token)match(input,INT,FOLLOW_INT_in_tagPublicationYearDefinitionRule635); 
			handler.addPublicationYear((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPublicationYearDefinitionRule"



	// $ANTLR start "tagPublisherDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:118:1: tagPublisherDefinitionRule : EDITORE COLON text= STRING ;
	public final void tagPublisherDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:119:5: ( EDITORE COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:119:7: EDITORE COLON text= STRING
			{
			match(input,EDITORE,FOLLOW_EDITORE_in_tagPublisherDefinitionRule654); 
			match(input,COLON,FOLLOW_COLON_in_tagPublisherDefinitionRule656); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagPublisherDefinitionRule660); 
			handler.addPublisher((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPublisherDefinitionRule"



	// $ANTLR start "tagNarratorDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:122:1: tagNarratorDefinitionRule : NARRATORE COLON text= STRING ;
	public final void tagNarratorDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:123:5: ( NARRATORE COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:123:7: NARRATORE COLON text= STRING
			{
			match(input,NARRATORE,FOLLOW_NARRATORE_in_tagNarratorDefinitionRule679); 
			match(input,COLON,FOLLOW_COLON_in_tagNarratorDefinitionRule681); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagNarratorDefinitionRule685); 
			handler.addNarrator((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagNarratorDefinitionRule"



	// $ANTLR start "tagPagesDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:126:1: tagPagesDefinitionRule : NUMERO_PAGINE COLON text= INT ;
	public final void tagPagesDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:127:5: ( NUMERO_PAGINE COLON text= INT )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:127:7: NUMERO_PAGINE COLON text= INT
			{
			match(input,NUMERO_PAGINE,FOLLOW_NUMERO_PAGINE_in_tagPagesDefinitionRule704); 
			match(input,COLON,FOLLOW_COLON_in_tagPagesDefinitionRule706); 
			text=(Token)match(input,INT,FOLLOW_INT_in_tagPagesDefinitionRule710); 
			handler.addPages((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPagesDefinitionRule"



	// $ANTLR start "tagPriceDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:130:1: tagPriceDefinitionRule : PREZZO COLON text= STRING ;
	public final void tagPriceDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:131:5: ( PREZZO COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:131:7: PREZZO COLON text= STRING
			{
			match(input,PREZZO,FOLLOW_PREZZO_in_tagPriceDefinitionRule729); 
			match(input,COLON,FOLLOW_COLON_in_tagPriceDefinitionRule731); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagPriceDefinitionRule735); 
			handler.addPrice((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPriceDefinitionRule"



	// $ANTLR start "tagStructureDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:134:1: tagStructureDefinitionRule : STRUTTURA COLON text= STRING ;
	public final void tagStructureDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:135:5: ( STRUTTURA COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:135:7: STRUTTURA COLON text= STRING
			{
			match(input,STRUTTURA,FOLLOW_STRUTTURA_in_tagStructureDefinitionRule754); 
			match(input,COLON,FOLLOW_COLON_in_tagStructureDefinitionRule756); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagStructureDefinitionRule760); 
			handler.addStructure((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagStructureDefinitionRule"



	// $ANTLR start "tagPlotDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:138:1: tagPlotDefinitionRule : TRAMA COLON text= STRING ;
	public final void tagPlotDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:139:5: ( TRAMA COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:139:7: TRAMA COLON text= STRING
			{
			match(input,TRAMA,FOLLOW_TRAMA_in_tagPlotDefinitionRule779); 
			match(input,COLON,FOLLOW_COLON_in_tagPlotDefinitionRule781); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagPlotDefinitionRule785); 
			handler.addPlot((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagPlotDefinitionRule"



	// $ANTLR start "tagMessageDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:142:1: tagMessageDefinitionRule : MESSAGGIO_LANCIATO COLON text= STRING ;
	public final void tagMessageDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:143:5: ( MESSAGGIO_LANCIATO COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:143:7: MESSAGGIO_LANCIATO COLON text= STRING
			{
			match(input,MESSAGGIO_LANCIATO,FOLLOW_MESSAGGIO_LANCIATO_in_tagMessageDefinitionRule804); 
			match(input,COLON,FOLLOW_COLON_in_tagMessageDefinitionRule806); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagMessageDefinitionRule810); 
			handler.addMessage((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagMessageDefinitionRule"



	// $ANTLR start "tagCharactersDefinitionRule"
	// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:146:1: tagCharactersDefinitionRule : PERSONAGGI COLON text= STRING ;
	public final void tagCharactersDefinitionRule() throws RecognitionException {
		Token text=null;

		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:147:5: ( PERSONAGGI COLON text= STRING )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:147:7: PERSONAGGI COLON text= STRING
			{
			match(input,PERSONAGGI,FOLLOW_PERSONAGGI_in_tagCharactersDefinitionRule829); 
			match(input,COLON,FOLLOW_COLON_in_tagCharactersDefinitionRule831); 
			text=(Token)match(input,STRING,FOLLOW_STRING_in_tagCharactersDefinitionRule835); 
			handler.addCharacters((text!=null?text.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "tagCharactersDefinitionRule"

	// Delegated rules



	public static final BitSet FOLLOW_tagBgColor_in_startRule71 = new BitSet(new long[]{0x00001C001E080000L});
	public static final BitSet FOLLOW_tagFontType_in_startRule81 = new BitSet(new long[]{0x00001C001E000000L});
	public static final BitSet FOLLOW_tagMarginTop_in_startRule91 = new BitSet(new long[]{0x00001C000E000000L});
	public static final BitSet FOLLOW_tagMarginBottom_in_startRule101 = new BitSet(new long[]{0x00001C000C000000L});
	public static final BitSet FOLLOW_tagMarginLeft_in_startRule111 = new BitSet(new long[]{0x00001C0008000000L});
	public static final BitSet FOLLOW_tagMarginRight_in_startRule121 = new BitSet(new long[]{0x00001C0000000000L});
	public static final BitSet FOLLOW_tagTextAlign_in_startRule131 = new BitSet(new long[]{0x0000180000000000L});
	public static final BitSet FOLLOW_tagTextLineHeight_in_startRule141 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_tagCss_in_startRule151 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_bookRule_in_startRule160 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_EOF_in_startRule178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tagTitleDefinitionRule_in_bookRule199 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_tagAuthorDefinitionRule_in_bookRule206 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_tagGenreDefinitionRule_in_bookRule209 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_tagCompositionDateDefinitionRule_in_bookRule216 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_tagPublicationYearDefinitionRule_in_bookRule223 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_tagPublisherDefinitionRule_in_bookRule230 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_tagNarratorDefinitionRule_in_bookRule237 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_tagPagesDefinitionRule_in_bookRule244 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tagPriceDefinitionRule_in_bookRule251 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_tagStructureDefinitionRule_in_bookRule258 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_tagPlotDefinitionRule_in_bookRule265 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_tagMessageDefinitionRule_in_bookRule272 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_tagCharactersDefinitionRule_in_bookRule279 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_BGCOLOR_in_tagBgColor320 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagBgColor322 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagBgColor328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FONT_in_tagFontType343 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagFontType345 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagFontType351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MARGINTOP_in_tagMarginTop366 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagMarginTop368 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagMarginTop374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MARGINBOTTOM_in_tagMarginBottom389 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagMarginBottom391 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagMarginBottom397 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MARGINLEFT_in_tagMarginLeft414 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagMarginLeft416 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagMarginLeft422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MARGINRIGHT_in_tagMarginRight439 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagMarginRight441 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagMarginRight447 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTALIGN_in_tagTextAlign462 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagTextAlign464 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagTextAlign470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TEXTLINEHEIGHT_in_tagTextLineHeight485 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagTextLineHeight487 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagTextLineHeight493 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TITOLO_in_tagTitleDefinitionRule523 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagTitleDefinitionRule525 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagTitleDefinitionRule531 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AUTORE_in_tagAuthorDefinitionRule550 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagAuthorDefinitionRule552 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagAuthorDefinitionRule556 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GENERE_in_tagGenreDefinitionRule575 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagGenreDefinitionRule577 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagGenreDefinitionRule581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATA_DI_COMPOSIZIONE_in_tagCompositionDateDefinitionRule604 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagCompositionDateDefinitionRule606 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagCompositionDateDefinitionRule610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ANNO_DI_PUBBLICAZIONE_in_tagPublicationYearDefinitionRule629 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagPublicationYearDefinitionRule631 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INT_in_tagPublicationYearDefinitionRule635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EDITORE_in_tagPublisherDefinitionRule654 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagPublisherDefinitionRule656 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagPublisherDefinitionRule660 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NARRATORE_in_tagNarratorDefinitionRule679 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagNarratorDefinitionRule681 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagNarratorDefinitionRule685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUMERO_PAGINE_in_tagPagesDefinitionRule704 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagPagesDefinitionRule706 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_INT_in_tagPagesDefinitionRule710 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PREZZO_in_tagPriceDefinitionRule729 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagPriceDefinitionRule731 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagPriceDefinitionRule735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRUTTURA_in_tagStructureDefinitionRule754 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagStructureDefinitionRule756 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagStructureDefinitionRule760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRAMA_in_tagPlotDefinitionRule779 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagPlotDefinitionRule781 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagPlotDefinitionRule785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MESSAGGIO_LANCIATO_in_tagMessageDefinitionRule804 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagMessageDefinitionRule806 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagMessageDefinitionRule810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERSONAGGI_in_tagCharactersDefinitionRule829 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_COLON_in_tagCharactersDefinitionRule831 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_STRING_in_tagCharactersDefinitionRule835 = new BitSet(new long[]{0x0000000000000002L});
}

