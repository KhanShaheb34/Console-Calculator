package Calculate;

public class Calculator {
    private double a;
    private double b;
    private char s;
    private int position;

    private Logic calculatorLogic = new Logic();

    public Calculator() {
        a = 0;
        b = 0;
        position = 0;
    }

    private double calculate(double a, double b, char s) {
        switch (s) {
            case '+':
                return calculatorLogic.add(a, b);
            case '-':
                return calculatorLogic.sub(a, b);
            case '*':
                return calculatorLogic.mul(a, b);
            case '/':
                return calculatorLogic.div(a, b);
            case '%':
                return calculatorLogic.mod(a, b);
            case '^':
                return calculatorLogic.pow(a, b);
            case 't':
                return calculatorLogic.tan(a);
            case 's':
                return calculatorLogic.sin(a);
            case 'e':
                return calculatorLogic.sec(a);
            case 'c':
                return calculatorLogic.cosec(a);
            case 'o':
                return calculatorLogic.cos(a);
            case 'a':
                return calculatorLogic.cot(a);
            case 'r':
                return calculatorLogic.sqrt(a);
            default:
                System.out.println("Please input a valid sign!");
                return 0;

        }
    }

    private void stringToCommand(String command){
        if(isInt(command.charAt(0))){
            a = parseInt(command);
            while(command.charAt(position)==' ') position++;
            s = command.charAt(position);
            while(!isInt(command.charAt(position))) position++;
            b = parseInt(command);
        }
        else {
            switch (command.charAt(0)){
                case 't':
                    while(!isInt(command.charAt(position))) position++;
                    a = parseInt(command);
                    s = 't';
                    break;
                case 's':
                    while(!isInt(command.charAt(position))) position++;
                    a = parseInt(command);
                    if (command.charAt(1) == 'i') s = 's';
                    else s = 'e';
                    break;
                case 'c':
                    while(!isInt(command.charAt(position))) position++;
                    a = parseInt(command);
                    if (command.charAt(3) == 'e') s = 'c';
                    else if(command.charAt(2) == 't') s = 'a';
                    else s = 'o';
                    break;
                case 'r':
                    while(!isInt(command.charAt(position))) position++;
                    a = parseInt(command);
                    s = 'r';
                    break;
            }
            b = 0;
        }
    }

    private double parseInt(String command) {
        double temp = 0;
        do {
            temp *= 10;
            temp += command.charAt(position) - '0';
            position++;
        } while (isInt(command.charAt(position)));
        return temp;
    }

    public double action(String command) {
        stringToCommand(command);
        return calculate(a, b, s);
    }

    private boolean isInt(char ch) {
        return ch >= 48 && ch < 58;
    }

}
