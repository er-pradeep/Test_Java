package search;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int [] intArray = {-22,-15,1,7,20,35,55};
        System.out.println(recursiveBinarySearch(intArray,202));
    }

    public static int recursiveBinarySearch(int [] intArray, int value){
        return recursiveBinarySearch(intArray,0,intArray.length,value);
    }

    public static int recursiveBinarySearch (int [] intArray,int start, int end, int value){
        if(start >= end){
            return -1;
        }
        int mid = (start + end)/2;
        if(value == intArray[mid]){
            return mid;
        }else if(intArray[mid]>value){
            return recursiveBinarySearch(intArray,start,mid,value);
        }else {
            return recursiveBinarySearch(intArray,mid+1,end,value);
        }
    }
}
