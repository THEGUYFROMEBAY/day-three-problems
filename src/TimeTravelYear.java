import java.util.Random;

public class TimeTravelYear {
    //38. **Time-Travel Year** – 1800-2200; if year<2000 `"Past"`, 2000-2029 `"Present"`, else `"Future"`.
    public static void main(String[] args) {

        Random random = new Random();
        int year = random.nextInt(9999);
        if (year < 2000) {
            System.out.println("Past");
        } else if (year > 2000 && year < 2029) {
            System.out.println("Present");
        } else {
            System.out.println("Future");
        }

    }
}
