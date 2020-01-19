import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class StrongInteger_ {

    private final int integer;
    private final int strongness;

    public StrongInteger_(int integer, int strongness) {
        this.integer = integer;
        this.strongness = strongness;
    }

    @Test
    public void execute() {
        assertThat(new StrongInteger(integer).strongness()).isEqualTo(strongness);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {2, 1},
                {4, 2},
                {1, 0},
                {3, 0},
                {6, 1},
                {8, 3},
                {12, 2},
                {14, 1},
                {16, 4},
                {0, 1},
        };
    }
}
