
public class Triangle extends GeometricFigure {

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public void calculate() {
        int s = (getA() + getB() + getC()) / 2;
        System.out.println("Triangle area formula component:" + s);
    }
}
