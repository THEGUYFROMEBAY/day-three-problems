import java.util.Random;

public class WeatherSpinner {
    //    6. **Weather Spinner** – 0-3 → `"Sunny"`, `"Rainy"`, `"Snowy"`, `"Windy"`; if `"Snowy"` print `"Build a snowman!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int weather = random.nextInt(0, 3);
        if (weather == 0) {
            System.out.println("Snowy");
            System.out.println("Build a snowman");
        } else if (weather == 1) {
            System.out.println("Rainy");
        } else if (weather == 2) {
            System.out.println("sunny");
        } else if (weather == 3) {
            System.out.println("Windy");
        }

    }
}
