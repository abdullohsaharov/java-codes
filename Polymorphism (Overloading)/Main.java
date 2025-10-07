public class Main {
    public static void main(String[] args) {
        MathFunctions mf = new MathFunctions();

        System.out.println("Qoshish (int): " + mf.add(5, 3));
        System.out.println("Qoshish (double): " + mf.add(2.5, 4.5));

        System.out.println("Ayirish (int): " + mf.sub(10, 4));
        System.out.println("Ayirish (double): " + mf.sub(10.5, 4.2));

        System.out.println("Kopaytirish (int): " + mf.multiply(3, 7));
        System.out.println("Kopaytirish (double): " + mf.multiply(3.2, 2.5));

        System.out.println("Bolish (int): " + mf.div(10, 2));
        System.out.println("Bolish (double): " + mf.div(9.0, 2.0));

        System.out.println("Absolyut (int): " + mf.abs(-15));
        System.out.println("Absolyut (double): " + mf.abs(-12.34));

        System.out.println("Kvadrat (int): " + mf.pow(6));
        System.out.println("Kvadrat (double): " + mf.pow(3.5));
    }
}
