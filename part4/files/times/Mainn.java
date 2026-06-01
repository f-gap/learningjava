package part4.files.times;

import java.nio.file.Paths;
import java.util.Scanner;

public class Mainn {

	public static void main(String[] args) {
		try(Scanner scannerFile = new Scanner(Paths.get("C:\\Users\\frank\\codigosjava\\MOOCjava\\part4\\files\\times\\data2.csv"))) {
			///MOOCjava/part4/files/times/data.csv
			//verifica se ha uma proxima linha e só tenta lê-la se houver
			while(scannerFile.hasNextLine()) {
				String line = scannerFile.nextLine();
				System.out.println("lendo linha:" + line);
				
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
