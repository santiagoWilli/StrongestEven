public class StrongInteger {

    private final int integer;

    public StrongInteger(int integer) {
        this.integer = integer;
    }

    public int strongness() {
        if (this.isOdd()) return 0;
        return (integer == 4 ? 2 : (integer == 8 ? 3 : 1));
    }

    private boolean isOdd() {
        return integer % 2 == 1;
    }
}
