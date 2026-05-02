package introduction;

import java.util.Scanner;

public class Comparation {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        if (name1.equals(name2))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not equals");
        }
    }
}
