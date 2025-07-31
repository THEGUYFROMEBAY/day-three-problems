import java.util.Random;

public class RobotCoinTossStreak {
    //    44. **Robot Coin Toss Streak** – Flip 3 times; count heads; ≥2 heads `"Robot wins"`.
    public static void main(String[] args) {

        Random rand = new Random();
        Random rand1 = new Random();
        Random rand2 = new Random();
        boolean toss = rand.nextBoolean();
        boolean toss1 = rand1.nextBoolean();
        boolean toss2 = rand2.nextBoolean();
        if (toss && toss1 && toss2) {
            System.out.println("Robot Wiins");
        }

    }
}
