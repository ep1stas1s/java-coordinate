package coordinate.domain;

import java.util.Objects;

public class Coordinate {
    private static final int MAX_COORDINATE_VALUE = 24;
    private static final int MIN_COORDINATE_VALUE = 1;
    private final int coordinate;

    public Coordinate(int coordinate) {
        checkCoordinate(coordinate);
        this.coordinate = coordinate;
    }

    private void checkCoordinate(int coordinate) {
        if (coordinate < MIN_COORDINATE_VALUE || coordinate > MAX_COORDINATE_VALUE) {
            throw new IllegalArgumentException("좌표가 범위를 벗어났습니다.");
        }
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
}
