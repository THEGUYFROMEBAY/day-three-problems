import java.util.Random;

public class RobotBatteryRool {
    //    23. **Robot Battery Roll** – Percent 0-100; 0-20 `"Red"`, 21-60 `"Yellow"`, else `"Green"`.
    public static void main(String[] args) {

        Random random = new Random();
        int percent = random.nextInt(101);
        if (percent > 20) {
            System.out.println("red");
        } else if (percent > 21 && percent < 60) {
            System.out.println("yellow");
        } else if (percent >= 61) {
            System.out.println("Green");
        }

    }
}
