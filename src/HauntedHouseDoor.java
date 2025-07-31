import java.util.Random;

public class HauntedHouseDoor {
    //    20. **Haunted House Door** – Random door 1-3; 1 ghost, 2 candy, 3 nothing – print outcome.
    public static void main(String[] args) {

        Random random = new Random();
        int door = random.nextInt(1, 3);
        if (door == 1) {
            System.out.println("ghost");
        }
        if (door == 2) {
            System.out.println("Candy");
        }
        if (door == 3) {
            System.out.println("Nothing");
        }

    }
}
