package coordinate.domain;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private static final int SQUARE = 2;

    private final Coordinate x;
    private final Coordinate y;

    public Point(Coordinate x, Coordinate y) {
        this.x = x;
        this.y = y;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(Math.pow(this.x.getCoordinate() - point.x.getCoordinate(), SQUARE) +
                Math.pow(this.y.getCoordinate() - point.y.getCoordinate(), SQUARE));
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
