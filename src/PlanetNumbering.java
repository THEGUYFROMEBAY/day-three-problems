import java.util.Random;

public class PlanetNumbering {
    //28. **Planet Numbering** – Pick 1-8; if 3 print `"Earth"`, else `"Planet #X"`.
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt(1, 8);
        if (number == 3) {
            System.out.println("Earth");
        } else {
            System.out.println("Planet: x");
        }

    }
}
