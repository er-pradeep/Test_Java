public class ArrayElementProduct {

    /*Given an array nums of n integers where n > 1,  return an array output such that output[i] is
    equal to the product of all the elements of nums except nums[i].

    Example:

    Input:  [1,2,3,4]
    Output: [24,12,8,6]

    Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array
    (including the whole array) fits in a 32 bit integer.

    Note: Please solve it without division and in O(n).*/


    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        int length = nums.length;
        int [] answer = new int[length];

        answer[0]=1;
        for(int i =1;i<length;i++){
            answer[i]= nums[i-1] * answer[i-1];
        }

        int R=1;
        for(int i = length-1;i>=0;i--){
            answer[i] = answer[i]*R;
            R = R * nums[i];
        }
        for (int i: answer) {
            System.out.print(i +", ");
        }

    }
}
