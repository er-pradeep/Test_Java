package sorting;

public class RecursiveInsertionSort {
    public static void main(String[] args) {

            int [] intArr = {-20,35,22,55,1,6,0,93,-1,-3};
          /*  for(int i =0;i<intArr.length;i++){
                int newElement = intArr[i];
                int m;
                for(m=i;m>0 && intArr[m-1] > newElement ;m--){
                    intArr[m]=intArr[m-1];
                }
                intArr[m]=newElement;
            }*/

            insertionSort(intArr,intArr.length);
            for(int i =0;i<intArr.length;i++){
                System.out.print(intArr[i]+",");
            }

    }

    public static void insertionSort(int [] input, int numItems){
        if(numItems < 2) {
            return;
        }
        insertionSort(input,numItems-1);
        int newElement = input[numItems-1];
        int m;
        for(m=numItems-1;m>0 && input[m-1] > newElement ;m--){
            input[m]=input[m-1];
        }
        input[m]=newElement;
    }
}
