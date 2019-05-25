package coordinate.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PointTest {
    @Test
    void x좌표가_24를_넘어가는_경우() {
        assertThatThrownBy(() -> new Point(new Coordinate(25), new Coordinate(1))).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void y좌표가_24를_넘어가는_경우() {
        assertThatThrownBy(() -> new Point(new Coordinate(1), new Coordinate(25))).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void x좌표가_0이하인_경우() {
        assertThatThrownBy(() -> new Point(new Coordinate(0), new Coordinate(3))).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void y좌표가_0이하인_경우() {
        assertThatThrownBy(() -> new Point(new Coordinate(2), new Coordinate(0))).isInstanceOf(IllegalArgumentException.class);
    }
}
