package twentythreeaug;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    /*Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.  It is guaranteed there is at least one word that isn't banned, and that the answer is unique.

    Words in the list of banned words are given in lowercase, and free of punctuation.  Words in the paragraph are not case sensitive.  The answer is in lowercase.
        */
    public static void main(String[] args) {
        MostCommonWord mcw = new MostCommonWord();
        //String paragraph ="Bob hit a ball, the hit BALL flew far after it was hit.";
        String paragraph ="a, a, a, a, b,b,b,c, c";

        String banned [] ={"a"};
        System.out.println(mcw.mostCommonWord(paragraph,banned));
    }

    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph= paragraph.replaceAll(",",", ");
        String[] words = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        Map<String,Integer> wordFrequency = new HashMap<>();
        int currentCount=0;
        for(String s:words){
            if(wordFrequency.containsKey(s)){
                currentCount = wordFrequency.get(s);
                currentCount++;
                wordFrequency.put(s,currentCount);
            }else{
                wordFrequency.put(s,1);
            }
        }
        // remove banned string
        for(String banStr : banned){
            wordFrequency.remove(banStr);
        }
        int maxFrequency  = Integer.MIN_VALUE;
        String currWord="";
        int currFrequency=0;
        for(Map.Entry entry : wordFrequency.entrySet()){
            currFrequency = (int) entry.getValue();
            if(currFrequency > maxFrequency){
                maxFrequency = currFrequency;
                currWord = (String) entry.getKey();
            }
        }
        return currWord;
    }
}
