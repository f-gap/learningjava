package part2;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("    Factorial Program    ");
        System.out.print("n: ");
        int n = Integer.valueOf(scanner.nextLine());
        int nfac=1;
        for (int i = 1; i<= n; i++) {
            nfac = nfac*i;
        }
        System.out.println("n! = " + nfac);
    }
}
