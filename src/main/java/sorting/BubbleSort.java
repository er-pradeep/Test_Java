package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int [] intArr = {12,3,6,9,0,34,2,7};
        for(int i=intArr.length-1;i>0;i--){
            for(int j =0;j<i;j++){
                if(intArr[j]<intArr[j+1]){
                    swap(intArr,i,j);
                }
            }
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
