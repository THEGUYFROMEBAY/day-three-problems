import java.util.Random;

public class RainbowUnicorFinder {
    //18. **Rainbow Unicorn Finder** – rnd.nextInt(1000); if equals 777 print `"Unicorn found!"` else `"Keep searching"`.
    public static void main(String[] args) {

        Random random = new Random();
        int unicorn = random.nextInt(1000);
        if (unicorn == 777) {
            System.out.println("Unicorn found");
        } else {
            System.out.println("keep Searching");
        }

    }
}