import java.util.Random;

public class MysterySoupRating {
    //35. **Mystery Soup Rating** – rnd.nextDouble() 0-1; if >0.8 `"Delicious"`, 0.4-0.8 `"Meh"`, else `"Yuck"`.
    public static void main(String[] args) {

        Random rand = new Random();
        double rating = rand.nextDouble(1);
        if (rating > 0.8) {
            System.out.println("Delicious");
        } else if (rating < 0.8 && rating > 0.4) {
            System.out.println("Meh");
        } else if (rating < 0.4) {
            System.out.println("Yuck");
        }


    }
}
