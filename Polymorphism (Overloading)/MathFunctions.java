class MathFunctions {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public int sub(int a, int b) {
        return a - b;
    }

    public double sub(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0 ga bolish mumkin emas");
        }
        return a / b;
    }

    public double div(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("0 ga bolish mumkin emas");
        }
        return a / b;
    }


    public int abs(int a) {
        return (a < 0) ? -a : a;
    }

    public double abs(double a) {
        return (a < 0) ? -a : a;
    }

    public int pow(int a) {
        return a * a;
    }

    public double pow(double a) {
        return a * a;
    }
}
