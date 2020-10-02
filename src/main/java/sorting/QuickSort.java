package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int [] intArr = {-20,35,22,55,1,6,0,93,-1,-3};
        quickSort(intArr,0,intArr.length);

        for (int i: intArr) {
            System.out.print(i+",");
        }
    }

    public static void quickSort(int [] input, int start, int end){
        if(end-start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input,start,pivotIndex);
        quickSort(input,pivotIndex+1,end);
    }
    public static int partition(int [] input, int start, int end){
        int pivot = input [start];
        int i = start;
        int j = end;
        while(i <j){

            // empty loop body
            while(i < j && input [--j] >= pivot);
            if(i<j){
                input [i] = input[j];
            }

            // empty loop body
            while( i < j && input [++i] <= pivot){
                if(i < j){
                    input[j] = input[i];
                }
            }
        }
        input [j] = pivot;
        return j;
    }
}
