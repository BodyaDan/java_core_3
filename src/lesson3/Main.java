package lesson3;

public class Main {
    public static void main(String[] args) {
        Rect r1 = new Rect(2,5);
        Rect r2 = new Rect();
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.4);

        System.out.println("Площа 1-го прямокутника = " + r1.area() + ", а периметр = " + r1.perimetr());
        System.out.println("Площа 2-го прямокутника = " + r2.area() + ", а периметр = " + r2.perimetr());

        System.out.println("\n" + "Площа 1-го кола = " + c1.area() + ", а довжина = " + c1.lenght());
        System.out.println("Площа 2-го кола = " + c2.area() + ", а довжина = " + c2.lenght());
    }
}
