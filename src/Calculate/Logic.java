package Calculate;

public class Logic {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double mul(double a, double b) {
        return a * b;
    }

    public double div(double a, double b) {
        return a / b;
    }

    public double mod(double a, double b) {
        return a % b;
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    public double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    public double sec(double a) {
        return pow(Math.cos(Math.toRadians(a)), -1);
    }

    public double cot(double a) {
        return pow(Math.tan(Math.toRadians(a)), -1);
    }

    public double cosec(double a) {
        return pow(Math.sin(Math.toRadians(a)), -1);
    }
}
