import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern ="abba";
        String word = "dog dog dog dog";
        System.out.println(wordPattern(pattern,word));
    }

    public static boolean wordPattern(String pattern, String str) {
        HashMap <Character, String> map_char = new HashMap();
        HashMap <String, Character> map_word = new HashMap();
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            if (!map_char.containsKey(c)) {
                if (map_word.containsKey(w)) {
                    return false;
                } else {
                    map_char.put(c, w);
                    map_word.put(w, c);
                }
            } else {
                String mapped_word = map_char.get(c);
                if (!mapped_word.equals(w))
                    return false;
            }
        }
        return true;
    }

}
