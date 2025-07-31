import java.util.Random;

public class BubbleGumColorClash {
    //    40. **Bubble Gum Color Clash** – Choose two random colors; if they match print `"Super bubble!"`.
    public static void main(String[] args) {

        Random random = new Random();
        Random random1 = new Random();
        boolean colour1 = random.nextBoolean();
        boolean colour2 = random1.nextBoolean();
        if (colour1 == colour2) {
            System.out.println("super bubble");
        } else {
            System.out.println("not super bubble");
        }

    }
}
