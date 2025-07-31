import java.util.Random;

public class MonsterSize {
    //    13. **Monster Size** – Height 50-300 cm; <100 `"Tiny"`, 100-200 `"Medium"`, >200 `"Giant"`.
    public static void main(String[] args) {

        Random random = new Random();
        int heightCm = random.nextInt(0, 300);
        if (heightCm < 100) {
            System.out.println("tiny");
        } else if (heightCm < 200) {
            System.out.println("medium");
        } else if (heightCm > 200) {
            System.out.println("Giant");
        }

    }
}
