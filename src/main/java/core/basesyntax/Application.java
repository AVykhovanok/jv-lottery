package core.basesyntax;

public class Application {
    private static final int NUM_OF_GENERATED_BALLS = 3;

    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        for (int i = 0; i < NUM_OF_GENERATED_BALLS; i++) {
            System.out.println(Lottery.getRandomBall());
        }
    }
}
