import java.util.Random;

public class CookieQualityCheck {
    //    9. **Cookie Quality Check** – Random crispiness 0-10; if 4-6 `"Perfect"`, else if <4 `"Too soft"`, else `"Burnt"`.
    public static void main(String[] args) {

        Random random = new Random();
        int crispiness = random.nextInt(10);
        if(crispiness <= 6 && crispiness >= 4){
            System.out.println("Perfect");
        }
        else if (crispiness <= 3){
            System.out.println("too soft");
        }
        else {
            System.out.println("Burnt");
        }

    }
}
