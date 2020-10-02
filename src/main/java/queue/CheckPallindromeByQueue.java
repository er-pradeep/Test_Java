package queue;

import java.util.LinkedList;

public class CheckPallindromeByQueue {

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

    public static boolean checkForPalindromeFromUdemy(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }

    public static boolean checkForPalindrome(String string) {
        string = string.toLowerCase();
        //push, pop, addlast, removefirst
        // add in stack
        // add in queue

        // do removal from stack and queue at the same time till half lenght
        // if any mismatch then return false
        char [] charArr = string.toCharArray();
        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        for(int i = 0;i<charArr.length;i++){
            if(charArr[i]>='a' && charArr[i] <= 'z'){
                stack.push(charArr[i]);
                queue.add(charArr[i]);
            }
        }
        int lengthOfString = stack.size();
        boolean palindromeCheck = false;
        while(lengthOfString>0 && !stack.isEmpty() && !queue.isEmpty()){
            if(stack.pop()==queue.remove()){
                lengthOfString--;
                palindromeCheck = true;
                continue;
            }
        }
        if(palindromeCheck && lengthOfString==0)
            return  true;
        return false;
    }
}
