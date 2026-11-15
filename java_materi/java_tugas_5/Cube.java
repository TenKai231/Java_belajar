package java_tugas_5;

public class Cube implements Compare {

    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double volume() {
        return side * side * side;
    }

    @Override
    public boolean isLess(Object other) {
        if (other instanceof Cube) {
            Cube cube = (Cube) other;
            return this.side < cube.side;
        }
        return false;
    }

    @Override
    public boolean isGreaterThan(Object other) {
        if (other instanceof Cube) {
            Cube cube = (Cube) other;
            return this.side > cube.side;
        }
        return false;
    }

    @Override
    public boolean isEqualTo(Object other) {
        if (other instanceof Cube) {
            Cube cube = (Cube) other;
            return Double.compare(this.side, cube.side) == 0;
        }
        return false;
    }
}