import java.util.Random;

public class CandyJarGuess {
    //    4. **Candy Jar Guess** – Random candies 10-30; if > 20 print `"Sugar Rush!"` else `"Moderate snack."`
    public static void main(String[] args) {

        Random random = new Random();
        int candies = random.nextInt(10, 30);
        if (candies > 20) {
            System.out.println("SUGAR RUSH!!!");
        } else {
            System.out.println("Moderate Snack");
        }


    }
}
