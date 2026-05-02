package introduction;

import java.util.Scanner;

public class Seconds {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos dias você gostaria de converter em segundos?");
        int day = Integer.valueOf(scanner.nextLine());
        System.out.println(day * 86400);
    }
}
