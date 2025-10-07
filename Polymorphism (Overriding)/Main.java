public class Main {
    public static void main(String[] args) {
        A aObyekt = new A(10, 6);
        aObyekt.shakl();
        System.out.println("A klass yuzasi " + aObyekt.yuzaTopish());
        System.out.println("A klass perimetri" + aObyekt.perimetrTopish());
        C cObyekt = new C(10, 6);
        cObyekt.shakl();
        System.out.println("C klass yuzasi" + cObyekt.yuzaTopish());
        System.out.println("C klass perimetri" + cObyekt.perimetrTopish());
    }

}
