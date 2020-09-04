package twentyfiveaug;

public class ZeroMoves {
//Given an array nums, write a function to move all 0's to the end
// of it while maintaining the relative order of the non-zero elements.
    public static void main(String[] args) {
        int [] intArr = {0,1,0,3,12};
        int [] newArr = new int[intArr.length];

        int count=0;
        for(int i : intArr){
            if(i!=0){
                newArr[count++]=i;
            }
        }
        for(int k = count;k<intArr.length;k++){
            newArr[k++] = 0;
        }

        for(int l : newArr){
            System.out.println(l);
        }
    }
}
