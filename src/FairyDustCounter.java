import java.util.Random;

public class FairyDustCounter {
    //    49. **Fairy Dust Counter** – Sprinkles 1-50; if sprinkles%2==0 && sprinkles%5==0 print `"Sparkle storm!"`.
    public static void main(String[] args) {

        Random rand = new Random();
        int detector = rand.nextInt(10);
        if (detector == 4 || detector == 7) {
            System.out.println("Trap Sprung");
        } else {
            System.out.println("Safe");
        }

    }
}
