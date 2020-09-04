package twentynineuag;

public class CompressString {
    public static void main(String[] args) {
        //      char [] charArr = {'a','b','b','b','b','b','b','b','b','b','b','b','b','b','b'};
        char [] charArr = {'a','a','b','b','c','c','c'};

        int anchor = 0, write =0;
        for(int read =0; read <charArr.length; read++){
            if(read+1 == charArr.length || charArr[read +1 ] != charArr[read]){
                charArr[write++] = charArr[anchor];
                if(read > anchor){
                    for(char c : (""+(read-anchor+1)).toCharArray()){
                        charArr[write++]=c;
                    }
                }
                anchor = read +1 ;
            }
        }
        System.out.println(write);
        for (char c:charArr){
            System.out.print(c + ", ");
        }
    }

}
