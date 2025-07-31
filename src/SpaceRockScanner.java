import java.util.Random;

public class SpaceRockScanner {
    //    26. **Space Rock Scanner** – Mass 1-100 kg; divisible by 3 `"Iron"`, by 5 `"Gold"`, by both `"Platinum"`.
    public static void main(String[] args) {

        Random random = new Random();
        int mass = random.nextInt(101);
        if (mass % 3 == 0) {
            System.out.println("iron");
        } else if (mass % 5 == 0) {
            System.out.println("gold");
        } else if (mass % 5 == 0 && mass % 3 == 0) {
            System.out.println("Platinum");
        }

    }
}
