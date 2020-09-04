import java.util.Random;

public class RandomStringGenerator {

    public static void main(String[] args) {
        int TRANSACTION = 12345;
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String INITIAL = "FT";
        StringBuilder patternToFrame = new StringBuilder();
        patternToFrame.append(INITIAL);
        patternToFrame.append(TRANSACTION);

        Random rnd = new Random();
        while (patternToFrame.length() < 21) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            patternToFrame.append(SALTCHARS.charAt(index));
        }
        System.out.println(patternToFrame);
        }
}
