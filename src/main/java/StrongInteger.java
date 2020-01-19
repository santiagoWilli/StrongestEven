public class StrongInteger {

    private final int integer;

    public StrongInteger(int integer) {
        this.integer = integer;
    }

    public int strongness() {
        return strongness(integer, 0);
    }

    private int strongness(int number, int timesDividedBy2) {
        return 1;
    }
}
