import java.util.Random;

public class SpaceLaunchWindow {
    //    14. **Space Launch Window** – Random minute 0-59; if minute<15 print `"Launch now!"` else `"Hold launch"`.
    public static void main(String[] args) {

        Random random = new Random();
        int minute = random.nextInt(1, 100);
        if (minute < 15) {
            System.out.println("Launch");
        } else {
            System.out.println("hold launch");
        }

    }
}
