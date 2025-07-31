import java.util.Random;

public class JellyBeanColorOdds {
    //    47. **Jellybean Color Odds** – Draw red? 30% chance using `rnd.nextInt(100)<30`; print result.
    public static void main(String[] args) {
        Random rnd = new Random();
        if (rnd.nextInt(100) < 30) {
            System.out.println("Red");
        } else {
            System.out.println("Not red");
        }
    }
}
