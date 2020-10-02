package stack;


import java.util.LinkedList;

public class CheckPalindromeByStack {
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
        StringBuilder sb = new StringBuilder(string.length());
        LinkedList<Character> stack = new LinkedList<>();
        String toLowerCase = string.toLowerCase();
        for(int i =0;i<toLowerCase.length();i++){
            char c = toLowerCase.charAt(i);
            if(c>='a' && c<='z'){
                sb.append(c);
                stack.push(c);
            }
        }
        StringBuilder reverse = new StringBuilder(stack.size());
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }
        return  reverse.toString().equals(sb.toString());
    }
}
