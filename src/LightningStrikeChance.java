import java.util.Random;

public class LightningStrikeChance {
    //    39. **Lightning Strike Chance** – percent 0-99; if <2 `"ZAP!"` else `"Sky clear"`.
    public static void main(String[] args) {

        Random random = new Random();
        int precent = random.nextInt(0, 101);

        if (precent < 2) {
            System.out.println("zap");
        } else {
            System.out.println("Sky CLear");
        }

    }
}
