package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    private static final int MAX_NUMBER_RANGE = 101;

    public static int getRandomNum(int origin, int bound) {
        return RANDOM.nextInt(origin, bound);
    }

    public static int getRandomNum() {
        return RANDOM.nextInt(MAX_NUMBER_RANGE);
    }
}
