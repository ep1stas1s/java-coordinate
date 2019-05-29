package coordinate.domain;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private final Coordinate x;
    private final Coordinate y;

    public Point(int x, int y) {
        this.x = Coordinate.getCoordinate(x);
        this.y = Coordinate.getCoordinate(y);
    }

    public int getX() {
        return x.getCoordinate();
    }

    public int getY() {
        return y.getCoordinate();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public int compareTo(Point p) {
        if ((x.getCoordinate() < p.x.getCoordinate()) ||
                (x.getCoordinate() == p.x.getCoordinate() && y.getCoordinate() < p.y.getCoordinate())) {
            return -1;
        }
        return 1;
    }
}
