import java.util.Random;

public class PetAdoptionDay {
    //    25. **Pet Adoption Day** – Random species choose dog/cat/rabbit; if rabbit `"Hop home!"`
    public static void main(String[] args) {

        Random random = new Random();
        int animal = random.nextInt(4);
        if (animal == 0) {
            System.out.println("dog");
        } else if (animal == 1) {
            System.out.println("cat");
        } else if (animal == 2) {
            System.out.println("rabbit");
            System.out.println("hop home");
        }

    }
}
