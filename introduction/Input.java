package introduction;

import java.util.Scanner;

public class Input {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a boolean:");
        boolean inputbool = Boolean.valueOf(scanner.nextLine());
        System.out.println("You wrote " + inputbool);
    }
}