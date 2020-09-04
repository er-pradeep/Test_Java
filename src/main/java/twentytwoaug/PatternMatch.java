package twentytwoaug;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatch {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[abc]",Pattern.CASE_INSENSITIVE);
        Matcher matcher  = pattern.matcher("w3s");
        boolean matchFound = matcher.find();
        System.out.println(matchFound);
    }
}
