import java.util.Random;

public class WizardSpellFailure {
    //    10. **Wizard Spell Failure** – 0-9; if even `"Spell fizzles"`, else `"Spell succeeds!"`.
    public static void main(String[] args) {

        Random random = new Random();
        int spell = random.nextInt(0, 8);
        if (spell % 2 == 0) {
            System.out.println("spell fizzes");
        } else {
            System.out.println("Spell Suceeds");
        }

    }
}
