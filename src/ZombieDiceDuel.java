import java.util.Random;

public class ZombieDiceDuel {
    //    17. **Zombie Dice Duel** – Roll two dice; if both 6 print `"Zombie wins"`, else `"You escape"`.
    public static void main(String[] args) {

        Random random = new Random();
        Random random2 = new Random();
        int dice1 = random.nextInt(6);
        int dice2 = random.nextInt(6);
        if (dice1 == 6 && dice2 == 6) {
            System.out.println("Zombie Wins");
        } else {
            System.out.println("you Escape");
        }

    }
}
