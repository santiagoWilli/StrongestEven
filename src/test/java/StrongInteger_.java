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
        assertThat(new StrongInteger(2).strongness()).isEqualTo(1);
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][] {
                {2, 1},
        };
    }
}
