package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int [] intArr = {-20,35,22,55,1,6,0,93,-1,-3};
        for(int i =0;i<intArr.length;i++){
            int newElement = intArr[i];
            int m;
            for(m=i;m>0 && intArr[m-1] > newElement ;m--){
                intArr[m]=intArr[m-1];
            }
            intArr[m]=newElement;
        }
        for(int i =0;i<intArr.length;i++){
            System.out.print(intArr[i]+",");
        }
    }
}
