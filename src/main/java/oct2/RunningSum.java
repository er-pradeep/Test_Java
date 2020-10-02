package oct2;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int [] nums = {3,1,2,10,1};
        RunningSum runningSum = new RunningSum();
        nums = runningSum.runningSum(nums);
        Arrays.stream(nums).forEach(num -> System.out.println(num));
    }

    public int[] runningSum(int[] nums) {

            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i-1];
            }
            return nums;
//Below my solution
       /* int [] newNum = new int[nums.length];
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            newNum[i]= sum;
        }
        return  newNum;*/
    }
}


