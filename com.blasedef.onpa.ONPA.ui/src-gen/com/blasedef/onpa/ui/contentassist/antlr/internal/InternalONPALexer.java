package com.blasedef.onpa.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalONPALexer extends Lexer {
    public static final int RULE_INACTIVECOMPONENT=8;
    public static final int RULE_LOWER=5;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=12;
    public static final int RULE_UPPER=7;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalONPALexer() {;} 
    public InternalONPALexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalONPALexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:11:7: ( '==' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:11:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:12:7: ( '!=' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:12:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:13:7: ( '>=' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:13:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:14:7: ( '<=' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:14:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:15:7: ( '>' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:15:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:16:7: ( '<' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:16:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:17:7: ( 'true' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:17:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:18:7: ( 'false' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:18:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:19:7: ( 'e' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:19:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:20:7: ( ';' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:20:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:21:7: ( '*' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:21:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:22:7: ( '{' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:22:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:23:7: ( '}' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:23:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:24:7: ( '=' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:25:7: ( '(' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:25:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:26:7: ( ')' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:26:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:27:7: ( '[' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:27:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:28:7: ( ']' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:28:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:29:7: ( '||' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:29:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:30:7: ( '&&' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:30:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:31:7: ( '-' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:31:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:32:7: ( '+' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:32:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:33:7: ( '/' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:33:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:34:7: ( '!' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:34:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:35:7: ( 'this.' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:35:9: 'this.'
            {
            match("this."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:36:7: ( '.' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:36:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:37:7: ( 'E' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:37:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_LOWER"
    public final void mRULE_LOWER() throws RecognitionException {
        try {
            int _type = RULE_LOWER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:12: ( ( 'a' .. 'z' )+ ( RULE_ID )? )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:14: ( 'a' .. 'z' )+ ( RULE_ID )?
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:14: ( 'a' .. 'z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:15: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:26: ( RULE_ID )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='A' && LA2_0<='Z')||(LA2_0>='^' && LA2_0<='_')||(LA2_0>='a' && LA2_0<='z')) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5381:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LOWER"

    // $ANTLR start "RULE_UPPER"
    public final void mRULE_UPPER() throws RecognitionException {
        try {
            int _type = RULE_UPPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:12: ( ( 'A' .. 'Z' )+ ( RULE_ID )? )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:14: ( 'A' .. 'Z' )+ ( RULE_ID )?
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:14: ( 'A' .. 'Z' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='A' && LA3_0<='Z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:15: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:26: ( RULE_ID )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>='A' && LA4_0<='Z')||(LA4_0>='^' && LA4_0<='_')||(LA4_0>='a' && LA4_0<='z')) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5383:26: RULE_ID
                    {
                    mRULE_ID(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_UPPER"

    // $ANTLR start "RULE_INACTIVECOMPONENT"
    public final void mRULE_INACTIVECOMPONENT() throws RecognitionException {
        try {
            int _type = RULE_INACTIVECOMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5385:24: ( 'InactiveComponent' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5385:26: 'InactiveComponent'
            {
            match("InactiveComponent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INACTIVECOMPONENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5387:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5387:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5387:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5387:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5387:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5389:10: ( ( '0' .. '9' )+ )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5389:12: ( '0' .. '9' )+
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5389:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5389:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5391:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5393:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5393:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5393:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5393:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:41: ( '\\r' )? '\\n'
                    {
                    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5395:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5397:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5397:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5397:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5399:16: ( . )
            // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:5399:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_LOWER | RULE_UPPER | RULE_INACTIVECOMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=37;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:172: RULE_LOWER
                {
                mRULE_LOWER(); 

                }
                break;
            case 29 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:183: RULE_UPPER
                {
                mRULE_UPPER(); 

                }
                break;
            case 30 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:194: RULE_INACTIVECOMPONENT
                {
                mRULE_INACTIVECOMPONENT(); 

                }
                break;
            case 31 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:217: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:225: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:234: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:246: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:262: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:278: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // ../com.blasedef.onpa.ONPA.ui/src-gen/com/blasedef/onpa/ui/contentassist/antlr/internal/InternalONPA.g:1:286: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\1\42\1\44\1\46\1\50\2\53\1\60\10\uffff\2\40\2\uffff\1\77\1\uffff\1\101\1\53\2\102\1\40\2\uffff\2\40\12\uffff\2\53\1\uffff\2\53\1\uffff\1\53\23\uffff\3\102\3\uffff\6\53\4\102\1\127\2\53\1\102\2\uffff\1\133\1\102\1\uffff\14\102";
    static final String DFA16_eofS =
        "\150\uffff";
    static final String DFA16_minS =
        "\1\0\4\75\3\60\10\uffff\1\174\1\46\2\uffff\1\52\1\uffff\4\60\1\101\2\uffff\2\0\12\uffff\2\60\1\uffff\2\60\1\uffff\1\60\23\uffff\3\60\3\uffff\13\60\1\56\2\60\2\uffff\2\60\1\uffff\14\60";
    static final String DFA16_maxS =
        "\1\uffff\4\75\3\172\10\uffff\1\174\1\46\2\uffff\1\57\1\uffff\5\172\2\uffff\2\uffff\12\uffff\2\172\1\uffff\2\172\1\uffff\1\172\23\uffff\3\172\3\uffff\16\172\2\uffff\2\172\1\uffff\14\172";
    static final String DFA16_acceptS =
        "\10\uffff\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1\22\2\uffff\1\25\1\26\1\uffff\1\32\5\uffff\1\37\1\40\2\uffff\1\44\1\45\1\1\1\16\1\2\1\30\1\3\1\5\1\4\1\6\2\uffff\1\34\2\uffff\1\37\1\uffff\1\11\1\12\1\13\1\14\1\15\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\42\1\43\1\27\1\32\1\33\1\35\3\uffff\1\40\1\41\1\44\16\uffff\1\7\1\31\2\uffff\1\10\14\uffff";
    static final String DFA16_specialS =
        "\1\1\34\uffff\1\2\1\0\111\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\40\2\37\2\40\1\37\22\40\1\37\1\2\1\35\3\40\1\21\1\36\1\14\1\15\1\11\1\23\1\40\1\22\1\25\1\24\12\34\1\40\1\10\1\4\1\1\1\3\2\40\4\31\1\26\3\31\1\30\21\31\1\16\1\40\1\17\1\32\1\33\1\40\4\27\1\7\1\6\15\27\1\5\6\27\1\12\1\20\1\13\uff82\40",
            "\1\41",
            "\1\43",
            "\1\45",
            "\1\47",
            "\12\56\7\uffff\32\55\4\uffff\1\55\1\uffff\7\54\1\52\11\54\1\51\10\54",
            "\12\56\7\uffff\32\55\4\uffff\1\55\1\uffff\1\57\31\54",
            "\12\56\7\uffff\32\55\3\uffff\1\53\1\55\1\uffff\32\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\75\4\uffff\1\76",
            "",
            "\12\56\7\uffff\32\103\3\uffff\1\102\1\104\1\uffff\32\104",
            "\12\56\7\uffff\32\55\4\uffff\1\55\1\uffff\32\54",
            "\12\56\7\uffff\32\103\4\uffff\1\104\1\uffff\15\104\1\105\14\104",
            "\12\56\7\uffff\32\103\4\uffff\1\104\1\uffff\32\104",
            "\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\0\107",
            "\0\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\24\112\1\111\5\112",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\10\112\1\115\21\112",
            "",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\32\112",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\13\112\1\116\16\112",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\121\7\uffff\32\117\4\uffff\1\120\1\uffff\32\120",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\32\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\1\122\31\121",
            "",
            "",
            "",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\4\112\1\123\25\112",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\32\112",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\7\uffff\32\114\4\uffff\1\114\1\uffff\32\114",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\22\112\1\124\7\112",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\22\112\1\125\7\112",
            "\12\121\7\uffff\32\117\4\uffff\1\120\1\uffff\32\120",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\32\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\32\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\2\121\1\126\27\121",
            "\12\114\7\uffff\32\113\3\uffff\1\53\1\113\1\uffff\32\112",
            "\1\130\1\uffff\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\32\112",
            "\12\114\7\uffff\32\113\4\uffff\1\113\1\uffff\4\112\1\131\25\112",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\23\121\1\132\6\121",
            "",
            "",
            "\12\114\7\uffff\32\113\3\uffff\1\53\1\113\1\uffff\32\112",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\10\121\1\134\21\121",
            "",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\25\121\1\135\4\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\4\121\1\136\25\121",
            "\12\121\7\uffff\2\121\1\137\27\121\4\uffff\1\121\1\uffff\32\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\16\121\1\140\13\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\14\121\1\141\15\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\17\121\1\142\12\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\16\121\1\143\13\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\15\121\1\144\14\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\4\121\1\145\25\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\15\121\1\146\14\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\23\121\1\147\6\121",
            "\12\121\7\uffff\32\121\4\uffff\1\121\1\uffff\32\121"
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_LOWER | RULE_UPPER | RULE_INACTIVECOMPONENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_30 = input.LA(1);

                        s = -1;
                        if ( ((LA16_30>='\u0000' && LA16_30<='\uFFFF')) ) {s = 71;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='=') ) {s = 1;}

                        else if ( (LA16_0=='!') ) {s = 2;}

                        else if ( (LA16_0=='>') ) {s = 3;}

                        else if ( (LA16_0=='<') ) {s = 4;}

                        else if ( (LA16_0=='t') ) {s = 5;}

                        else if ( (LA16_0=='f') ) {s = 6;}

                        else if ( (LA16_0=='e') ) {s = 7;}

                        else if ( (LA16_0==';') ) {s = 8;}

                        else if ( (LA16_0=='*') ) {s = 9;}

                        else if ( (LA16_0=='{') ) {s = 10;}

                        else if ( (LA16_0=='}') ) {s = 11;}

                        else if ( (LA16_0=='(') ) {s = 12;}

                        else if ( (LA16_0==')') ) {s = 13;}

                        else if ( (LA16_0=='[') ) {s = 14;}

                        else if ( (LA16_0==']') ) {s = 15;}

                        else if ( (LA16_0=='|') ) {s = 16;}

                        else if ( (LA16_0=='&') ) {s = 17;}

                        else if ( (LA16_0=='-') ) {s = 18;}

                        else if ( (LA16_0=='+') ) {s = 19;}

                        else if ( (LA16_0=='/') ) {s = 20;}

                        else if ( (LA16_0=='.') ) {s = 21;}

                        else if ( (LA16_0=='E') ) {s = 22;}

                        else if ( ((LA16_0>='a' && LA16_0<='d')||(LA16_0>='g' && LA16_0<='s')||(LA16_0>='u' && LA16_0<='z')) ) {s = 23;}

                        else if ( (LA16_0=='I') ) {s = 24;}

                        else if ( ((LA16_0>='A' && LA16_0<='D')||(LA16_0>='F' && LA16_0<='H')||(LA16_0>='J' && LA16_0<='Z')) ) {s = 25;}

                        else if ( (LA16_0=='^') ) {s = 26;}

                        else if ( (LA16_0=='_') ) {s = 27;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 28;}

                        else if ( (LA16_0=='\"') ) {s = 29;}

                        else if ( (LA16_0=='\'') ) {s = 30;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 31;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='%')||LA16_0==','||LA16_0==':'||(LA16_0>='?' && LA16_0<='@')||LA16_0=='\\'||LA16_0=='`'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 32;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_29 = input.LA(1);

                        s = -1;
                        if ( ((LA16_29>='\u0000' && LA16_29<='\uFFFF')) ) {s = 71;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}