import java.util.Random;

public class SleepyMeter {
    //    32. **Sleepy Meter** – Hours slept 0-12; <5 `"Zombie mode"`, 5-8 `"Okay"`, >8 `"Supercharged"`.
    public static void main(String[] args) {

        Random random = new Random();
        int hoursSlept = random.nextInt(12);
        if (hoursSlept < 5) {
            System.out.println("Zombie Mode");
        } else if (hoursSlept > 5 && hoursSlept < 8) {
            System.out.println("Okay");
        } else if (hoursSlept > 8) {
            System.out.println("SuperCharged");
        }

    }
}
