package coordinate.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class ShapeTest {
    @Test
    void 선_생성() {
        Points points = new Points(Arrays.asList(new Point(new Coordinate(14), new Coordinate(15)), new Point(new Coordinate(10), new Coordinate(10))));
        assertThat(Shape.createFigure(points) instanceof Line).isTrue();
    }

    @Test
    void 삼각형_생성() {
        Points points = new Points(Arrays.asList(
                new Point(new Coordinate(1), new Coordinate(5)),
                new Point(new Coordinate(1), new Coordinate(1)),
                new Point(new Coordinate(5), new Coordinate(1))));
        assertThat(Shape.createFigure(points) instanceof Triangle).isTrue();
    }

    @Test
    void 사각형_생성() {
        Points points = new Points(Arrays.asList(
                new Point(new Coordinate(1), new Coordinate(5)),
                new Point(new Coordinate(1), new Coordinate(1)),
                new Point(new Coordinate(5), new Coordinate(1)),
                new Point(new Coordinate(5), new Coordinate(5))));
        assertThat(Shape.createFigure(points) instanceof Rectangle).isTrue();
    }

    @Test
    void 도형을_만들_수_없는_경우() {
        Points points = new Points(Arrays.asList(
                new Point(new Coordinate(1), new Coordinate(5)),
                new Point(new Coordinate(1), new Coordinate(1)),
                new Point(new Coordinate(5), new Coordinate(1)),
                new Point(new Coordinate(5), new Coordinate(5)),
                new Point(new Coordinate(7), new Coordinate(5))));
        assertThatThrownBy(() -> Shape.createFigure(points)).isInstanceOf(IllegalArgumentException.class);
    }
}
