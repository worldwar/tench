package tw.zhuran.tench;

import java.util.List;
import java.util.Random;

public class R {
    private static Random random = new Random();

    public static int dice() {
        return number(1, 6);
    }

    public static int dealer() {
        return number(1, 4);
    }

    public static String digital(int length) {
        StringBuilder result = new StringBuilder(10);
        for (int i = 0; i < length; i++) {
            int value = random.nextInt(10);
            result.append(value);
        }
        return result.toString();
    }

    public static <T> T pick(List<T> collection) {
        int index = random.nextInt(collection.size());
        return collection.get(index);
    }

    public static boolean probability(double p) {
        if (p >= 1) {
            return true;
        }
        if (p <= 0) {
            return false;
        }
        int threshold = (int)(p * 100);
        int point = number(0, 99);
        return point < threshold;
    }

    public static int number(int min, int max) {
        if (min > max) return number(max, min);
        return random.nextInt(max - min + 1) + min;
    }
}
