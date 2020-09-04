package twentyeightaug;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    /*Input:
            ["a","b","b","b","b","b","b","b","b","b","b","b","b"]

    Output:
    Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].

    Explanation:
    Since the character "a" does not repeat, it is not compressed. "bbbbbbbbbbbb" is replaced by "b12".
    Notice each digit has it's own entry in the array.
    */
    public static void main(String[] args) {
//      char [] charArr = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] charArr = {'a','a','b','b','c','c','c'};
      char x;
        HashMap<Character,Integer> charMap = new HashMap();
        int currValue=0;
      for(int i =0;i<charArr.length;i++){
          x= charArr[i];
          if(charMap.containsKey(x)){
              currValue = charMap.get(x) +1;
              charMap.put(x,currValue);
          }else{
              charMap.put(x,1);
          }


          //charMap.put(x,charMap.getOrDefault(currValue,1));
      }
        String value;
        int i=0;
        int charArrLengthCurr = charArr.length-1;
        for(Map.Entry entry : charMap.entrySet()){
            x = (char) entry.getKey();
            value =  entry.getValue().toString();
            if(i<=charArrLengthCurr)
                charArr[i] = x;
            i++;
            for (char l : value.toCharArray()){
                if(i<=charArrLengthCurr)
                    charArr[i] = l;
                i++;
            }
        }
        System.out.println(i-1);
        for(char k:charArr){
            System.out.print(k);
        }

    }
}
