package oct2;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int [] nums ={2,5,1,3,4,7};
        int n =3;
        int [] result = shuffle(nums,n);
        Arrays.stream(result).forEach(num -> System.out.print(num));
    }
    public static int[] shuffle(int[] nums, int n) {
        int newNums [] = new int[nums.length];
        int k=0;
        for(int i = 0;i<nums.length/2;i++){
            newNums[k++] = nums[i];
            newNums[k++] = nums[i+n];
        }
        return newNums;
    }
}
