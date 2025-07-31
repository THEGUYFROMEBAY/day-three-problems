import java.util.Random;

public class DanceMoveSelector {
    //27. **Dance Move Selector** – 0-5 moves; if `rnd.nextBoolean()` true print the move twice.
    public static void main(String[] args) {

        Random random = new Random();
        Random random2 = new Random();
        int selector = random.nextInt(6);
        boolean dance = random2.nextBoolean();
        if (selector == 0) {
            System.out.println("waltz");
        } else if (selector == 1) {
            System.out.println("Stanky Leg");
        } else if (selector == 2) {
            System.out.println("The floss");
        } else if (selector == 3) {
            System.out.println("The wave");
        } else if (selector == 4) {
            System.out.println("The worm");
        }
        if (selector == 0 && dance) {
            System.out.println("waltz");
        } else if (selector == 1 && dance) {
            System.out.println("Stanky Leg");
        } else if (selector == 2 && dance) {
            System.out.println("The floss");
        } else if (selector == 3 && dance) {
            System.out.println("The wave");
        } else if (selector == 4 && dance) {
            System.out.println("The worm");
        }


    }
}