package part4.files;

import java.util.Scanner;
import java.nio.file.Paths;


public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		try (Scanner scanner = new Scanner(Paths.get("C:\\Users\\frank\\codigosjava\\MOOCjava\\part4\\files\\" + input))) {
		    // we read the file until all lines have been read
		    while (scanner.hasNextLine()) {
		        // we read one line
		        String row = scanner.nextLine();
		        // we print the line that we read
		        System.out.println(row);
		    }
		} catch (Exception e) {
		    System.out.println("Error: " + e.getMessage());
		}
	}

}
