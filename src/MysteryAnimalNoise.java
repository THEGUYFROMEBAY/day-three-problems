import java.util.Random;

public class MysteryAnimalNoise {
    //    3. **Mystery Animal Noise** – Pick a number 0-3; 0: `"Woof"`, 1: `"Meow"`, 2: `"Moo"`, 3: `"Quack"`.
    public static void main(String[] args) {

        Random random = new Random();
        int mysteryAnimalNoise = random.nextInt(0, 3);
        if (mysteryAnimalNoise == 0) {
            System.out.println("Meow");
        } else if (mysteryAnimalNoise == 1) {
            System.out.println("Woof");
        } else if (mysteryAnimalNoise == 2) {
            System.out.println("moo");
        } else if (mysteryAnimalNoise == 3) {
            System.out.println("rawr");
        }

    }
}
