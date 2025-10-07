public class C extends A {


    public C(int a, int h) {
        super(a, h);
    }


    @Override
    public double yuzaTopish() {
        return getA() * getH();
    }

    @Override
    public int perimetrTopish() {

        return 4 * getA();
    }

    @Override
    public void shakl() {
        System.out.println("C klassidagi shakl — boshqa usulda hisoblandi");
    }

}
