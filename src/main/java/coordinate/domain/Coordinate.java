package coordinate.domain;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Coordinate {
    private static final int MAX_COORDINATE_VALUE = 24;
    private static final int MIN_COORDINATE_VALUE = 1;
    private final int coordinate;

    private static final Map<Integer, Coordinate> coordinates;

    static {
        coordinates = IntStream.rangeClosed(MIN_COORDINATE_VALUE, MAX_COORDINATE_VALUE)
                .boxed()
                .collect(Collectors.toMap(Function.identity(), Coordinate::new));
    }

    private Coordinate(int coordinate) {
        checkCoordinate(coordinate);
        this.coordinate = coordinate;
    }

    private void checkCoordinate(int coordinate) {
        if (coordinate < MIN_COORDINATE_VALUE || coordinate > MAX_COORDINATE_VALUE) {
            throw new IllegalArgumentException("좌표가 범위를 벗어났습니다.");
        }
    }

    public static Coordinate getCoordinate(int coordinate) {
        if (!coordinates.containsKey(coordinate)) {
            throw new IllegalArgumentException("존재하지 않는 좌표입니다.");
        }
        return coordinates.get(coordinate);
    }

    public int getCoordinate() {
        return coordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return coordinate == that.coordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "coordinate=" + coordinate +
                '}';
    }
}
