package part4.itens;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Item> itens = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Nome: ");
			String input = scanner.nextLine();
			if (input.isEmpty()) {
				break;
			}
			Item novoItem = new Item(input);
			itens.add(novoItem);
		}
		for(Item item: itens) {
			System.out.println(item);
		}
	}

}
