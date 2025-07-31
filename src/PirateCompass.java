import java.util.Random;

public class PirateCompass {
    //    42. **Pirate Compass** – Degrees 0-359; if 0-44 or 315-359 `"North"`, 45-134 `"East"`, etc.
    public static void main(String[] args) {
        int degrees = 73;
        if ((degrees >= 0 && degrees <= 44) || (degrees >= 315 && degrees <= 359)) {
            System.out.println("North");
        } else if (degrees >= 45 && degrees <= 134) {
            System.out.println("East");
        } else if (degrees >= 135 && degrees <= 224) {
            System.out.println("South");
        } else if (degrees >= 225 && degrees <= 314) {
            System.out.println("West");
        }
    }
}