import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        List <Integer> pascalTriangle = new ArrayList<Integer>();
        List <Integer> aboveRow = new ArrayList<Integer>();
        int pascalTriangleLength = 6;
        for (int i =1;i<= pascalTriangleLength;i++)
        {
            pascalTriangle.clear();
            for(int k = pascalTriangleLength-i;k>0;k--){
                System.out.print(" ");
            }
            System.out.print("1 ");
            pascalTriangle.add(1);
            if(i>2){
                for(int m = 0;m<aboveRow.size()-1; m++){
                    int xx = aboveRow.get(m);
                    int yy = aboveRow.get(m+1);
                    System.out.print(xx+yy + " ");
                    pascalTriangle.add(xx+yy);
                }
            }
            aboveRow.add(1);
            if(i>1) {
                System.out.print("1");
                aboveRow.add(1);
                pascalTriangle.add(1);
            }
            aboveRow = new ArrayList<>(pascalTriangle);
            System.out.println();
        }

    }
}
