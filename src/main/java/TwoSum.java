public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int [] finalResult = twoSum(nums,18);
        for (int i:finalResult) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int [] twoSumArray = new int[2];
        for (int outerLoop=0; outerLoop<=nums.length;outerLoop++ ) {
            for (int innerLoop=outerLoop+1; innerLoop<nums.length;innerLoop++ ) {
                if(nums[outerLoop]+nums[innerLoop] == target){
                    twoSumArray[0]=outerLoop;
                    twoSumArray[1]=innerLoop;
                }
            }
        }
        return  twoSumArray;
    }
}
