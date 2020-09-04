package twentythreeaug;

public class AddString {
    /*Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.

    Note:

    The length of both num1 and num2 is < 5100.
    Both num1 and num2 contains only digits 0-9.
    Both num1 and num2 does not contain any leading zero.
    You must not use any built-in BigInteger library or convert the inputs to integer directly.

    */

    public static void main(String[] args) {
        AddString addString = new AddString();
        System.out.println(addString.addStrings("498828660196","840477629533"));
    }

    public String addStrings(String num1, String num2) {
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int value =0;
        int x = '6';
        System.out.println(x);
        while(num1Length >= 0 || num2Length >= 0){
            int x1 = num1Length >=0 ? num1.charAt(num1Length) - '0' :0;
            int x2 = num2Length >=0 ? num2.charAt(num2Length) - '0' :0;
            int sum = x1+x2+carry;
            value = sum%10;
            carry = sum/10;
            result.append(value);
            num1Length--;
            num2Length--;
        }
        if(carry!=0){
            result.append(carry);
        }
           return result.reverse().toString();
    }
}
