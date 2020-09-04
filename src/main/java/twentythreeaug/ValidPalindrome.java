package twentythreeaug;

import java.util.HashMap;
import java.util.Map;

public class ValidPalindrome {

    //Given a non-empty string s, you may delete at most one character. Judge whether you can make it a palindrome.

    public static void main(String[] args) {
        String s ="tebbem";
        char [] carr = s.toCharArray();
        int oddCount=0;
       /* int charLength = carr.length;
        if(charLength%2!=0){
            charLength++;
        }*/
        for(int i = 0,j=carr.length-1;i<=j;i++,j--){
            if(carr[i]!=carr[j]){
                oddCount++;
            }
        }
        if(oddCount>1){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        /*HashMap<Character,Integer> charMap = new HashMap<Character, Integer>();
        int currCount = 0;
        for(char c:carr){
            if(charMap.containsKey(c)){
                currCount = (int)charMap.get(c);
                currCount++;
                charMap.put(c,currCount);
            }else{
                charMap.put(c,1);
            }
        }
        int value = 0;
        int oddCharCount = 0;
        for(Map.Entry entry : charMap.entrySet()){
            value = (int) entry.getValue();

            if(value % 2 ==1){
                oddCharCount++;
            }

        }
        System.out.println(oddCharCount);
        System.out.println(charMap);
        if(oddCharCount>2){
            System.out.println("false");
        }else{
            System.out.println("true");
        }*/
    }
}
