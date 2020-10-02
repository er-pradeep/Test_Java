package oct2;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int [] indices = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,indices));
    }
    public static String restoreString(String s, int[] indices) {
        char [] newCharArr = new char[s.length()];
        for(int i =0;i<indices.length;i++){
            int currIndex = indices[i];
            newCharArr[currIndex] = s.charAt(i);
        }
        StringBuilder sb = new StringBuilder();
        for(char c: newCharArr)        {
            sb.append(c);
        }
        return sb.toString();
    }
}
