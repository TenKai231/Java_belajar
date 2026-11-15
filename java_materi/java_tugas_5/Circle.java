package java_tugas_5;

public class Circle implements Compare {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public boolean isLess(Object other) {
        if (other instanceof Circle) {
            Circle circle = (Circle) other;
            return this.radius < circle.radius;
        }
        return false;
    }

    @Override
    public boolean isGreaterThan(Object other) {
        if (other instanceof Circle) {
            Circle circle = (Circle) other;
            return this.radius > circle.radius;
        }
        return false;
    }

    @Override
    public boolean isEqualTo(Object other) {
        if (other instanceof Circle) {
            Circle circle = (Circle) other;
            return Double.compare(this.radius, circle.radius) == 0;
        }
        return false;
    }
}