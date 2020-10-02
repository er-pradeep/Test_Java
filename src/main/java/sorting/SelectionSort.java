package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] intArr = {-20,35,22,55,1,6,0,93,-1,-3};
        for(int i=intArr.length-1;i>0;i--){
            int largest = 0;
            for(int j =0;j<=i;j++){
                if(intArr[j]>intArr[largest]){
                    largest = j;
                }
            }
                swap(intArr, i, largest);
        }
        for (int i=0;i<intArr.length;i++){
            System.out.print(intArr[i]+",");
        }
    }
    public static void swap(int [] intArr,int i, int j){
        if(i==j)
            return;
        int temp = intArr[i];
        intArr[i]=intArr[j];
        intArr[j]=temp;
    }
}
