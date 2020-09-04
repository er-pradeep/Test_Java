package sixteenaug;

import java.util.ArrayList;
import java.util.List;

public class ReorderLogs {
    public static void main(String[] args) {
        /*Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
        Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]*/

        String [] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
        List <String> digitLogs = new ArrayList<String>();
        List <String> letterLogs = new ArrayList<String>();

        String str = "";
        for(int i =0; i < logs.length; i++){
            str = logs[i];
            String [] logArr = str.split(" ");
            try{
                int x = Integer.parseInt(logArr[1]);
                digitLogs.add(str);
            }catch (Exception e){
                letterLogs.add(str);
            }

        }
        String [] resultArr  = new String[logs.length];
        int counter=0;
        for (String letter: letterLogs) {
            resultArr[counter++] = letter;
        }

        for (String digit: digitLogs) {
            resultArr[counter++] = digit;
        }

        for (String letter: resultArr) {
            System.out.print(letter+ " ,");
        }
    }
}
