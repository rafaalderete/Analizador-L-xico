package lexico;

import static lexico.Token.*;


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
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\u10fe\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\2\1\25\0\1\2\1\3\1\4\5\0\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\15"+
    "\1\16\1\0\1\17\1\20\1\21\1\3\1\0\1\22"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\2\31\1\33\1\34\1\35\1\36\1\37\1\31\1\40"+
    "\1\41\1\42\6\31\1\43\1\0\1\6\1\0\1\44"+
    "\1\0\1\45\1\23\1\24\1\46\1\26\1\27\1\30"+
    "\1\31\1\32\2\31\1\33\1\34\1\47\1\50\1\37"+
    "\1\31\1\51\1\41\1\52\6\31\1\53\1\54\1\55"+
    "\43\0\1\3\35\0\1\3\2\0\1\3\155\0\2\56"+
    "\115\0\1\57\u0180\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[768];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\1\1\14\1\15"+
    "\1\14\12\16\1\17\5\20\1\21\1\20\1\22\1\1"+
    "\1\0\1\23\1\0\1\14\6\16\1\24\3\16\1\24"+
    "\1\0\1\25\3\16\1\0\4\16\2\0\1\16\1\0"+
    "\1\16\2\26\1\0\4\16\2\0\1\16\1\0\1\16"+
    "\1\0\1\16\1\27\1\16\2\30\2\0\1\16\1\0"+
    "\2\16\2\0\1\31\1\0\1\16\1\27\2\0\1\16"+
    "\2\0\1\16\2\0\1\32\1\0\1\33\1\0\1\34";

  private static int [] zzUnpackAction() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\60\0\60\0\140\0\60\0\60\0\60"+
    "\0\60\0\60\0\60\0\60\0\220\0\300\0\360\0\60"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\60\0\u0150\0\u01e0\0\u02a0\0\u02d0"+
    "\0\u01b0\0\60\0\60\0\60\0\u0330\0\140\0\60\0\u0360"+
    "\0\60\0\u0390\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u01b0"+
    "\0\u04b0\0\u04e0\0\u0510\0\60\0\u0540\0\u0360\0\u0570\0\u05a0"+
    "\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\u07b0\0\u01b0\0\60\0\u07e0\0\u0810\0\u0840"+
    "\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0"+
    "\0\u09f0\0\u01b0\0\u0a20\0\u01b0\0\60\0\u0a50\0\u0a80\0\u0ab0"+
    "\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\u0ba0\0\u01b0\0\u0bd0\0\u0c00"+
    "\0\60\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50"+
    "\0\u0d80\0\u01b0\0\u0db0\0\60\0\u0de0\0\60";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
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
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\2\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\2\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\2\24\1\30\2\24\1\31\1\32\1\33\3\24\1\34"+
    "\1\2\1\35\1\36\1\37\1\40\2\41\1\42\1\43"+
    "\1\44\1\45\1\2\62\0\2\46\1\47\4\0\1\46"+
    "\1\0\1\46\1\0\1\46\4\0\21\46\2\0\6\46"+
    "\1\0\1\46\16\0\1\50\1\0\1\15\62\0\1\20"+
    "\57\0\2\51\56\0\1\51\54\0\1\24\4\0\13\24"+
    "\1\52\5\24\1\0\3\24\1\52\3\24\22\0\1\24"+
    "\4\0\4\24\1\53\14\24\1\0\7\24\22\0\1\24"+
    "\4\0\21\24\1\0\7\24\22\0\1\24\4\0\4\24"+
    "\1\54\14\24\1\0\7\24\22\0\1\24\4\0\11\24"+
    "\1\55\1\24\1\56\5\24\1\0\3\24\1\56\3\24"+
    "\22\0\1\24\4\0\11\24\1\57\7\24\1\0\7\24"+
    "\22\0\1\24\4\0\5\24\1\60\5\24\1\61\5\24"+
    "\1\0\3\24\1\61\3\24\22\0\1\24\4\0\14\24"+
    "\1\62\4\24\1\0\4\24\1\62\2\24\22\0\1\24"+
    "\4\0\16\24\1\41\2\24\1\0\5\24\1\41\1\24"+
    "\22\0\1\24\4\0\16\24\1\63\2\24\1\0\5\24"+
    "\1\63\1\24\34\0\1\64\5\0\1\65\11\0\1\65"+
    "\25\0\1\66\57\0\1\24\4\0\3\24\1\41\15\24"+
    "\1\0\2\24\1\41\4\24\22\0\1\24\4\0\6\24"+
    "\1\67\12\24\1\0\7\24\22\0\1\24\4\0\2\24"+
    "\1\70\16\24\1\0\7\24\22\0\1\24\4\0\17\24"+
    "\1\71\1\24\1\0\7\24\4\0\1\72\15\0\1\24"+
    "\4\0\3\24\1\73\15\24\1\0\2\24\1\73\4\24"+
    "\22\0\1\24\4\0\14\24\1\74\4\24\1\0\4\24"+
    "\1\74\2\24\22\0\1\24\4\0\20\24\1\75\1\0"+
    "\6\24\1\75\22\0\1\24\4\0\20\24\1\41\1\0"+
    "\6\24\1\41\22\0\1\24\4\0\10\24\1\76\10\24"+
    "\1\0\7\24\3\0\1\77\43\0\1\100\7\0\1\100"+
    "\22\0\1\24\4\0\10\24\1\101\10\24\1\0\7\24"+
    "\3\0\1\102\16\0\1\24\4\0\11\24\1\103\7\24"+
    "\1\0\7\24\22\0\1\24\4\0\4\24\1\104\14\24"+
    "\1\0\7\24\33\0\1\105\44\0\1\106\1\0\1\24"+
    "\4\0\3\24\1\107\15\24\1\0\2\24\1\107\4\24"+
    "\22\0\1\24\4\0\1\110\20\24\1\0\1\24\1\110"+
    "\5\24\22\0\1\24\4\0\4\24\1\111\14\24\1\0"+
    "\7\24\22\0\1\24\4\0\13\24\1\112\5\24\1\0"+
    "\3\24\1\112\3\24\42\0\1\113\11\0\1\113\36\0"+
    "\1\114\46\0\1\24\4\0\13\24\1\115\5\24\1\0"+
    "\3\24\1\115\3\24\42\0\1\116\11\0\1\116\25\0"+
    "\1\24\4\0\1\117\20\24\1\0\1\24\1\117\5\24"+
    "\44\0\1\120\35\0\1\24\4\0\4\24\1\121\14\24"+
    "\1\0\7\24\22\0\1\24\4\0\20\24\1\122\1\0"+
    "\6\24\1\122\22\0\1\24\4\0\6\24\1\123\12\24"+
    "\1\0\7\24\22\0\1\24\4\0\20\24\1\124\1\0"+
    "\6\24\1\124\47\0\1\125\7\0\1\125\35\0\1\126"+
    "\42\0\1\127\1\0\1\24\4\0\21\24\1\0\7\24"+
    "\20\0\1\127\61\0\1\24\4\0\16\24\1\130\2\24"+
    "\1\0\5\24\1\130\1\24\45\0\1\131\10\0\1\131"+
    "\23\0\1\24\4\0\2\24\1\132\16\24\1\0\7\24"+
    "\22\0\1\24\4\0\4\24\1\133\14\24\1\0\7\24"+
    "\33\0\1\134\70\0\1\135\35\0\1\24\4\0\4\24"+
    "\1\136\14\24\1\0\7\24\43\0\1\137\11\0\1\137"+
    "\24\0\1\24\4\0\11\24\1\140\7\24\1\0\7\24"+
    "\22\0\1\24\4\0\16\24\1\122\2\24\1\0\5\24"+
    "\1\122\1\24\45\0\1\141\10\0\1\141\46\0\1\142"+
    "\10\0\1\142\36\0\1\143\44\0\1\24\4\0\1\144"+
    "\20\24\1\0\1\24\1\144\5\24\43\0\1\145\11\0"+
    "\1\145\47\0\1\146\10\0\1\146\23\0\1\24\4\0"+
    "\16\24\1\147\2\24\1\0\5\24\1\147\1\24\35\0"+
    "\1\150\51\0\1\151\22\0\1\151\27\0\1\24\4\0"+
    "\4\24\1\152\14\24\1\0\7\24\45\0\1\153\10\0"+
    "\1\153\42\0\1\154\45\0\1\155\22\0\1\155\46\0"+
    "\1\156\23\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3600];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
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
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\11\1\1\7\11\3\1\1\11\13\1\1\11"+
    "\5\1\3\11\1\1\1\0\1\11\1\0\1\11\12\1"+
    "\1\11\1\0\4\1\1\0\4\1\2\0\1\1\1\0"+
    "\2\1\1\11\1\0\4\1\2\0\1\1\1\0\1\1"+
    "\1\0\4\1\1\11\2\0\1\1\1\0\2\1\2\0"+
    "\1\1\1\0\1\1\1\11\2\0\1\1\2\0\1\1"+
    "\2\0\1\1\1\0\1\11\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[110];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
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
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
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
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
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
   * @param   in  the java.io.Reader to read input from.
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
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

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
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
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
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
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
      zzAtBOL  = true;
      zzAtEOF  = false;
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
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
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
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
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
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
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

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { lexeme = yytext(); lexemeLine = yyline; return ERROR;
            }
            // fall through
          case 29: break;
          case 2:
            { return ESPCHAR;
            }
            // fall through
          case 30: break;
          case 3:
            { return ESPACIO;
            }
            // fall through
          case 31: break;
          case 4:
            { lexeme = yytext(); lexemeLine = yyline; return P_A;
            }
            // fall through
          case 32: break;
          case 5:
            { lexeme = yytext(); lexemeLine = yyline; return P_C;
            }
            // fall through
          case 33: break;
          case 6:
            { lexeme = yytext(); lexemeLine = yyline; return OP_MULT;
            }
            // fall through
          case 34: break;
          case 7:
            { lexeme = yytext(); lexemeLine = yyline; return OP_SUM;
            }
            // fall through
          case 35: break;
          case 8:
            { lexeme = yytext(); lexemeLine = yyline; return COMA;
            }
            // fall through
          case 36: break;
          case 9:
            { lexeme = yytext(); lexemeLine = yyline; return OP_RES;
            }
            // fall through
          case 37: break;
          case 10:
            { lexeme = yytext(); lexemeLine = yyline; return OP_DIV;
            }
            // fall through
          case 38: break;
          case 11:
            { lexeme = yytext(); lexemeLine = yyline; return CONST_INT;
            }
            // fall through
          case 39: break;
          case 12:
            { lexeme = yytext(); lexemeLine = yyline; return OP_COMPARACION;
            }
            // fall through
          case 40: break;
          case 13:
            { lexeme = yytext(); lexemeLine = yyline; return OP_ASIGN;
            }
            // fall through
          case 41: break;
          case 14:
            { lexeme = yytext(); lexemeLine = yyline; return ID;
            }
            // fall through
          case 42: break;
          case 15:
            { lexeme = yytext(); lexemeLine = yyline; return C_A;
            }
            // fall through
          case 43: break;
          case 16:
            { lexeme = yytext(); lexemeLine = yyline; return OP_LOG;
            }
            // fall through
          case 44: break;
          case 17:
            { lexeme = yytext(); lexemeLine = yyline; return L_A;
            }
            // fall through
          case 45: break;
          case 18:
            { lexeme = yytext(); lexemeLine = yyline; return L_C;
            }
            // fall through
          case 46: break;
          case 19:
            { lexeme = yytext(); lexemeLine = yyline; return CONST_STR;
            }
            // fall through
          case 47: break;
          case 20:
            { lexeme = yytext(); lexemeLine = yyline; return IF;
            }
            // fall through
          case 48: break;
          case 21:
            { lexeme = yytext(); lexemeLine = yyline; return CONST_REAL;
            }
            // fall through
          case 49: break;
          case 22:
            { lexeme = yytext(); lexemeLine = yyline; return ELSE;
            }
            // fall through
          case 50: break;
          case 23:
            { lexeme = yytext(); lexemeLine = yyline; return TIPO;
            }
            // fall through
          case 51: break;
          case 24:
            { lexeme = yytext(); lexemeLine = yyline; return PRINT;
            }
            // fall through
          case 52: break;
          case 25:
            { lexeme = yytext(); lexemeLine = yyline; return DECLARE;
            }
            // fall through
          case 53: break;
          case 26:
            { lexeme = yytext(); lexemeLine = yyline; return ENDDECLARE;
            }
            // fall through
          case 54: break;
          case 27:
            { lexeme = yytext(); lexemeLine = yyline; return END;
            }
            // fall through
          case 55: break;
          case 28:
            { lexeme = yytext(); lexemeLine = yyline; return BEGIN;
            }
            // fall through
          case 56: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
