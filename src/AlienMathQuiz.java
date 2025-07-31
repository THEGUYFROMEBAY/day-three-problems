import java.util.Random;

public class AlienMathQuiz {
    //    1. **Alien Math Quiz** – Random a,b 1-10; if a+b is even print `"Alien correct"` else `"Alien wrong"`.
    public static void main(String[] args) {

        Random random = new Random();
        Random random1 = new Random();
        int a = random.nextInt(10);
        int b = random1.nextInt(10);
        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("Alien Right");
        } else {
            System.out.println("Alien Wrong");
        }

    }
}
