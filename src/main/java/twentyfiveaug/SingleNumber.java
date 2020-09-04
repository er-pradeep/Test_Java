package twentyfiveaug;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    //Given a non-empty array of integers, every element appears twice except for one. Find that single one.
    public static void main(String[] args) {
        int [] intArr ={4,1,2,1,2};
        int a = 0;
        for (int i : intArr) {
            a ^= i;
        }
        System.out.println(a);


    /*    int sumOfSet = 0, sumOfNums = 0;
        Set<Integer> set = new HashSet();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
                sumOfSet += num;
            }
            sumOfNums += num;
        }
        return 2 * sumOfSet - sumOfNums;
    */

    }
}
