package part2;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height: ");
        int height = Integer.valueOf(scanner.nextLine());
        for (int i = 0;i < height; i++) {
            for (int j = 0;j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
