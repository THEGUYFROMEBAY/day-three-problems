import java.util.Random;

public class HahaNumber {
    //    12. **Ha-Ha Number** – Random int 1-100; if multiple of 11 print `"Ha-ha!"` else the number.
    public static void main(String[] args) {

        Random random = new Random();
        int hahaNumber = random.nextInt(1, 101);
        if (hahaNumber % 11 == 0) {
            System.out.println("Haha Number");
        } else {
            System.out.println(hahaNumber);
        }

    }
}
