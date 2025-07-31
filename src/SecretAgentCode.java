import java.util.Random;

public class SecretAgentCode {
    //    8. **Secret Agent Code** – Random 4-digit pin (1000-9999); if divisible by 7 print `"Ultra secure"`.
    public static void main(String[] args) {

        Random random = new Random();
        int pin = random.nextInt(1000, 9999);
        if (pin % 7 == 0) {
            System.out.println("Ultra Secure");
        } else {
            System.out.println("Horrible pin");
        }

    }
}
