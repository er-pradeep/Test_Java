package sorting;

public class MergeSort {
    public static void main(String[] args) {
        int [] intArr = {-20,35,22,55,1,6,0,93,-1,-3};
        mergeSort(intArr,0,intArr.length);

        for(int i =0;i<intArr.length;i++){
            System.out.print(intArr[i]+",");
        }
    }

    public static void mergeSort(int [] intArr,int start, int end){
        if(end-start<2){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(intArr,start,mid);
        mergeSort(intArr,mid,end);

        merge(intArr,start,mid,end);
    }

    public  static void merge(int [] input, int start, int mid, int end){
        if(input[mid-1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex=0;
        int [] temp = new int [end-start];

        while(i < mid && j < end)
        {
            temp[tempIndex++] = input[i] <=input[j] ? input[i++] : input[j++];
        }
        System.arraycopy(input, i, input, start+tempIndex,mid-i);
        System.arraycopy(temp,0,input, start, tempIndex);

    }
}
