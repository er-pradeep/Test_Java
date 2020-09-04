package twentyfouraug;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s ="leetcode";
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                System.out.println(i);
        }
        System.out.println(-1);

    }
}
