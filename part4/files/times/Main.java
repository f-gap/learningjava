package part4.files.times;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Times> listaDeTimes = new ArrayList<Times>();
		Scanner scannerInput = new Scanner(System.in);
		
		String nomeDoArquivo = scannerInput.nextLine();
		try(Scanner scannerFile = new Scanner(Paths.get("C:\\Users\\gabri_htd8tpl\\OneDrive\\Desktop\\Estudos\\codigosjava\\learningjava\\part4\\files\\times\\" + nomeDoArquivo))) {
			//verifica se ha uma proxima linha e só tenta lê-la se houver
			while(scannerFile.hasNextLine()) {
				String line = scannerFile.nextLine();
				System.out.println("lendo linha:" + line);
				String[] parts = line.split(",");
				String name1 = parts[0];
				String name2 = parts[1];
				int pontos1 = Integer.parseInt(parts[2]);
				int pontos2 = Integer.parseInt(parts[3]);
				
				listaDeTimes.add(new Times(name1,pontos1));
				int index1 = listaDeTimes.size();
				listaDeTimes.add(new Times(name2,pontos2));
				int index2 = listaDeTimes.size();
				
			}
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		for(int i = 0; i < listaDeTimes.size();i++) {
			Times time = listaDeTimes.get(i);
			System.out.println(time);
		}
  	}
}
