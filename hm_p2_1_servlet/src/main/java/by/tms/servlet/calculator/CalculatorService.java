package by.tms.servlet;

public class CalculatorService {

    public double calculate(double a, double b, String operation) {
        switch (operation) {
            case "sum":
                return sum(a, b);
            case "minus":
                return minus(a, b);
            case "div":
                if (b == 0) {
                    System.out.println("Деление на 0");
                    return 0;
                }
                return div(a, b);
            case "mul":
                return mul(a, b);
            default:
                return 0;
        }
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double minus(double a, double b) {
        return a - b;
    }

    private double div(double a, double b) {
        return a / b;
    }

    private double mul(double a, double b) {
        return a * b;
    }

}


