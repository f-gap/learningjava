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
				String[] parts = line.split(",");
				String name1 = parts[0];
				String name2 = parts[1];
				int pontos1 = Integer.parseInt(parts[2]);
				int pontos2 = Integer.parseInt(parts[3]);
				
				Times resultado = listaDeTimes.stream()
						.filter(p -> p.getNome().equals(name1))
						.findFirst()
						.orElse(null);
				if(resultado != null) {
					resultado.addJogo();
				}
				else {
					listaDeTimes.add(new Times(name1,pontos1));					
				}
				
				Times resultado2 = listaDeTimes.stream()
						.filter(p -> p.getNome().equals(name2))
						.findFirst()
						.orElse(null);
				if(resultado != null) {
					resultado.addJogo();
				}
				else {
					listaDeTimes.add(new Times(name2,pontos2));
				}
				
				
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
