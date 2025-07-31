import java.util.Random;

public class Magic8Ball {
    //    33. **Magic 8-Ball** – 0-5 messages `"Yes"`, `"No"`, `"Maybe"` etc.
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(6);
        if (number == 0) {
            System.out.println("Yes");
        }
        else if (number == 1) {
            System.out.println("no");
        }
        else if (number == 2) {
            System.out.println("Maybe");
        }
        else if (number == 3) {
            System.out.println("Perhaps");
        }
        else if (number == 4) {
            System.out.println("Depends");
        }
        else if (number == 5) {
            System.out.println("I Cant answer that Right now");
        }

    }
}
