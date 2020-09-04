package sixteenaug;

import java.util.Arrays;

public class NonOverlappingIntervals {
    public static void main(String[] args) {
        int intervals[][] = {{1,2},{2,3},{3,4},{-100,3},{5,7}};

        Arrays.sort(intervals,(a,b)-> a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]);

        int minErase=0;
        int prev = Integer.MIN_VALUE;
        for (int [] interval: intervals) {
            if(prev > interval[0]){
                minErase++;
            }else{
                prev = interval[1];
            }
        }
        System.out.println("Minimum erase required is "+minErase);

    }
}
