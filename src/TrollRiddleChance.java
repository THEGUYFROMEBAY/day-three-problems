import java.util.Random;

public class TrollRiddleChance {
    //    29. **Troll Riddle Chance** – 0-2; 0 wrong,1 correct,2 troll sleeps; handle each answer.
    public static void main(String[] args) {
        Random rand = new Random();
        int result = rand.nextInt(3);

        if (result == 0) {
            System.out.println("Wrong answer! The troll gets angry!");
        } else if (result == 1) {
            System.out.println("Correct! You may pass.");
        } else if (result == 2) {
            System.out.println("The troll falls asleep. You sneak by.");
        }
    }
}
