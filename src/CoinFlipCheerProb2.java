import java.util.Random;

public class CoinFlipCheerProb2 {
    //    2. **Coin-Flip Cheer** – `boolean heads = rnd.nextBoolean();` → heads `"Woo-hoo!"`, tails `"Darn!"`.
    public static void main(String[] args) {

        Random random = new Random();
        boolean coin = random.nextBoolean();
        if (coin) {
            System.out.println("Woohoo: Heads");
        } else {
            System.out.println("Darn!: Tails");
        }

    }
}
