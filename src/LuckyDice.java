import java.util.Random;

public class LuckyDice {
    //    **Lucky Dice** – Roll `int roll = rnd.nextInt(6) + 1;` → print `"Lucky!"` if 6, else the roll value.
    public static void main(String[] args) {
        Random random = new Random();
        int dice = random.nextInt(0, 7);
        if (dice == 6) {
            System.out.println("Lucky");
        } else {
            System.out.println(dice);
        }
    }
}
