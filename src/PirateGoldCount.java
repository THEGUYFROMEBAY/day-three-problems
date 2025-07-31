import java.util.Random;

public class PirateGoldCount {
    //    21. **Pirate Gold Count** – Coins 0-99; if coins>50 OR coins%13==0 print `"Yarr, rich!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int coins = random.nextInt(100);
        if (coins > 50 || coins % 13 == 0) {
            System.out.println("yarr rich");
        }

    }
}
