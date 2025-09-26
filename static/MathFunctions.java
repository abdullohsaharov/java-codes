public class MathFunctions {
    static double pi;
    static double e;


    public MathFunctions(double piValue, double eValue) {
        pi = piValue;
        e = eValue;
    }


    public double circleArea(double radius) {
        return pi * radius * radius;
    }


    public double exp(int a) {
        return Math.pow(e, a);
    }


    public double triangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public static void main(String[] args) {
        MathFunctions mathFunc = new MathFunctions(3.14159265359, 2.71828182846);

        System.out.println("Doira yuzasi: " + mathFunc.circleArea(12));
        System.out.println("e ning 2-darajasi: " + mathFunc.exp(2));
        System.out.println("Uchburchak yuzasi: " + mathFunc.triangleArea(3, 4, 5));

    }
}
