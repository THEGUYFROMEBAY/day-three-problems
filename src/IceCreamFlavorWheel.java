import java.util.Random;

public class IceCreamFlavorWheel {
    //    15. **Ice Cream Flavor Wheel** – 0-5 pick flavors; if `"Chocolate"` AND rnd.nextBoolean() true print `"Double scoop!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int pickflavors = random.nextInt(0, 5);
        boolean scoop = random.nextBoolean();
        if (pickflavors < 5) {
            System.out.println("Regular");
        }
        if (scoop && pickflavors == 5) {
            System.out.println("Double scoop Chocolate");
        }

    }
}
