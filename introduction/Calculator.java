package introduction;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("        Java Calculator         ");
        System.out.println("   What operation do you want?  ");
        System.out.println("(1) Sum\n(2) Subtraction\n(3) Multiplication\n(4) Division\nChoice: ");
        int choice = Integer.valueOf(scanner.nextLine());
        //Poderia ser:
        // int choice = Integer.parseInt(scanner.nextLine());
        //para ser mais performático, mas como estou aprendendo sobre objetos vou seguir com "Integer.valueOf".
        double a,b;
        switch (choice) {
            case 1:
                System.out.println("Input [a] = ");
                a = Double.valueOf(scanner.nextLine());
                System.out.println("Input [b] = ");
                b = Double.valueOf(scanner.nextLine());
                System.out.println(a + "+" + b + "=" + (a+b));
                break;
            case 2:
                System.out.println("Input [a] = ");
                a = Double.valueOf(scanner.nextLine());
                System.out.println("Input [b] = ");
                b = Double.valueOf(scanner.nextLine());
                System.out.println(a + "-" + b + "=" + (a-b));
                break;
            case 3:
                System.out.println("Input [a] = ");
                a = Double.valueOf(scanner.nextLine());
                System.out.println("Input [b] = ");
                b = Double.valueOf(scanner.nextLine());
                System.out.println(a + "*" + b + "=" + (a*b));
                break;
            case 4:
                System.out.println("Input [a] = ");
                a = Double.valueOf(scanner.nextLine());
                System.out.println("Input [b] = ");
                b = Double.valueOf(scanner.nextLine());
                System.out.println(a + "/" + b + " = " + (a/b));
                break;
            default:
                System.out.println("Não há essa operação!");
                break;
        }
    }
}
