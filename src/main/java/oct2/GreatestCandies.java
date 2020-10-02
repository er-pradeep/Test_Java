package oct2;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static void main(String[] args) {
        int [] candies = {4,2,1,1,2};
        System.out.println(kidsWithCandies(candies,1));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List highestCandiesList = new ArrayList();

        int max=Integer.MIN_VALUE;
        List<Boolean> list= new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            max= Math.max(candies[i], max);
        }
        //int max = Arrays.stream(candies).max().getAsInt();

        // find greatest
        /*int max = candies[0];
        for(int can : candies){
            if (max < can)
                max = can;
        }*/

        // interate over candies and add extra candies and check if it is equal to or greater than greatest - then add true otherwise false
        for(int can : candies){
            if(can+extraCandies >= max ){
                highestCandiesList.add(true);
            }else{
                highestCandiesList.add(false);
            }
        }
        return highestCandiesList;
    }
}
