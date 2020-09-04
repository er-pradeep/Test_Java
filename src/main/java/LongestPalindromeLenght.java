import java.util.*;

public class LongestPalindromeLenght {
    public static void main(String[] args) {
        String str = "ccc";
        char [] charArr = str.toCharArray();
        Map<Character,Integer> charLengthMap = new HashMap<>();
        for(char c : charArr){
            if(charLengthMap.containsKey(c)){
                int currLength = charLengthMap.get(c);
                currLength++;
                charLengthMap.put(c,currLength);
            }else{
                charLengthMap.put(c,1);
            }
        }

        if(charLengthMap.size()==1){
            System.out.println(str.length());
        }
        int pallindromeLength = 0;

        List singleCharLenghtList = new ArrayList<>();
        List multipleCharLengthList = new ArrayList();
        for(Map.Entry<Character,Integer> entry : charLengthMap.entrySet()){
            System.out.println("Key = "+ entry.getKey() + " Value = "+ entry.getValue());
            int charLength = entry.getValue();
            if(charLength % 2== 0){
                pallindromeLength = pallindromeLength + charLength;
            }else{
                if(charLength>1){
                    pallindromeLength = pallindromeLength + charLength-1;
                    multipleCharLengthList.add(entry.getKey());
                }else if(charLength==1){
                    singleCharLenghtList.add(entry.getKey());
                }
            }
        }
        if(singleCharLenghtList.size()>=1 ){
            pallindromeLength++;
        }else if (multipleCharLengthList.size()>=1){
            pallindromeLength++;
        }
        System.out.println(pallindromeLength);
        // take count of each element - if it is even - keep on adding for lenght
        // if it is odd - then take count - if count >1 then reduce - 1 and add to lenght
        // if it is odd - then take count and if count = 1 - collect all such character in a list and at last if the list size is >=1 add 1


    }
}
