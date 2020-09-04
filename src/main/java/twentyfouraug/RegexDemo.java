package twentyfouraug;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String regex ="^(.+)@(.+)$";
        Pattern pattern =  Pattern.compile(regex);
        Matcher m = pattern.matcher("abc@gmail.com");
        System.out.println(m.matches());


        // Create a pattern to be searched
        Pattern pattern1 = Pattern.compile("geeks");

        // Search above pattern in "geeksforgeeks.org"
        Matcher m1 = pattern1.matcher("geeksforgeeks.org");

        // Print starting and ending indexes of the pattern
        // in text
        while (m1.find())
            System.out.println("Pattern found from " + m1.start() +
                    " to " + (m1.end()-1));

        Pattern pattern2 = Pattern.compile("ge*");
        Matcher m2 = pattern2.matcher("geeksforgeeks.org");
        while (m2.find())
            System.out.println("Pattern found from " + m2.start() +
                    " to " + (m2.end()-1));

    }


}
