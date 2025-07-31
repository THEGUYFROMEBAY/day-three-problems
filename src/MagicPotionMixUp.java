import java.util.Random;

public class MagicPotionMixUp {
    //    24. **Magic Potion Mix-Up** – Random color char `'R','G','B'`; combine two randoms – red+blue prints `"Purple!"`.
    public static void main(String[] args) {

        Random random = new Random();
        char letter1 = (char) random.nextInt(80, 85);
        char letter2 = (char) random.nextInt(61, 67);
        System.out.println(letter1);
        System.out.println(letter2);

        if (letter2 == 'R' && letter2 == 'B') {
            System.out.println("Purple !");
        }
    }
}