package lexico;

import static lexico.Token.BEGIN;
import static lexico.Token.COMA;
import static lexico.Token.CONST_INT;
import static lexico.Token.CONST_REAL;
import static lexico.Token.CONST_STR;
import static lexico.Token.C_A;
import static lexico.Token.DECLARE;
import static lexico.Token.ELSE;
import static lexico.Token.END;
import static lexico.Token.ENDDECLARE;
import static lexico.Token.ERROR;
import static lexico.Token.ESPACIO;
import static lexico.Token.ESPCHAR;
import static lexico.Token.ID;
import static lexico.Token.IF;
import static lexico.Token.L_A;
import static lexico.Token.L_C;
import static lexico.Token.OP_ASIGN;
import static lexico.Token.OP_COMPARACION;
import static lexico.Token.OP_DIV;
import static lexico.Token.OP_LOG;
import static lexico.Token.OP_MULT;
import static lexico.Token.OP_RES;
import static lexico.Token.OP_SUM;
import static lexico.Token.PRINT;
import static lexico.Token.P_A;
import static lexico.Token.P_C;
import static lexico.Token.TIPO;
import static lexico.Token.WHILE;

// See https://github.com/jflex-de/jflex/issues/222
class Lexico {

	/** This character denotes the end of file. */
	public static final int YYEOF = -1;

	/** Initial size of the lookahead buffer. */
	private static final int ZZ_BUFFERSIZE = 16384;

	// Lexical states.
	public static final int YYINITIAL = 0;

	/**
	 * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
	 * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l at the
	 * beginning of a line l is of the form l = 2*k, k a non negative integer
	 */
	private static final int ZZ_LEXSTATE[] = { 0, 0 };

	/**
	 * Top-level table for translating characters to character classes
	 */
	private static final int[] ZZ_CMAP_TOP = zzUnpackcmap_top();

	private static final String ZZ_CMAP_TOP_PACKED_0 = "\1\0\1\u0100\u10fe\u0200";

	private static int[] zzUnpackcmap_top() {
		int[] result = new int[4352];
		int offset = 0;
		offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackcmap_top(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Second-level tables for translating characters to character classes
	 */
	private static final int[] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

	private static final String ZZ_CMAP_BLOCKS_PACKED_0 = "\11\0\2\1\25\0\1\2\1\3\1\4\5\0\1\5"
			+ "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\15" + "\1\16\1\0\1\17\1\20\1\21\1\3\1\0\1\22"
			+ "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32" + "\2\33\1\34\1\35\1\36\1\37\1\40\1\33\1\41"
			+ "\1\42\1\43\2\33\1\44\3\33\1\45\1\0\1\6" + "\1\0\1\46\1\0\1\47\1\23\1\24\1\50\1\26"
			+ "\1\27\1\30\1\31\1\32\2\33\1\34\1\35\1\51" + "\1\52\1\40\1\33\1\53\1\42\1\54\2\33\1\44"
			+ "\3\33\1\55\1\56\1\57\43\0\1\3\35\0\1\3" + "\2\0\1\3\155\0\2\60\115\0\1\61\u0180\0";

	private static int[] zzUnpackcmap_blocks() {
		int[] result = new int[768];
		int offset = 0;
		offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackcmap_blocks(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates DFA states to action switch labels.
	 */
	private static final int[] ZZ_ACTION = zzUnpackAction();

	private static final String ZZ_ACTION_PACKED_0 = "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"
			+ "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15" + "\1\14\13\16\1\17\5\20\1\21\1\20\1\22\1\1"
			+ "\1\0\1\23\1\0\1\14\6\16\1\24\4\16\1\24" + "\1\0\1\25\3\16\1\0\4\16\1\0\1\16\2\0"
			+ "\1\16\1\0\1\16\2\26\1\0\4\16\1\0\1\16" + "\2\0\1\16\1\0\1\16\1\0\1\16\1\27\1\16"
			+ "\2\30\2\31\2\0\1\16\1\0\2\16\2\0\1\32" + "\1\0\1\16\1\27\2\0\1\16\2\0\1\16\2\0"
			+ "\1\33\1\0\1\34\1\0\1\35";

	private static int[] zzUnpackAction() {
		int[] result = new int[118];
		int offset = 0;
		offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAction(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/**
	 * Translates a state to a row index in the transition table
	 */
	private static final int[] ZZ_ROWMAP = zzUnpackRowMap();

	private static final String ZZ_ROWMAP_PACKED_0 = "\0\0\0\62\0\62\0\62\0\144\0\62\0\62\0\62"
			+ "\0\62\0\62\0\62\0\62\0\226\0\310\0\372\0\62"
			+ "\0\u012c\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\u028a"
			+ "\0\u02bc\0\u02ee\0\u0320\0\u0352\0\62\0\u015e\0\u01f4\0\u02bc"
			+ "\0\u02ee\0\u01c2\0\62\0\62\0\62\0\u0384\0\144\0\62"
			+ "\0\u03b6\0\62\0\u03e8\0\u041a\0\u044c\0\u047e\0\u04b0\0\u04e2"
			+ "\0\u01c2\0\u0514\0\u0546\0\u0578\0\u05aa\0\62\0\u05dc\0\u03b6"
			+ "\0\u060e\0\u0640\0\u0672\0\u06a4\0\u06d6\0\u0708\0\u073a\0\u076c"
			+ "\0\u079e\0\u07d0\0\u0802\0\u0834\0\u0866\0\u0898\0\u08ca\0\u01c2"
			+ "\0\62\0\u08fc\0\u092e\0\u0960\0\u0992\0\u09c4\0\u09f6\0\u0a28"
			+ "\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\u0b22\0\u0b54\0\u0b86\0\u01c2"
			+ "\0\u0bb8\0\u01c2\0\62\0\u01c2\0\62\0\u0bea\0\u0c1c\0\u0c4e"
			+ "\0\u0c80\0\u0cb2\0\u0ce4\0\u0d16\0\u0d48\0\u01c2\0\u0d7a\0\u0dac"
			+ "\0\62\0\u0dde\0\u0e10\0\u0e42\0\u0e74\0\u0ea6\0\u0ed8\0\u0f0a"
			+ "\0\u0f3c\0\u01c2\0\u0f6e\0\62\0\u0fa0\0\62";

	private static int[] zzUnpackRowMap() {
		int[] result = new int[118];
		int offset = 0;
		offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackRowMap(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int high = packed.charAt(i++) << 16;
			result[j++] = high | packed.charAt(i++);
		}
		return j;
	}

	/**
	 * The transition table of the DFA
	 */
	private static final int[] ZZ_TRANS = zzUnpackTrans();

	private static final String ZZ_TRANS_PACKED_0 = "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"
			+ "\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17" + "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"
			+ "\2\24\1\30\3\24\1\31\1\32\1\33\3\24\1\34" + "\1\35\1\2\1\36\1\37\1\40\1\41\2\42\1\43"
			+ "\1\44\1\45\1\46\1\2\64\0\2\47\1\50\4\0" + "\1\47\1\0\1\47\1\0\1\47\4\0\23\47\2\0"
			+ "\6\47\1\0\1\47\16\0\1\51\1\0\1\15\64\0" + "\1\20\61\0\2\52\60\0\1\52\56\0\1\24\4\0"
			+ "\14\24\1\53\6\24\1\0\3\24\1\53\3\24\22\0" + "\1\24\4\0\4\24\1\54\16\24\1\0\7\24\22\0"
			+ "\1\24\4\0\23\24\1\0\7\24\22\0\1\24\4\0" + "\4\24\1\55\16\24\1\0\7\24\22\0\1\24\4\0"
			+ "\12\24\1\56\1\24\1\57\6\24\1\0\3\24\1\57" + "\3\24\22\0\1\24\4\0\12\24\1\60\10\24\1\0"
			+ "\7\24\22\0\1\24\4\0\5\24\1\61\6\24\1\62" + "\6\24\1\0\3\24\1\62\3\24\22\0\1\24\4\0"
			+ "\15\24\1\63\5\24\1\0\4\24\1\63\2\24\22\0" + "\1\24\4\0\17\24\1\42\3\24\1\0\5\24\1\42"
			+ "\1\24\22\0\1\24\4\0\17\24\1\64\3\24\1\0" + "\5\24\1\64\1\24\22\0\1\24\4\0\7\24\1\65"
			+ "\13\24\1\0\7\24\34\0\1\66\6\0\1\67\12\0" + "\1\67\25\0\1\70\61\0\1\24\4\0\3\24\1\42"
			+ "\17\24\1\0\2\24\1\42\4\24\22\0\1\24\4\0" + "\6\24\1\71\14\24\1\0\7\24\22\0\1\24\4\0"
			+ "\2\24\1\72\20\24\1\0\7\24\22\0\1\24\4\0" + "\20\24\1\73\2\24\1\0\7\24\4\0\1\74\15\0"
			+ "\1\24\4\0\3\24\1\75\17\24\1\0\2\24\1\75" + "\4\24\22\0\1\24\4\0\15\24\1\76\5\24\1\0"
			+ "\4\24\1\76\2\24\22\0\1\24\4\0\21\24\1\77" + "\1\24\1\0\6\24\1\77\22\0\1\24\4\0\21\24"
			+ "\1\42\1\24\1\0\6\24\1\42\22\0\1\24\4\0" + "\10\24\1\100\12\24\1\0\7\24\3\0\1\101\16\0"
			+ "\1\24\4\0\10\24\1\102\12\24\1\0\7\24\3\0" + "\1\103\44\0\1\104\10\0\1\104\22\0\1\24\4\0"
			+ "\10\24\1\105\12\24\1\0\7\24\3\0\1\106\16\0" + "\1\24\4\0\12\24\1\107\10\24\1\0\7\24\22\0"
			+ "\1\24\4\0\4\24\1\110\16\24\1\0\7\24\33\0" + "\1\111\46\0\1\112\1\0\1\24\4\0\3\24\1\113"
			+ "\17\24\1\0\2\24\1\113\4\24\22\0\1\24\4\0" + "\1\114\22\24\1\0\1\24\1\114\5\24\22\0\1\24"
			+ "\4\0\4\24\1\115\16\24\1\0\7\24\22\0\1\24" + "\4\0\14\24\1\116\6\24\1\0\3\24\1\116\3\24"
			+ "\43\0\1\117\12\0\1\117\25\0\1\24\4\0\12\24" + "\1\120\10\24\1\0\7\24\41\0\1\121\53\0\1\122"
			+ "\50\0\1\24\4\0\14\24\1\123\6\24\1\0\3\24" + "\1\123\3\24\43\0\1\124\12\0\1\124\25\0\1\24"
			+ "\4\0\1\125\22\24\1\0\1\24\1\125\5\24\45\0" + "\1\126\36\0\1\24\4\0\4\24\1\127\16\24\1\0"
			+ "\7\24\22\0\1\24\4\0\21\24\1\130\1\24\1\0" + "\6\24\1\130\22\0\1\24\4\0\6\24\1\131\14\24"
			+ "\1\0\7\24\22\0\1\24\4\0\21\24\1\132\1\24" + "\1\0\6\24\1\132\50\0\1\133\10\0\1\133\22\0"
			+ "\1\24\4\0\4\24\1\134\16\24\1\0\7\24\33\0" + "\1\135\63\0\1\136\44\0\1\137\1\0\1\24\4\0"
			+ "\23\24\1\0\7\24\20\0\1\137\63\0\1\24\4\0" + "\17\24\1\140\3\24\1\0\5\24\1\140\1\24\46\0"
			+ "\1\141\11\0\1\141\23\0\1\24\4\0\2\24\1\142" + "\20\24\1\0\7\24\22\0\1\24\4\0\4\24\1\143"
			+ "\16\24\1\0\7\24\33\0\1\144\73\0\1\145\36\0" + "\1\24\4\0\4\24\1\146\16\24\1\0\7\24\44\0"
			+ "\1\147\12\0\1\147\24\0\1\24\4\0\12\24\1\150" + "\10\24\1\0\7\24\22\0\1\24\4\0\17\24\1\130"
			+ "\3\24\1\0\5\24\1\130\1\24\46\0\1\151\11\0" + "\1\151\47\0\1\152\11\0\1\152\36\0\1\153\46\0"
			+ "\1\24\4\0\1\154\22\24\1\0\1\24\1\154\5\24" + "\44\0\1\155\12\0\1\155\50\0\1\156\11\0\1\156"
			+ "\23\0\1\24\4\0\17\24\1\157\3\24\1\0\5\24" + "\1\157\1\24\35\0\1\160\53\0\1\161\24\0\1\161"
			+ "\27\0\1\24\4\0\4\24\1\162\16\24\1\0\7\24" + "\46\0\1\163\11\0\1\163\43\0\1\164\46\0\1\165"
			+ "\24\0\1\165\47\0\1\166\24\0";

	private static int[] zzUnpackTrans() {
		int[] result = new int[4050];
		int offset = 0;
		offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackTrans(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			value--;
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** Error code for "Unknown internal scanner error". */
	private static final int ZZ_UNKNOWN_ERROR = 0;
	/** Error code for "could not match input". */
	private static final int ZZ_NO_MATCH = 1;
	/** Error code for "pushback value was too large". */
	private static final int ZZ_PUSHBACK_2BIG = 2;

	/**
	 * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
	 * {@link #ZZ_PUSHBACK_2BIG} respectively.
	 */
	private static final String ZZ_ERROR_MSG[] = { "Unknown internal scanner error", "Error: could not match input",
			"Error: pushback value was too large" };

	/**
	 * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
	 */
	private static final int[] ZZ_ATTRIBUTE = zzUnpackAttribute();

	private static final String ZZ_ATTRIBUTE_PACKED_0 = "\1\0\3\11\1\1\7\11\3\1\1\11\14\1\1\11"
			+ "\5\1\3\11\1\1\1\0\1\11\1\0\1\11\13\1" + "\1\11\1\0\4\1\1\0\4\1\1\0\1\1\2\0"
			+ "\1\1\1\0\2\1\1\11\1\0\4\1\1\0\1\1" + "\2\0\1\1\1\0\1\1\1\0\4\1\1\11\1\1"
			+ "\1\11\2\0\1\1\1\0\2\1\2\0\1\1\1\0" + "\1\1\1\11\2\0\1\1\2\0\1\1\2\0\1\1" + "\1\0\1\11\1\0\1\11";

	private static int[] zzUnpackAttribute() {
		int[] result = new int[118];
		int offset = 0;
		offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
		return result;
	}

	private static int zzUnpackAttribute(String packed, int offset, int[] result) {
		int i = 0; /* index in packed string */
		int j = offset; /* index in unpacked array */
		int l = packed.length();
		while (i < l) {
			int count = packed.charAt(i++);
			int value = packed.charAt(i++);
			do
				result[j++] = value;
			while (--count > 0);
		}
		return j;
	}

	/** Input device. */
	private java.io.Reader zzReader;

	/** Current state of the DFA. */
	private int zzState;

	/** Current lexical state. */
	private int zzLexicalState = YYINITIAL;

	/**
	 * This buffer contains the current text to be matched and is the source of the
	 * {@link #yytext()} string.
	 */
	private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

	/** Text position at the last accepting state. */
	private int zzMarkedPos;

	/** Current text position in the buffer. */
	private int zzCurrentPos;

	/** Marks the beginning of the {@link #yytext()} string in the buffer. */
	private int zzStartRead;

	/** Marks the last character in the buffer, that has been read from input. */
	private int zzEndRead;

	/**
	 * Whether the scanner is at the end of file.
	 * 
	 * @see #yyatEOF
	 */
	private boolean zzAtEOF;

	/**
	 * The number of occupied positions in {@link #zzBuffer} beyond
	 * {@link #zzEndRead}.
	 *
	 * <p>
	 * When a lead/high surrogate has been read from the input stream into the final
	 * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will
	 * have a value of 0.
	 */
	private int zzFinalHighSurrogate = 0;

	/** Number of newlines encountered up to the start of the matched text. */
	private int yyline;

	/**
	 * Number of characters from the last newline up to the start of the matched
	 * text.
	 */
	@SuppressWarnings("unused")
	private int yycolumn;

	/** Number of characters up to the start of the matched text. */
	@SuppressWarnings("unused")
	private long yychar;

	/** Whether the scanner is currently at the beginning of a line. */
	@SuppressWarnings("unused")
	private boolean zzAtBOL = true;

	/** Whether the user-EOF-code has already been executed. */
	@SuppressWarnings("unused")
	private boolean zzEOFDone;

	/* user code: */
	public String lexeme;
	public int lexemeLine;

	/**
	 * Creates a new scanner
	 *
	 * @param in the java.io.Reader to read input from.
	 */
	Lexico(java.io.Reader in) {
		this.zzReader = in;
	}

	/**
	 * Translates raw input code points to DFA table row
	 */
	private static int zzCMap(int input) {
		int offset = input & 255;
		return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
	}

	/**
	 * Refills the input buffer.
	 *
	 * @return {@code false} iff there was new input.
	 * @exception java.io.IOException if any I/O-Error occurs
	 */
	private boolean zzRefill() throws java.io.IOException {

		/* first: make room (if you can) */
		if (zzStartRead > 0) {
			zzEndRead += zzFinalHighSurrogate;
			zzFinalHighSurrogate = 0;
			System.arraycopy(zzBuffer, zzStartRead, zzBuffer, 0, zzEndRead - zzStartRead);

			/* translate stored positions */
			zzEndRead -= zzStartRead;
			zzCurrentPos -= zzStartRead;
			zzMarkedPos -= zzStartRead;
			zzStartRead = 0;
		}

		/* is the buffer big enough? */
		if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
			/* if not: blow it up */
			char newBuffer[] = new char[zzBuffer.length * 2];
			System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
			zzBuffer = newBuffer;
			zzEndRead += zzFinalHighSurrogate;
			zzFinalHighSurrogate = 0;
		}

		/* fill the buffer with new input */
		int requested = zzBuffer.length - zzEndRead;
		int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

		/* not supposed to occur according to specification of java.io.Reader */
		if (numRead == 0) {
			throw new java.io.IOException(
					"Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
		}
		if (numRead > 0) {
			zzEndRead += numRead;
			if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
				if (numRead == requested) { // We requested too few chars to encode a full Unicode character
					--zzEndRead;
					zzFinalHighSurrogate = 1;
				} else { // There is room in the buffer for at least one more char
					int c = zzReader.read(); // Expecting to read a paired low surrogate char
					if (c == -1) {
						return true;
					} else {
						zzBuffer[zzEndRead++] = (char) c;
					}
				}
			}
			/* potentially more input available */
			return false;
		}

		/* numRead < 0 ==> end of stream */
		return true;
	}

	/**
	 * Closes the input reader.
	 *
	 * @throws java.io.IOException if the reader could not be closed.
	 */
	public final void yyclose() throws java.io.IOException {
		zzAtEOF = true; // indicate end of file
		zzEndRead = zzStartRead; // invalidate buffer

		if (zzReader != null) {
			zzReader.close();
		}
	}

	/**
	 * Resets the scanner to read from a new input stream.
	 *
	 * <p>
	 * Does not close the old reader.
	 *
	 * <p>
	 * All internal variables are reset, the old input stream <b>cannot</b> be
	 * reused (internal buffer is discarded and lost). Lexical state is set to
	 * {@code ZZ_INITIAL}.
	 *
	 * <p>
	 * Internal scan buffer is resized down to its initial length, if it has grown.
	 *
	 * @param reader The new input stream.
	 */
	public final void yyreset(java.io.Reader reader) {
		zzReader = reader;
		zzEOFDone = false;
		yyResetPosition();
		zzLexicalState = YYINITIAL;
		if (zzBuffer.length > ZZ_BUFFERSIZE) {
			zzBuffer = new char[ZZ_BUFFERSIZE];
		}
	}

	/**
	 * Resets the input position.
	 */
	private final void yyResetPosition() {
		zzAtBOL = true;
		zzAtEOF = false;
		zzCurrentPos = 0;
		zzMarkedPos = 0;
		zzStartRead = 0;
		zzEndRead = 0;
		zzFinalHighSurrogate = 0;
		yyline = 0;
		yycolumn = 0;
		yychar = 0L;
	}

	/**
	 * Returns whether the scanner has reached the end of the reader it reads from.
	 *
	 * @return whether the scanner has reached EOF.
	 */
	public final boolean yyatEOF() {
		return zzAtEOF;
	}

	/**
	 * Returns the current lexical state.
	 *
	 * @return the current lexical state.
	 */
	public final int yystate() {
		return zzLexicalState;
	}

	/**
	 * Enters a new lexical state.
	 *
	 * @param newState the new lexical state
	 */
	public final void yybegin(int newState) {
		zzLexicalState = newState;
	}

	/**
	 * Returns the text matched by the current regular expression.
	 *
	 * @return the matched text.
	 */
	public final String yytext() {
		return new String(zzBuffer, zzStartRead, zzMarkedPos - zzStartRead);
	}

	/**
	 * Returns the character at the given position from the matched text.
	 *
	 * <p>
	 * It is equivalent to {@code yytext().charAt(pos)}, but faster.
	 *
	 * @param position the position of the character to fetch. A value from 0 to
	 *                 {@code yylength()-1}.
	 *
	 * @return the character at {@code position}.
	 */
	public final char yycharat(int position) {
		return zzBuffer[zzStartRead + position];
	}

	/**
	 * How many characters were matched.
	 *
	 * @return the length of the matched text region.
	 */
	public final int yylength() {
		return zzMarkedPos - zzStartRead;
	}

	/**
	 * Reports an error that occurred while scanning.
	 *
	 * <p>
	 * In a well-formed scanner (no or only correct usage of {@code yypushback(int)}
	 * and a match-all fallback rule) this method will only be called with things
	 * that "Can't Possibly Happen".
	 *
	 * <p>
	 * If this method is called, something is seriously wrong (e.g. a JFlex bug
	 * producing a faulty scanner etc.).
	 *
	 * <p>
	 * Usual syntax/scanner level error handling should be done in error fallback
	 * rules.
	 *
	 * @param errorCode the code of the error message to display.
	 */
	private static void zzScanError(int errorCode) {
		String message;
		try {
			message = ZZ_ERROR_MSG[errorCode];
		} catch (ArrayIndexOutOfBoundsException e) {
			message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
		}

		throw new Error(message);
	}

	/**
	 * Pushes the specified amount of characters back into the input stream.
	 *
	 * <p>
	 * They will be read again by then next call of the scanning method.
	 *
	 * @param number the number of characters to be read again. This number must not
	 *               be greater than {@link #yylength()}.
	 */
	public void yypushback(int number) {
		if (number > yylength())
			zzScanError(ZZ_PUSHBACK_2BIG);

		zzMarkedPos -= number;
	}

	/**
	 * Resumes scanning until the next regular expression is matched, the end of
	 * input is encountered or an I/O-Error occurs.
	 *
	 * @return the next token.
	 * @exception java.io.IOException if any I/O-Error occurs.
	 */
	public Token yylex() throws java.io.IOException {
		int zzInput;
		int zzAction;

		// cached fields:
		int zzCurrentPosL;
		int zzMarkedPosL;
		int zzEndReadL = zzEndRead;
		char[] zzBufferL = zzBuffer;

		int[] zzTransL = ZZ_TRANS;
		int[] zzRowMapL = ZZ_ROWMAP;
		int[] zzAttrL = ZZ_ATTRIBUTE;

		while (true) {
			zzMarkedPosL = zzMarkedPos;

			boolean zzR = false;
			int zzCh;
			int zzCharCount;
			for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL; zzCurrentPosL += zzCharCount) {
				zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
				zzCharCount = Character.charCount(zzCh);
				switch (zzCh) {
				case '\u000B': // fall through
				case '\u000C': // fall through
				case '\u0085': // fall through
				case '\u2028': // fall through
				case '\u2029':
					yyline++;
					zzR = false;
					break;
				case '\r':
					yyline++;
					zzR = true;
					break;
				case '\n':
					if (zzR)
						zzR = false;
					else {
						yyline++;
					}
					break;
				default:
					zzR = false;
				}
			}

			if (zzR) {
				// peek one character ahead if it is
				// (if we have counted one line too much)
				boolean zzPeek;
				if (zzMarkedPosL < zzEndReadL)
					zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				else if (zzAtEOF)
					zzPeek = false;
				else {
					boolean eof = zzRefill();
					zzEndReadL = zzEndRead;
					zzMarkedPosL = zzMarkedPos;
					zzBufferL = zzBuffer;
					if (eof)
						zzPeek = false;
					else
						zzPeek = zzBufferL[zzMarkedPosL] == '\n';
				}
				if (zzPeek)
					yyline--;
			}
			zzAction = -1;

			zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

			zzState = ZZ_LEXSTATE[zzLexicalState];

			// set up zzAction for empty match case:
			int zzAttributes = zzAttrL[zzState];
			if ((zzAttributes & 1) == 1) {
				zzAction = zzState;
			}

			zzForAction: {
				while (true) {

					if (zzCurrentPosL < zzEndReadL) {
						zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
						zzCurrentPosL += Character.charCount(zzInput);
					} else if (zzAtEOF) {
						zzInput = YYEOF;
						break zzForAction;
					} else {
						// store back cached positions
						zzCurrentPos = zzCurrentPosL;
						zzMarkedPos = zzMarkedPosL;
						boolean eof = zzRefill();
						// get translated positions and possibly new buffer
						zzCurrentPosL = zzCurrentPos;
						zzMarkedPosL = zzMarkedPos;
						zzBufferL = zzBuffer;
						zzEndReadL = zzEndRead;
						if (eof) {
							zzInput = YYEOF;
							break zzForAction;
						} else {
							zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
							zzCurrentPosL += Character.charCount(zzInput);
						}
					}
					int zzNext = zzTransL[zzRowMapL[zzState] + zzCMap(zzInput)];
					if (zzNext == -1)
						break zzForAction;
					zzState = zzNext;

					zzAttributes = zzAttrL[zzState];
					if ((zzAttributes & 1) == 1) {
						zzAction = zzState;
						zzMarkedPosL = zzCurrentPosL;
						if ((zzAttributes & 8) == 8)
							break zzForAction;
					}

				}
			}

			// store back cached position
			zzMarkedPos = zzMarkedPosL;

			if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
				zzAtEOF = true;
				return null;
			} else {
				switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
				case 1: {
					lexeme = yytext();
					lexemeLine = yyline;
					return ERROR;
				}
				// fall through
				case 30:
					break;
				case 2: {
					return ESPCHAR;
				}
				// fall through
				case 31:
					break;
				case 3: {
					return ESPACIO;
				}
				// fall through
				case 32:
					break;
				case 4: {
					lexeme = yytext();
					lexemeLine = yyline;
					return P_A;
				}
				// fall through
				case 33:
					break;
				case 5: {
					lexeme = yytext();
					lexemeLine = yyline;
					return P_C;
				}
				// fall through
				case 34:
					break;
				case 6: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_MULT;
				}
				// fall through
				case 35:
					break;
				case 7: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_SUM;
				}
				// fall through
				case 36:
					break;
				case 8: {
					lexeme = yytext();
					lexemeLine = yyline;
					return COMA;
				}
				// fall through
				case 37:
					break;
				case 9: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_RES;
				}
				// fall through
				case 38:
					break;
				case 10: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_DIV;
				}
				// fall through
				case 39:
					break;
				case 11: {
					lexeme = yytext();
					lexemeLine = yyline;
					return CONST_INT;
				}
				// fall through
				case 40:
					break;
				case 12: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_COMPARACION;
				}
				// fall through
				case 41:
					break;
				case 13: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_ASIGN;
				}
				// fall through
				case 42:
					break;
				case 14: {
					lexeme = yytext();
					lexemeLine = yyline;
					return ID;
				}
				// fall through
				case 43:
					break;
				case 15: {
					lexeme = yytext();
					lexemeLine = yyline;
					return C_A;
				}
				// fall through
				case 44:
					break;
				case 16: {
					lexeme = yytext();
					lexemeLine = yyline;
					return OP_LOG;
				}
				// fall through
				case 45:
					break;
				case 17: {
					lexeme = yytext();
					lexemeLine = yyline;
					return L_A;
				}
				// fall through
				case 46:
					break;
				case 18: {
					lexeme = yytext();
					lexemeLine = yyline;
					return L_C;
				}
				// fall through
				case 47:
					break;
				case 19: {
					lexeme = yytext();
					lexemeLine = yyline;
					return CONST_STR;
				}
				// fall through
				case 48:
					break;
				case 20: {
					lexeme = yytext();
					lexemeLine = yyline;
					return IF;
				}
				// fall through
				case 49:
					break;
				case 21: {
					lexeme = yytext();
					lexemeLine = yyline;
					return CONST_REAL;
				}
				// fall through
				case 50:
					break;
				case 22: {
					lexeme = yytext();
					lexemeLine = yyline;
					return ELSE;
				}
				// fall through
				case 51:
					break;
				case 23: {
					lexeme = yytext();
					lexemeLine = yyline;
					return TIPO;
				}
				// fall through
				case 52:
					break;
				case 24: {
					lexeme = yytext();
					lexemeLine = yyline;
					return PRINT;
				}
				// fall through
				case 53:
					break;
				case 25: {
					lexeme = yytext();
					lexemeLine = yyline;
					return WHILE;
				}
				// fall through
				case 54:
					break;
				case 26: {
					lexeme = yytext();
					lexemeLine = yyline;
					return DECLARE;
				}
				// fall through
				case 55:
					break;
				case 27: {
					lexeme = yytext();
					lexemeLine = yyline;
					return ENDDECLARE;
				}
				// fall through
				case 56:
					break;
				case 28: {
					lexeme = yytext();
					lexemeLine = yyline;
					return END;
				}
				// fall through
				case 57:
					break;
				case 29: {
					lexeme = yytext();
					lexemeLine = yyline;
					return BEGIN;
				}
				// fall through
				case 58:
					break;
				default:
					zzScanError(ZZ_NO_MATCH);
				}
			}
		}
	}

}
