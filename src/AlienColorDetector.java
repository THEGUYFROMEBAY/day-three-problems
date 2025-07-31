import java.util.Random;

public class AlienColorDetector {
    //    5. **Alien Color Detector** – 0-2 → `"Green"`, `"Purple"`, `"Blue"`; if blue print `"Rare alien!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int color = random.nextInt(0, 3);
        if (color == 0) {
            System.out.println("Green");
        } else if (color == 1) {
            System.out.println("Purple");
        } else if (color == 2) {
            System.out.println("blue");
            System.out.println("Rare Alien");
        }

    }
}
