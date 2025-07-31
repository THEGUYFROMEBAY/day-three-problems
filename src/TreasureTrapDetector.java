import java.util.Random;

public class TreasureTrapDetector {
    //    48. **Treasure Trap Detector** – 0-9; if 4 OR 7 print `"Trap sprung!"` else `"Safe"`.
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        if (num == 4 || num == 7) {
            System.out.println("Trap sprung!");
        } else {
            System.out.println("Safe");
        }
    }
}
