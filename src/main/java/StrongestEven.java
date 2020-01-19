public class StrongestEven {

    public static Integer of(int[] interval) {
        if(interval[0] == 1) return 1;
        throw new IllegalIntervalException();
    }

    static class IllegalIntervalException extends RuntimeException {}
}
