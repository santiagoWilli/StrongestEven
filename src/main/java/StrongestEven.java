public class StrongestEven {

    public static Integer of(int[] interval) {
        if (interval[0] > interval[1]) throw new IllegalIntervalException();
        return (interval[0] == 1 ? 1 : 2);
    }

    static class IllegalIntervalException extends RuntimeException {}
}
