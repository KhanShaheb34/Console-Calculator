package Calculate;

class Logic {
    double add(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }

    double div(double a, double b) {
        return a / b;
    }

    double mod(double a, double b) {
        return a % b;
    }

    double pow(double a, double b) {
        return Math.pow(a, b);
    }

    double sqrt(double a) {
        return Math.sqrt(a);
    }

    double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    double sec(double a) {
        return pow(Math.cos(Math.toRadians(a)), -1);
    }

    double cot(double a) {
        return pow(Math.tan(Math.toRadians(a)), -1);
    }

    double cosec(double a) {
        return pow(Math.sin(Math.toRadians(a)), -1);
    }
}
