package introduction;

import java.util.Scanner;

public class Conversation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, What's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + ", how you are?");
        String answer = scanner.nextLine();
        String answer_normal = answer.toLowerCase();
        if(answer_normal.contains("good") || answer_normal.contains("well")) {
            System.out.println("Oh, so good! Thank you for sharing!!!");
        }
        else if(answer_normal.contains("bad") || answer_normal.contains("not well") || answer_normal.contains("ill")){
            System.out.println("Don't worry! Everything will be alright soon!");
        }
        else {
            System.out.println("Ok! Thank you for sharing!!!");
        }
        System.out.println("Tell me more!");
        String answer2 = scanner.nextLine();
        System.out.println("Oh, very well! Thank you for sharing!");
    }
}
