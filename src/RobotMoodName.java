import java.util.Random;

public class RobotMoodName {
    //    7. **Robot Mood Light** – Random RGB 0-255 each; if red>200 && blue>200 print `"Magenta Bot"` else `"Regular Bot"`.
    public static void main(String[] args) {

        Random random = new Random();
        Random grandom = new Random();
        Random brandom = new Random();
        int green = grandom.nextInt(0, 255);
        int red = random.nextInt(0, 255);
        int blue = brandom.nextInt(0, 255);
        if (red > 200 && blue > 200) {
            System.out.println("Magenta Robot");
        } else {
            System.out.println("Regular Colour");
        }

    }
}
