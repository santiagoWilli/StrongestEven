public class StrongInteger {

    private final int integer;

    public StrongInteger(int integer) {
        this.integer = integer;
    }

    public int strongness() {
        if (this.isOdd()) return 0;
        return (integer == 2 ? 1 : 2);
    }

    private boolean isOdd() {
        return integer % 2 == 1;
    }
}
