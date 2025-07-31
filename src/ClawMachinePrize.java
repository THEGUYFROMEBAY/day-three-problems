import java.util.Random;

public class ClawMachinePrize {
    //36. **Claw Machine Prize** – Random plush 0-4; if index==favorite variable print `"Jackpot!"
    public static void main(String[] args) {

        Random random = new Random();
        int plush = random.nextInt(5);
        byte fav = 3;
        if (plush == fav) {
            System.out.println("favourite");
        } else {
            System.out.println("not favourite");
        }

    }
}
