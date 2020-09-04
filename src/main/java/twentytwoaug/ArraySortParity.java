package twentytwoaug;

import java.util.ArrayList;
import java.util.List;

public class ArraySortParity {
    public static void main(String[] args) {
        int inputArr [] = {1,2,3,4};
        //output should be even first followed by odd

        List evenList = new ArrayList();
        List oddList = new ArrayList();
        for(int i : inputArr){
            if(i%2==0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }
        int finalArr [] = new int[inputArr.length];
        int m=0;
        for(Object i : evenList){
            finalArr[m] = (int)i;
            m++;
        }

        for(Object i : oddList){
            finalArr[m] = (int)i;
            m++;
        }

        for(int i : finalArr){
            System.out.println(i);
        }
    }

}
