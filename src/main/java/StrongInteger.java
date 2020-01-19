public class StrongInteger {

    private final int integer;

    public StrongInteger(int integer) {
        this.integer = integer;
    }

    public int strongness() {
        if (integer == 1) return 0;
        return (integer == 2 ? 1 : 2);
    }
}
