import java.util.Random;

public class ComicPowCounter {
    //    30. **Comic Pow Counter** – Random punches 1-10; if punches>7 print `"POW POW POW!"` else `"pow"` that many times (copy lines).
    public static void main(String[] args) {

        Random random = new Random();
        int punches = random.nextInt(1, 10);
        if (punches > 7) {
            System.out.println("POW POW POW");
        } else {
            for (int i = 0; i < punches; i++) {
                System.out.println("pow");
            }
        }

    }
}
