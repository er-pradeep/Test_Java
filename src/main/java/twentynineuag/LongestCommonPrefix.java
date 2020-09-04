package twentynineuag;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"flower","flow","flight"};
        Arrays.sort(strs);
        int smallestLength = Integer.MAX_VALUE;
        for(String str : strs){
            if(smallestLength > str.length()){
                smallestLength = str.length();
            }
        }

        String prefixStr="";
        int i =0;
        boolean flag = false;
        for(i=0;i<smallestLength;i++){
            for(int k =0; k<strs.length;k++){
                if(strs[k].charAt(i)==strs[k+1].charAt(i)){
                    continue;
                }else{
                    flag = true;
                    break;
                }

            }
            if (flag) break;
        }

        System.out.println(strs[0].substring(0,i));
    }
}
