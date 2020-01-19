import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StrongestEven {

    public static Integer of(int[] interval) {
        if (interval[0] >= interval[1]) throw new IllegalIntervalException();
        Integer[] strongnessArray = getStrongnesses(interval);
        int maxStrongness = strongnessArray[0];
        int index = 0;
        for (int i = 1; i < strongnessArray.length; i++) {
            if (strongnessArray[i] > maxStrongness) {
                maxStrongness = strongnessArray[i];
                index = i;
            }
        }
        return interval[0] + index;
    }

    private static Stream<Integer> stream(int min, int max) {
        return IntStream
                .range(min, ++max)
                .boxed();
    }

    private static Integer[] getStrongnesses(int[] interval) {
        return stream(interval[0], interval[1])
                .map(i -> new StrongInteger(i).strongness())
                .toArray(Integer[]::new);
    }

    static class IllegalIntervalException extends RuntimeException {}
}
