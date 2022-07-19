package lesson3;

public class Rect {
    private int lenght;
    private int height;

    Rect() {
        this.height = 8;
        this.lenght = 6;
    }
    Rect(int l, int h) {
        this.height = h;
        this.lenght = l;
    }

    public int perimetr() {
        int P = 2 * (lenght + height);
        return P;
    }
    public int area() {
        int S = height * lenght;
        return S;
    }
}
