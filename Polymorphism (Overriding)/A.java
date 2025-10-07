public class A {

    private int a;
    private int h;

    public A(int a, int h) {
        this.a = a;
        this.h = h;
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }


    public double yuzaTopish() {
        return (a + h) / 2.0;
    }


    public int perimetrTopish() {
        return 2 * (a + h);
    }


    public void shakl() {
        System.out.println("A klassidagi shakl");
    }
}
