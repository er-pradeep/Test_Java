import java.sql.SQLOutput;

public class TestJava {
    public static void main(String[] args) {
        String s="ZZ";
        char [] characterArray = s.toCharArray();
        int arrLength = characterArray.length;
        int excelColumnNumber=0;
        for(int charCount =0;charCount<characterArray.length;charCount++,arrLength--) {
            int yy = characterArray[charCount] - 64;
            excelColumnNumber = excelColumnNumber + (int)(yy * Math.pow(26,arrLength-1));
        }
        System.out.println(excelColumnNumber);

    }
}
