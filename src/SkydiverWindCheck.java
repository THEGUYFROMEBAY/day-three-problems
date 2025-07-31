import java.util.Random;

public class SkydiverWindCheck {
    //    34. **Skydiver Wind Check** – Speed 0-40; if speed>25 `"No jump"`.
    public static void main(String[] args) {

        Random random = new Random();
        int speed = random.nextInt(10);
        if (speed > 25) {
            System.out.println("No jump");
        }


    }
}
