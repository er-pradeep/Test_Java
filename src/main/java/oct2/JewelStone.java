package oct2;

import java.util.HashMap;
public class JewelStone {
    public static void main(String[] args) {
        String  J = "z", S = "ZZ";
        System.out.println(numJewelsInStones(J,S));
    }
    public static int numJewelsInStones(String J, String S) {
        char [] charArr = S.toCharArray();
        HashMap<Character,Integer> charMap = new HashMap();
        for(int i = 0;i< charArr.length;i++){
            if(charMap.containsKey(charArr[i])){
                charMap.put(charArr[i], charMap.get(charArr[i])+1);
            }else{
                charMap.put(charArr[i],1);
            }
        }
        int count = 0;
        char [] jewelArr = J.toCharArray();
        for(char c : jewelArr){
            count = count + charMap.getOrDefault(c,0);
        }
        return count;
    }
}