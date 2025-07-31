import java.util.Random;

public class SnowballFightScore {
    //    5. **Snowball Fight Score** – Hits 0-20; if hits≥15 && rnd.nextBoolean() `"Champion!"`.
    public static void main(String[] args) {

        Random rand = new Random();
        int hits = rand.nextInt(21);
        boolean champ = rand.nextBoolean();
        if (champ && hits >= 15) {
            System.out.println("Champion");
        }


    }
}
