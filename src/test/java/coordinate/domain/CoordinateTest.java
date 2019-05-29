package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CoordinateTest {
    @Test
    void 좌표가_24를_넘어가는_경우() {
        assertThatThrownBy(() -> Coordinate.getCoordinate(25)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 좌표가_0이하인_경우() {
        assertThatThrownBy(() -> Coordinate.getCoordinate(0)).isInstanceOf(IllegalArgumentException.class);
    }
}
