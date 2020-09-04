import java.util.HashSet;
import java.util.Set;

public class GoatLatin {
    private static Set<Character> vowels =
            new HashSet() {
                {
                    add('a');
                    add('e');
                    add('i');
                    add('o');
                    add('u');
                    add('A');
                    add('E');
                    add('I');
                    add('O');
                    add('U');
                }
            };
    public static void main(String[] args) {
        /*The rules of Goat Latin are as follows:

        If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
        For example, the word 'apple' becomes 'applema'.

                If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
                For example, the word "goat" becomes "oatgma".

                Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
        For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.

                Return the final sentence representing the conversion from S to Goat Latin.*/

        String sentence ="I speak Goat Latin";
        String [] s = sentence.split(" ");
        String word;
        char firstChar;
        String lastChar="a";
        String goatSentence = "";
        for(int i = 0;i<s.length;i++){
            word = s[i];

            if(null!=word){
                firstChar = word.charAt(0);
                if(vowels.contains(firstChar)){
                    word = word + "ma"+lastChar;
                }else{
                    word = word.substring(1)+firstChar+"ma"+lastChar;
                }
            }
            goatSentence = goatSentence.concat(word + " ");
            lastChar = lastChar + "a";
        }
        System.out.println(goatSentence);
    }
}
