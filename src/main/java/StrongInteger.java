public class StrongInteger {

    private final int integer;

    public StrongInteger(int integer) {
        this.integer = integer;
    }

    public int strongness() {
        return (isZero() ? 1 : strongness(integer, 0));
    }

    private int strongness(int integer, int timesDividedBy2) {
        if (isOdd(integer)) return timesDividedBy2;
        return strongness(integer/2, ++timesDividedBy2);
    }

    private boolean isOdd() {
        return integer % 2 == 1;
    }

    private static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    private boolean isZero() {
        return integer == 0;
    }
}
