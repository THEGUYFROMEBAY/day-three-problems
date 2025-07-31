import java.util.Random;

public class SuperheroAssignment {
    //    11. **Superhero Assignment** – 0-4 choose `"Fly"`, `"Strength"`, `"Invisibility"`, `"Speed"`, `"Water-Breath"`; if `"Fly"` print `"Sky patrol!"`
    public static void main(String[] args) {

        Random random = new Random();
        int power = random.nextInt(0, 5);
        if (power == 0) {
            System.out.println("fly");
            System.out.println("Sky Patrol");
        } else if (power == 1) {
            System.out.println("Strength");
        } else if (power == 2) {
            System.out.println("Invisiblity");
        } else if (power == 3) {
            System.out.println("Speed");
        } else if (power == 4) {
            System.out.println("Water Breath");
        }

    }
}
