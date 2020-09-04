package twentyeightaug;

public class BinaryAddition {
    public static void main(String[] args) {
        String a ="1010";
        String b = "1011";

        int l1 = a.length()-1;
        int l2=b.length()-1;
        int carry=0;
        StringBuilder result = new StringBuilder();
        while(l1>=0 || l2>=0)
        {
            int x = l1 >=0 ?  a.charAt(l1)  - '0':0;
            int y = l2 >=0 ?  b.charAt(l2) - '0' :0;
            int value = x + y + carry;
            int res = value%2;
            result.append(res);
            carry = value/2;
            l1--;
            l2--;
        }
        if(carry>0){
            result.append(carry);
        }
        System.out.println(result.reverse().toString());
    }
}
