import java.util.Random;

public class TreasureMapRow {
    //    9. **Treasure Map Row** – Random row 1-5; if row 3 print `"X marks the spot"` else `"Keep walking"`.
    public static void main(String[] args) {

        Random random = new Random();
        int randomRow = random.nextInt(1, 5);
        if (randomRow == 3) {
            System.out.println("X Marks the spot");
        } else {
            System.out.println("keep Walking");
        }

    }
}
