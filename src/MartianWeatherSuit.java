import java.util.Random;

public class MartianWeatherSuit {
    //    22. **Martian Weather Suit** – Temp -60 to 20; if temp<-30 `"Wear heater suit"` else `"Standard suit"`.
    public static void main(String[] args) {

        Random random = new Random();
        int percent = random.nextInt(101);
        if (percent <= 20) {
            System.out.println("Red");
        } else if (percent <= 60 && percent > 21) {
            System.out.println("Yellow");
        } else if (percent >= 61) {
            System.out.println("Green");
        }

    }
}
