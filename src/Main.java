import Calculate.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Calculator calculator = new Calculator();
            System.out.print(">>> ");
            String command = scanner.nextLine() + ".";
            double ans = calculator.action(command);
            if((ans*10)%10 == 0) System.out.println((long)ans);
            else System.out.println(ans);
        }
    }
}