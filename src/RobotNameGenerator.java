import java.util.Random;

public class RobotNameGenerator {
    //    31. **Robot Name Generator** – Letters A-Z two random, digits 0-9 two random → print `RX-7Q` style name.
    public static void main(String[] args) {
        Random rand = new Random();

        char letter1 = (char) ('A' + rand.nextInt(26));
        char letter2 = (char) ('A' + rand.nextInt(26));
        int digit1 = rand.nextInt(10);
        int digit2 = rand.nextInt(10);

        System.out.println("" + letter1 + letter2 + "-" + digit1 + digit2);
    }
}
