import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(Parameterized.class)
public class StrongestEven_ {
    private final int[] interval;
    private final Integer strongestEven;
    private final Class exception;

    public StrongestEven_(int[] interval, Integer strongestEven, Class exception) {
        this.interval = interval;
        this.strongestEven = strongestEven;
        this.exception = exception;
    }

    @Test
    public void execute() {
        try {
            assertThat(StrongestEven.of(interval)).isEqualTo(strongestEven);
            assertThat(exception).isEqualTo(null);
        } catch (Exception e) {
            assertThat(exception).isNotEqualTo(null);
        }
    }

    @Parameterized.Parameters
    public static Object[][] cases() {
        return new Object[][]{
                {new int[]{4, 2}, null, StrongestEven.IllegalIntervalException.class},
                {new int[]{1, 2}, 1, null},
                {new int[]{2, 4}, 2, null},
        };
    }
}
