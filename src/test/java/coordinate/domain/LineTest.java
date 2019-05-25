package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class LineTest {
    @Test
    void 거리_계산() {
        Points points = new Points(Arrays.asList(
                new Point(new Coordinate(14), new Coordinate(15)),
                new Point(new Coordinate(10), new Coordinate(10))));
        assertThat(new Line(points).calculateResult()).isEqualTo(6.403124, offset(0.00099));
    }
}
