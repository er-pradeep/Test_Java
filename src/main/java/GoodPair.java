public class GoodPair {
/*
    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
    A pair (i,j) is called good if nums[i] == nums[j] and i < j.
          */

    public static void main(String[] args) {
        //int [] num ={1,2,3,1,1,3};
        //int [] num ={1,1,1,1};
        int [] num ={1,2,3};
        int count = 0;
        for(int i = 0;i<num.length;i++){
            for(int j = i;j<num.length;j++){
                if(num[i]==num[j] && i<j){
                    System.out.println("("+i+","+j+")");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
