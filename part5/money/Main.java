package part5.money;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int euros = Integer.parseInt(sc.nextLine());
        int cents = Integer.parseInt(sc.nextLine());
        Money a = new Money(euros,cents);
        System.out.println(a);
    }
}
