import java.util.Random;

public class MagicDoorPassword {
    public static void main(String[] args) {
        Random random = new Random();
        char letter = (char) (random.nextInt(26) + 'A');
        if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("Door opens");
        }
    }
}
