import java.util.Random;

public class DragonEggHatch {
    //    16. **Dragon Egg Hatch** – Chance number 0-99; if <5 print `"Dragon hatches!"` else `"Egg is quiet."`
    public static void main(String[] args) {

        Random random = new Random();
        int chance = random.nextInt(0, 99);
        if (chance < 5) {
            System.out.println("Dragon Hatches");
        } else {
            System.out.println("egg is quiet");
        }

    }
}
