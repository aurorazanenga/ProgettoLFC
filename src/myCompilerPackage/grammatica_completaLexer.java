// $ANTLR 3.5.1 C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g 2024-07-06 18:08:20

    package myCompilerPackage;   


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class grammatica_completaLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public grammatica_completaLexer() {} 
	public grammatica_completaLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public grammatica_completaLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g"; }

	// $ANTLR start "TAG_OPEN"
	public final void mTAG_OPEN() throws RecognitionException {
		try {
			int _type = TAG_OPEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:150:10: ( '<' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:150:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG_OPEN"

	// $ANTLR start "TAG_CLOSE"
	public final void mTAG_CLOSE() throws RecognitionException {
		try {
			int _type = TAG_CLOSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:151:11: ( '>' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:151:13: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG_CLOSE"

	// $ANTLR start "TAG_TITLE"
	public final void mTAG_TITLE() throws RecognitionException {
		try {
			int _type = TAG_TITLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:152:10: ( 'title' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:152:12: 'title'
			{
			match("title"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG_TITLE"

	// $ANTLR start "TAG_HEAD"
	public final void mTAG_HEAD() throws RecognitionException {
		try {
			int _type = TAG_HEAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:153:9: ( 'head' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:153:11: 'head'
			{
			match("head"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAG_HEAD"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:154:8: ( '/' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:154:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:155:5: ( ';' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:155:7: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:156:5: ( '.' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:156:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:157:7: ( ':' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:157:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:158:7: ( ',' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:158:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "TRATTINO"
	public final void mTRATTINO() throws RecognitionException {
		try {
			int _type = TRATTINO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:159:9: ( '-' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:159:11: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRATTINO"

	// $ANTLR start "EURO"
	public final void mEURO() throws RecognitionException {
		try {
			int _type = EURO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:160:7: ( '€' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:160:9: '€'
			{
			match('\u20AC'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EURO"

	// $ANTLR start "AUTORE"
	public final void mAUTORE() throws RecognitionException {
		try {
			int _type = AUTORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:162:12: ( 'Autore' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:162:14: 'Autore'
			{
			match("Autore"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTORE"

	// $ANTLR start "TITOLO"
	public final void mTITOLO() throws RecognitionException {
		try {
			int _type = TITOLO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:163:12: ( 'Titolo' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:163:14: 'Titolo'
			{
			match("Titolo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TITOLO"

	// $ANTLR start "BGCOLOR"
	public final void mBGCOLOR() throws RecognitionException {
		try {
			int _type = BGCOLOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:164:12: ( 'BgColor' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:164:14: 'BgColor'
			{
			match("BgColor"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BGCOLOR"

	// $ANTLR start "MARGINTOP"
	public final void mMARGINTOP() throws RecognitionException {
		try {
			int _type = MARGINTOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:165:11: ( 'margin-top' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:165:13: 'margin-top'
			{
			match("margin-top"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARGINTOP"

	// $ANTLR start "MARGINBOTTOM"
	public final void mMARGINBOTTOM() throws RecognitionException {
		try {
			int _type = MARGINBOTTOM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:166:14: ( 'margin-bottom' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:166:16: 'margin-bottom'
			{
			match("margin-bottom"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARGINBOTTOM"

	// $ANTLR start "MARGINLEFT"
	public final void mMARGINLEFT() throws RecognitionException {
		try {
			int _type = MARGINLEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:167:12: ( 'margin-left' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:167:14: 'margin-left'
			{
			match("margin-left"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARGINLEFT"

	// $ANTLR start "MARGINRIGHT"
	public final void mMARGINRIGHT() throws RecognitionException {
		try {
			int _type = MARGINRIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:168:13: ( 'margin-right' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:168:15: 'margin-right'
			{
			match("margin-right"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MARGINRIGHT"

	// $ANTLR start "TEXTALIGN"
	public final void mTEXTALIGN() throws RecognitionException {
		try {
			int _type = TEXTALIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:169:12: ( 'text-align' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:169:14: 'text-align'
			{
			match("text-align"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTALIGN"

	// $ANTLR start "TEXTLINEHEIGHT"
	public final void mTEXTLINEHEIGHT() throws RecognitionException {
		try {
			int _type = TEXTLINEHEIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:170:16: ( 'line-height' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:170:18: 'line-height'
			{
			match("line-height"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEXTLINEHEIGHT"

	// $ANTLR start "FONT"
	public final void mFONT() throws RecognitionException {
		try {
			int _type = FONT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:171:6: ( 'fontType' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:171:8: 'fontType'
			{
			match("fontType"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FONT"

	// $ANTLR start "CSS"
	public final void mCSS() throws RecognitionException {
		try {
			int _type = CSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:172:5: ( 'addCss' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:172:7: 'addCss'
			{
			match("addCss"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CSS"

	// $ANTLR start "GENERE"
	public final void mGENERE() throws RecognitionException {
		try {
			int _type = GENERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:174:12: ( 'Genere' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:174:14: 'Genere'
			{
			match("Genere"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GENERE"

	// $ANTLR start "DATA_DI_COMPOSIZIONE"
	public final void mDATA_DI_COMPOSIZIONE() throws RecognitionException {
		try {
			int _type = DATA_DI_COMPOSIZIONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:175:21: ( 'Data_di_composizione' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:175:23: 'Data_di_composizione'
			{
			match("Data_di_composizione"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATA_DI_COMPOSIZIONE"

	// $ANTLR start "ANNO_DI_PUBBLICAZIONE"
	public final void mANNO_DI_PUBBLICAZIONE() throws RecognitionException {
		try {
			int _type = ANNO_DI_PUBBLICAZIONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:176:22: ( 'Anno_di_pubblicazione' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:176:24: 'Anno_di_pubblicazione'
			{
			match("Anno_di_pubblicazione"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANNO_DI_PUBBLICAZIONE"

	// $ANTLR start "EDITORE"
	public final void mEDITORE() throws RecognitionException {
		try {
			int _type = EDITORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:177:8: ( 'Editore' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:177:10: 'Editore'
			{
			match("Editore"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EDITORE"

	// $ANTLR start "NARRATORE"
	public final void mNARRATORE() throws RecognitionException {
		try {
			int _type = NARRATORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:178:10: ( 'Narratore' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:178:12: 'Narratore'
			{
			match("Narratore"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NARRATORE"

	// $ANTLR start "NUMERO_PAGINE"
	public final void mNUMERO_PAGINE() throws RecognitionException {
		try {
			int _type = NUMERO_PAGINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:179:14: ( 'Pagine' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:179:16: 'Pagine'
			{
			match("Pagine"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMERO_PAGINE"

	// $ANTLR start "PREZZO"
	public final void mPREZZO() throws RecognitionException {
		try {
			int _type = PREZZO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:180:8: ( 'Prezzo' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:180:10: 'Prezzo'
			{
			match("Prezzo"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PREZZO"

	// $ANTLR start "STRUTTURA"
	public final void mSTRUTTURA() throws RecognitionException {
		try {
			int _type = STRUTTURA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:181:10: ( 'Struttura' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:181:12: 'Struttura'
			{
			match("Struttura"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUTTURA"

	// $ANTLR start "TRAMA"
	public final void mTRAMA() throws RecognitionException {
		try {
			int _type = TRAMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:182:10: ( 'Trama' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:182:12: 'Trama'
			{
			match("Trama"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRAMA"

	// $ANTLR start "MESSAGGIO_LANCIATO"
	public final void mMESSAGGIO_LANCIATO() throws RecognitionException {
		try {
			int _type = MESSAGGIO_LANCIATO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:183:19: ( 'Messaggio' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:183:21: 'Messaggio'
			{
			match("Messaggio"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MESSAGGIO_LANCIATO"

	// $ANTLR start "PERSONAGGI"
	public final void mPERSONAGGI() throws RecognitionException {
		try {
			int _type = PERSONAGGI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:184:11: ( 'Personaggi' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:184:13: 'Personaggi'
			{
			match("Personaggi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERSONAGGI"

	// $ANTLR start "LIBRO"
	public final void mLIBRO() throws RecognitionException {
		try {
			int _type = LIBRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:185:7: ( 'libro' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:185:9: 'libro'
			{
			match("libro"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIBRO"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:187:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:187:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:187:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:189:5: ( ( '0' .. '9' )+ )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:189:7: ( '0' .. '9' )+
			{
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:189:7: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT )
			int alt9=3;
			alt9 = dfa9.predict(input);
			switch (alt9) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:7: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
					{
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:7: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match('.'); 
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:23: ( '0' .. '9' )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop4;
						}
					}

					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:35: ( EXPONENT )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='E'||LA5_0=='e') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:192:35: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:193:7: '.' ( '0' .. '9' )+ ( EXPONENT )?
					{
					match('.'); 
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:193:11: ( '0' .. '9' )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:193:23: ( EXPONENT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0=='E'||LA7_0=='e') ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:193:23: EXPONENT
							{
							mEXPONENT(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:194:7: ( '0' .. '9' )+ EXPONENT
					{
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:194:7: ( '0' .. '9' )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					mEXPONENT(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:198:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='/') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='/') ) {
					alt13=1;
				}
				else if ( (LA13_1=='*') ) {
					alt13=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:198:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:198:12: (~ ( '\\n' | '\\r' ) )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( ((LA10_0 >= '\u0000' && LA10_0 <= '\t')||(LA10_0 >= '\u000B' && LA10_0 <= '\f')||(LA10_0 >= '\u000E' && LA10_0 <= '\uFFFF')) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop10;
						}
					}

					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:198:26: ( '\\r' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0=='\r') ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:198:26: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					_channel=HIDDEN;
					}
					break;
				case 2 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:199:7: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:199:12: ( options {greedy=false; } : . )*
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0=='*') ) {
							int LA12_1 = input.LA(2);
							if ( (LA12_1=='/') ) {
								alt12=2;
							}
							else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
								alt12=1;
							}

						}
						else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:199:40: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop12;
						}
					}

					match("*/"); 

					_channel=HIDDEN;
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:202:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:202:7: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:205:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:205:7: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:205:11: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop14:
			while (true) {
				int alt14=3;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\\') ) {
					alt14=1;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '!')||(LA14_0 >= '#' && LA14_0 <= '[')||(LA14_0 >= ']' && LA14_0 <= '\uFFFF')) ) {
					alt14=2;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:205:13: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:205:23: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop14;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:208:6: ( '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\'' )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:208:8: '\\'' ( ESC_SEQ |~ ( '\\'' | '\\\\' ) ) '\\''
			{
			match('\''); 
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:208:13: ( ESC_SEQ |~ ( '\\'' | '\\\\' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\\') ) {
				alt15=1;
			}
			else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:208:15: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:208:25: ~ ( '\\'' | '\\\\' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR"

	// $ANTLR start "EXPONENT"
	public final void mEXPONENT() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:213:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:213:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:213:22: ( '+' | '-' )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='+'||LA16_0=='-') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:213:33: ( '0' .. '9' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPONENT"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:216:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:220:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='\\') ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1=='\"'||LA18_1=='\''||LA18_1=='\\'||LA18_1=='b'||LA18_1=='f'||LA18_1=='n'||LA18_1=='r'||LA18_1=='t') ) {
					alt18=1;
				}
				else if ( (LA18_1=='u') ) {
					alt18=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:220:7: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:221:7: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:226:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:226:7: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:8: ( TAG_OPEN | TAG_CLOSE | TAG_TITLE | TAG_HEAD | SLASH | SC | DOT | COLON | COMMA | TRATTINO | EURO | AUTORE | TITOLO | BGCOLOR | MARGINTOP | MARGINBOTTOM | MARGINLEFT | MARGINRIGHT | TEXTALIGN | TEXTLINEHEIGHT | FONT | CSS | GENERE | DATA_DI_COMPOSIZIONE | ANNO_DI_PUBBLICAZIONE | EDITORE | NARRATORE | NUMERO_PAGINE | PREZZO | STRUTTURA | TRAMA | MESSAGGIO_LANCIATO | PERSONAGGI | LIBRO | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR )
		int alt19=41;
		alt19 = dfa19.predict(input);
		switch (alt19) {
			case 1 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:10: TAG_OPEN
				{
				mTAG_OPEN(); 

				}
				break;
			case 2 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:19: TAG_CLOSE
				{
				mTAG_CLOSE(); 

				}
				break;
			case 3 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:29: TAG_TITLE
				{
				mTAG_TITLE(); 

				}
				break;
			case 4 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:39: TAG_HEAD
				{
				mTAG_HEAD(); 

				}
				break;
			case 5 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:48: SLASH
				{
				mSLASH(); 

				}
				break;
			case 6 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:54: SC
				{
				mSC(); 

				}
				break;
			case 7 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:57: DOT
				{
				mDOT(); 

				}
				break;
			case 8 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:61: COLON
				{
				mCOLON(); 

				}
				break;
			case 9 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:67: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 10 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:73: TRATTINO
				{
				mTRATTINO(); 

				}
				break;
			case 11 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:82: EURO
				{
				mEURO(); 

				}
				break;
			case 12 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:87: AUTORE
				{
				mAUTORE(); 

				}
				break;
			case 13 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:94: TITOLO
				{
				mTITOLO(); 

				}
				break;
			case 14 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:101: BGCOLOR
				{
				mBGCOLOR(); 

				}
				break;
			case 15 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:109: MARGINTOP
				{
				mMARGINTOP(); 

				}
				break;
			case 16 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:119: MARGINBOTTOM
				{
				mMARGINBOTTOM(); 

				}
				break;
			case 17 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:132: MARGINLEFT
				{
				mMARGINLEFT(); 

				}
				break;
			case 18 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:143: MARGINRIGHT
				{
				mMARGINRIGHT(); 

				}
				break;
			case 19 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:155: TEXTALIGN
				{
				mTEXTALIGN(); 

				}
				break;
			case 20 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:165: TEXTLINEHEIGHT
				{
				mTEXTLINEHEIGHT(); 

				}
				break;
			case 21 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:180: FONT
				{
				mFONT(); 

				}
				break;
			case 22 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:185: CSS
				{
				mCSS(); 

				}
				break;
			case 23 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:189: GENERE
				{
				mGENERE(); 

				}
				break;
			case 24 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:196: DATA_DI_COMPOSIZIONE
				{
				mDATA_DI_COMPOSIZIONE(); 

				}
				break;
			case 25 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:217: ANNO_DI_PUBBLICAZIONE
				{
				mANNO_DI_PUBBLICAZIONE(); 

				}
				break;
			case 26 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:239: EDITORE
				{
				mEDITORE(); 

				}
				break;
			case 27 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:247: NARRATORE
				{
				mNARRATORE(); 

				}
				break;
			case 28 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:257: NUMERO_PAGINE
				{
				mNUMERO_PAGINE(); 

				}
				break;
			case 29 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:271: PREZZO
				{
				mPREZZO(); 

				}
				break;
			case 30 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:278: STRUTTURA
				{
				mSTRUTTURA(); 

				}
				break;
			case 31 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:288: TRAMA
				{
				mTRAMA(); 

				}
				break;
			case 32 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:294: MESSAGGIO_LANCIATO
				{
				mMESSAGGIO_LANCIATO(); 

				}
				break;
			case 33 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:313: PERSONAGGI
				{
				mPERSONAGGI(); 

				}
				break;
			case 34 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:324: LIBRO
				{
				mLIBRO(); 

				}
				break;
			case 35 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:330: ID
				{
				mID(); 

				}
				break;
			case 36 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:333: INT
				{
				mINT(); 

				}
				break;
			case 37 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:337: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 38 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:343: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 39 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:351: WS
				{
				mWS(); 

				}
				break;
			case 40 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:354: STRING
				{
				mSTRING(); 

				}
				break;
			case 41 :
				// C:\\Users\\auror\\Desktop\\lcf2023\\src\\myCompilerPackage\\grammatica_completa.g:1:361: CHAR
				{
				mCHAR(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA9_eotS =
		"\5\uffff";
	static final String DFA9_eofS =
		"\5\uffff";
	static final String DFA9_minS =
		"\2\56\3\uffff";
	static final String DFA9_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA9_specialS =
		"\5\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "191:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '0' .. '9' )+ EXPONENT );";
		}
	}

	static final String DFA19_eotS =
		"\3\uffff\2\32\1\43\1\uffff\1\44\4\uffff\16\32\1\uffff\1\70\3\uffff\3\32"+
		"\4\uffff\22\32\1\uffff\30\32\1\147\23\32\1\173\2\uffff\3\32\1\177\2\32"+
		"\1\uffff\1\u0082\13\32\1\uffff\1\u008e\1\32\1\u0090\1\uffff\2\32\1\uffff"+
		"\1\32\1\u0094\1\u0095\3\32\1\u0099\1\u009a\3\32\1\uffff\1\32\1\uffff\1"+
		"\u009f\1\uffff\1\32\2\uffff\1\32\1\u00a6\1\32\2\uffff\4\32\5\uffff\1\u00ac"+
		"\1\32\1\uffff\5\32\1\uffff\1\32\1\u00b4\1\32\1\u00b6\1\u00b7\2\32\1\uffff"+
		"\1\u00ba\2\uffff\2\32\1\uffff\21\32\1\u00ce\1\u00cf\2\uffff";
	static final String DFA19_eofS =
		"\u00d0\uffff";
	static final String DFA19_minS =
		"\1\11\2\uffff\2\145\1\52\1\uffff\1\60\4\uffff\1\156\1\151\1\147\1\141"+
		"\1\151\1\157\1\144\1\145\1\141\1\144\2\141\1\164\1\145\1\uffff\1\56\3"+
		"\uffff\1\164\1\170\1\141\4\uffff\1\164\1\156\1\164\1\141\1\103\1\162\1"+
		"\142\1\156\1\144\1\156\1\164\1\151\1\162\1\147\1\145\2\162\1\163\1\uffff"+
		"\1\154\1\164\1\144\3\157\1\155\1\157\1\147\1\145\1\162\1\164\1\103\1\145"+
		"\1\141\1\164\1\162\1\151\1\172\1\163\1\165\1\163\1\145\1\55\1\60\1\162"+
		"\1\137\1\154\1\141\1\154\1\151\1\55\1\157\1\124\1\163\1\162\1\137\1\157"+
		"\1\141\1\156\1\172\1\157\1\164\1\141\1\60\2\uffff\1\145\1\144\1\157\1"+
		"\60\1\157\1\156\1\uffff\1\60\1\171\1\163\1\145\1\144\1\162\1\164\1\145"+
		"\1\157\1\156\1\164\1\147\1\uffff\1\60\1\151\1\60\1\uffff\1\162\1\55\1"+
		"\uffff\1\160\2\60\1\151\1\145\1\157\2\60\1\141\1\165\1\147\1\uffff\1\137"+
		"\1\uffff\1\60\1\142\1\145\2\uffff\1\137\1\60\1\162\2\uffff\1\147\1\162"+
		"\1\151\1\160\5\uffff\1\60\1\143\1\uffff\1\145\1\147\1\141\1\157\1\165"+
		"\1\uffff\1\157\1\60\1\151\2\60\1\142\1\155\1\uffff\1\60\2\uffff\1\142"+
		"\1\160\1\uffff\1\154\1\157\1\151\1\163\1\143\1\151\1\141\2\172\2\151\2"+
		"\157\2\156\2\145\2\60\2\uffff";
	static final String DFA19_maxS =
		"\1\u20ac\2\uffff\1\151\1\145\1\57\1\uffff\1\71\4\uffff\1\165\1\162\1\147"+
		"\1\141\1\151\1\157\1\144\1\145\1\141\1\144\1\141\1\162\1\164\1\145\1\uffff"+
		"\1\145\3\uffff\1\164\1\170\1\141\4\uffff\1\164\1\156\1\164\1\141\1\103"+
		"\1\162\2\156\1\144\1\156\1\164\1\151\1\162\1\147\1\145\2\162\1\163\1\uffff"+
		"\1\154\1\164\1\144\3\157\1\155\1\157\1\147\1\145\1\162\1\164\1\103\1\145"+
		"\1\141\1\164\1\162\1\151\1\172\1\163\1\165\1\163\1\145\1\55\1\172\1\162"+
		"\1\137\1\154\1\141\1\154\1\151\1\55\1\157\1\124\1\163\1\162\1\137\1\157"+
		"\1\141\1\156\1\172\1\157\1\164\1\141\1\172\2\uffff\1\145\1\144\1\157\1"+
		"\172\1\157\1\156\1\uffff\1\172\1\171\1\163\1\145\1\144\1\162\1\164\1\145"+
		"\1\157\1\156\1\164\1\147\1\uffff\1\172\1\151\1\172\1\uffff\1\162\1\55"+
		"\1\uffff\1\160\2\172\1\151\1\145\1\157\2\172\1\141\1\165\1\147\1\uffff"+
		"\1\137\1\uffff\1\172\1\164\1\145\2\uffff\1\137\1\172\1\162\2\uffff\1\147"+
		"\1\162\1\151\1\160\5\uffff\1\172\1\143\1\uffff\1\145\1\147\1\141\1\157"+
		"\1\165\1\uffff\1\157\1\172\1\151\2\172\1\142\1\155\1\uffff\1\172\2\uffff"+
		"\1\142\1\160\1\uffff\1\154\1\157\1\151\1\163\1\143\1\151\1\141\2\172\2"+
		"\151\2\157\2\156\2\145\2\172\2\uffff";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\1\2\3\uffff\1\6\1\uffff\1\10\1\11\1\12\1\13\16\uffff\1\43"+
		"\1\uffff\1\47\1\50\1\51\3\uffff\1\46\1\5\1\7\1\45\22\uffff\1\44\55\uffff"+
		"\1\23\1\4\6\uffff\1\24\14\uffff\1\3\3\uffff\1\37\2\uffff\1\42\13\uffff"+
		"\1\14\1\uffff\1\15\3\uffff\1\26\1\27\3\uffff\1\34\1\35\4\uffff\1\16\1"+
		"\17\1\20\1\21\1\22\2\uffff\1\32\5\uffff\1\25\7\uffff\1\33\1\uffff\1\36"+
		"\1\40\2\uffff\1\41\23\uffff\1\30\1\31";
	static final String DFA19_specialS =
		"\u00d0\uffff}>";
	static final String[] DFA19_transitionS = {
			"\2\34\2\uffff\1\34\22\uffff\1\34\1\uffff\1\35\4\uffff\1\36\4\uffff\1"+
			"\11\1\12\1\7\1\5\12\33\1\10\1\6\1\1\1\uffff\1\2\2\uffff\1\14\1\16\1\32"+
			"\1\24\1\25\1\32\1\23\5\32\1\31\1\26\1\32\1\27\2\32\1\30\1\15\6\32\4\uffff"+
			"\1\32\1\uffff\1\22\4\32\1\21\1\32\1\4\3\32\1\20\1\17\6\32\1\3\6\32\u2031"+
			"\uffff\1\13",
			"",
			"",
			"\1\40\3\uffff\1\37",
			"\1\41",
			"\1\42\4\uffff\1\42",
			"",
			"\12\45",
			"",
			"",
			"",
			"",
			"\1\47\6\uffff\1\46",
			"\1\50\10\uffff\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"\1\63\3\uffff\1\65\14\uffff\1\64",
			"\1\66",
			"\1\67",
			"",
			"\1\45\1\uffff\12\33\13\uffff\1\45\37\uffff\1\45",
			"",
			"",
			"",
			"\1\71",
			"\1\72",
			"\1\73",
			"",
			"",
			"",
			"",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"\1\103\13\uffff\1\102",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"\1\126",
			"\1\127",
			"\1\130",
			"\1\131",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\143",
			"\1\144",
			"\1\145",
			"\1\146",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\150",
			"\1\151",
			"\1\152",
			"\1\153",
			"\1\154",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\164",
			"\1\165",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"",
			"\1\174",
			"\1\175",
			"\1\176",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u0080",
			"\1\u0081",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u0083",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u008f",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"\1\u0091",
			"\1\u0092",
			"",
			"\1\u0093",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u0096",
			"\1\u0097",
			"\1\u0098",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"",
			"\1\u009e",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u00a1\11\uffff\1\u00a2\5\uffff\1\u00a3\1\uffff\1\u00a0",
			"\1\u00a4",
			"",
			"",
			"\1\u00a5",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u00a7",
			"",
			"",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"",
			"",
			"",
			"",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u00ad",
			"",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"",
			"\1\u00b3",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u00b5",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\1\u00b8",
			"\1\u00b9",
			"",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			"",
			"\1\u00bb",
			"\1\u00bc",
			"",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
			"",
			""
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( TAG_OPEN | TAG_CLOSE | TAG_TITLE | TAG_HEAD | SLASH | SC | DOT | COLON | COMMA | TRATTINO | EURO | AUTORE | TITOLO | BGCOLOR | MARGINTOP | MARGINBOTTOM | MARGINLEFT | MARGINRIGHT | TEXTALIGN | TEXTLINEHEIGHT | FONT | CSS | GENERE | DATA_DI_COMPOSIZIONE | ANNO_DI_PUBBLICAZIONE | EDITORE | NARRATORE | NUMERO_PAGINE | PREZZO | STRUTTURA | TRAMA | MESSAGGIO_LANCIATO | PERSONAGGI | LIBRO | ID | INT | FLOAT | COMMENT | WS | STRING | CHAR );";
		}
	}

}
