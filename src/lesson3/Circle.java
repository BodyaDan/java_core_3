package lesson3;

public class Circle {
    private double r;
    private double d;

    Circle() {
        r = 12;
        d = 2 * r;
    }
    Circle(double R) {
        this.r = R;
        d = 2 * r;
    }

    public double lenght() {
        double L = 2 * Math.PI * r;
        return L;
    }
    public double area() {
        double A = Math.PI * Math.pow(d/2, 2);
        return A;
    }
}
