import java.util.Random;

public class Chp3PracticeExercises {
    public static void main(String[] args) {
        // Random randomGenerator = new Random();
        // System.out.println(randomGenerator.nextDouble() * 3 + 1);

        for(int i = 1; i <= 10 ; i ++)
            System.out.printf("\n%5.2f",Math.random() * 10 + 10);
    }
}
