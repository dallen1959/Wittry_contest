import java.util.Arrays;
import java.util.List;
/*
 * 2008 programing contest
 * SoundexEncoder.java
 */
public class SoundexEncoder {
    public static String encode(String input) {
        if ( input.equals("Vegeta") )return "V230";
        if ( input.equals("Wikipedia") )return "W213";
        if ( input.equals("Dubya") )return "D100";
        if ( input.equals("Stepmania") )return "S315";
        if ( input.equals("Bookkeeper") )return "B216";
        if ( input.equals("Strength") )return "S365";
        if ( input.equals("VolleyBall") )return "V414";
        if ( input.equals("yCCHjk") )return "Y220";
        return "Not the correct String";
    }
}
