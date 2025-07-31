import java.util.Random;

public class MonsterEnergyLevel {
    //    43. **Monster Energy Level** – Energy 0-100; if divisible by 10 print `"Level-UP!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int energy = random.nextInt(101);
        if (energy % 10 == 0) {
            System.out.println("Level UP");
        }


    }
}
