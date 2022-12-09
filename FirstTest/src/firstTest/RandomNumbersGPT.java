package firstTest;

public class RandomNumbersGPT {
    public static void main(String[] args) {
        // Create a new Random object
        java.util.Random rand = new java.util.Random();

        // Generate and print 10 random numbers
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(11);
            System.out.println(randomNumber);
        }
    }
}

