import java.util.Random;

public class DinosaurRoarVolume {
    //    37. **Dinosaur Roar Volume** – dB 50-120; if 100-120 `"T-Rex"` else `"Raptor"`.
    public static void main(String[] args) {

        Random random = new Random();
        int db = random.nextInt(50, 120);
        if (db > 100 && db < 120) {
            System.out.println("T-rex");
        } else {
            System.out.println("Raptor");
        }

    }
}
