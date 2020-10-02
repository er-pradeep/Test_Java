public class MergeSortedArray {

    public static void main(String[] args) {
        int [] num1 = {1,2,3,0,0,0};
        int [] num2 = {2,5,6};
        int [] temp = new int[num1.length];

        int l=0,m=0,index=0;
        for(int i =0;i<num1.length;i++){
            if(num1[l] > num2[m]){
                temp[index] = num2[m];
                m++;
                index++;
            }
            if(num1[l]<num2[m]){
                temp[index] = num1[l];
                index++;
                l++;
            }
            if(num1[l] == num2[m]){
                temp[index] = num1[l];
                index++;
                i++;
                l++;
                temp[index] = num2[m];
                m++;
                i++;
                index++;
            }
        }

        for(int i : temp){
            System.out.print(i+",");
        }
    }
}
