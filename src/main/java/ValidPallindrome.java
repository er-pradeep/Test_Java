public class ValidPallindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        char [] charArr = s.toCharArray();
        char [] alphaNumericArr = new char [s.length()];
        int i =0;
        for (char c:charArr) {
            int xy = c;
            if(xy>64 && xy < 91){
                alphaNumericArr[i] = c;
                i++;
            }else if (xy >96 && xy<123){
                alphaNumericArr[i] = c;
                i++;
            }else if (xy >47 && xy<58){
                alphaNumericArr[i] = c;
                i++;
            }
        }
        boolean notPalindrome = false;
        for(int k=0,l=i-1;k<i/2;k++,l--){
            if(alphaNumericArr[k]==alphaNumericArr[l]){
                continue;
            }else{
                System.out.println("not palindrome");
                notPalindrome = true;
                break;
            }
        }
        if(!notPalindrome)
        System.out.println("Palindrome");
    }
}
