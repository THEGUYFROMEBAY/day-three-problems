import java.util.Random;

public class SillySentanceBuilder {
    public static void main(String[] args) {
        String[] adjectives = {"Stinky", "smelly", "tiny", "grumpy", "sleepy"};
        String[] animals = {"cat", "elephant", "kangaroo", "sloth", "hedgehog"};
        String[] places = {"zoo", "moon", "school", "jungle", "library"};

        Random rand = new Random();

        String adjective = adjectives[rand.nextInt(adjectives.length)];
        String animal = animals[rand.nextInt(animals.length)];
        String place = places[rand.nextInt(places.length)];

        String sentence = "The " + adjective + " " + animal + " went to the " + place + ".";
        System.out.println(sentence);
    }
}
