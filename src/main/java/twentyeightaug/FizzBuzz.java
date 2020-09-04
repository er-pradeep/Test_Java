package twentyeightaug;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        List fizzBuzzLst = new ArrayList<>();
        for(int i = 1; i <=15;i++){
            fizzBuzzLst.add(
                    i%15==0 ? "FizzBuzz" : i%5==0 ? "Buzz" : i%3==0 ? "Fizz" : i
            );
        }

        System.out.println(fizzBuzzLst);
    }
}
