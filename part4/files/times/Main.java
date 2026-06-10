package part4.files.times;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Times> listaDeTimes = new ArrayList<Times>();
		Scanner scannerInput = new Scanner(System.in);
		
		String nomeDoArquivo = scannerInput.nextLine();
		try(Scanner scannerFile = new Scanner(Paths.get("C:\\Users\\frank\\codigosjava\\learningjava\\part4\\files\\times\\" + nomeDoArquivo))) {

			while(scannerFile.hasNextLine()) {
				String line = scannerFile.nextLine();
				System.out.println("lendo linha:" + line);
				String[] parts = line.split(",");

				boolean exists = false;
				int idx=0;
				for(Times time :listaDeTimes) {
					if(parts[0].equals(time.getNome()) || parts[1].equals(time.getNome())) {
						time.addJogo();
						exists = true;
					}
					idx++;
				}
				if(exists == false) {
					listaDeTimes.add(new Times(parts[0], Integer.parseInt(parts[2])));
				}

				exists = false;
				for(Times time :listaDeTimes) {
					if(parts[1] == time.getNome()) {
						time.addJogo();
						exists = true;
					}
				}
				if(exists == false) {
					listaDeTimes.add(new Times(parts[1], Integer.parseInt(parts[3])));
				}


//				Times resultado = listaDeTimes.stream()
//						.filter(p -> p.getNome().equals(parts[0]))
//						.findFirst()
//						.orElse(null);
//				if(resultado != null) {
//					resultado.addJogo();
//				}
//				else {
//					listaDeTimes.add(new Times(parts[0],Integer.parseInt(parts[2])));
//				}
//
//				Times resultado2 = listaDeTimes.stream()
//						.filter(p -> p.getNome().equals(parts[1]))
//						.findFirst()
//						.orElse(null);
//				if(resultado != null) {
//					resultado.addJogo();
//				}
//				else {
//					listaDeTimes.add(new Times(parts[1],Integer.parseInt(parts[3])));
//				}
				
				
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
