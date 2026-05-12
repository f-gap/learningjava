package part4.televisionprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Program> programs = new ArrayList<>();
		while(true) {
			System.out.println("Insert [name,duration] or empty for finish read.");
			String input = scanner.nextLine();
			if(input.isEmpty()) {
				break;
			}
			String[] parts = input.split(",");
			String name = parts[0];
			int duration = Integer.parseInt(parts[1]);
			programs.add(new Program(name,duration));
		}
		System.out.print("What a limit of duration? ");
		int limit = Integer.parseInt(scanner.nextLine());
		for(Program program: programs) {
			if(program.getDuration() <= limit) {
				System.out.println(program);				
			}
		}
	}

}
