package part4.files.times;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Times> listaDeTimes = new ArrayList<Times>();
		Scanner scannerInput = new Scanner(System.in);
		System.out.printf("File: ");
		String nomeDoArquivo = scannerInput.nextLine();
		try(Scanner scannerFile = new Scanner(Paths.get("part4\\files\\times\\" + nomeDoArquivo))) {

			while(scannerFile.hasNextLine()) {
				String line = scannerFile.nextLine();
//				System.out.println("lendo linha:" + line);
				String[] parts = line.split(",");
				String nomeTimeDaCasa = parts[0];
				String nomeTimeAdversario = parts[1];
				int pontosDaCasa = Integer.parseInt(parts[2]);
				int pontosAdversario = Integer.parseInt(parts[3]);

				boolean exists = false;
				for(Times time :listaDeTimes) {
					if(nomeTimeDaCasa.equals(time.getNome())) {
//						time.addJogo();
//						if(Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
//							time.addVitoria();
//						}
//						else if (Integer.parseInt(parts[2]) < Integer.parseInt(parts[3])){
//							time.addDerrota();
//						}
//						else {
//							time.addEmpate();
//						}
						time.registrarResultados(pontosDaCasa, pontosAdversario);
						exists = true;
					}
				}
			if(exists == false) {
					listaDeTimes.add(new Times(nomeTimeDaCasa));
//					if(Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])) {
//						listaDeTimes.get(listaDeTimes.size() - 1).addVitoria();
//					}
//					else if (Integer.parseInt(parts[2]) < Integer.parseInt(parts[3])){
//						listaDeTimes.get(listaDeTimes.size() - 1).addDerrota();
//					}
//					else {
//						listaDeTimes.get(listaDeTimes.size() - 1).addEmpate();
//					}
				if(listaDeTimes.size() > 0) {
					listaDeTimes.get(listaDeTimes.size() - 1).registrarResultados(pontosDaCasa,pontosAdversario);
				}
				else {
					listaDeTimes.get(listaDeTimes.size()).registrarResultados(pontosDaCasa,pontosAdversario);
				}
				}

				exists = false;
				for(Times time :listaDeTimes) {
					if(parts[1].equals(time.getNome())) {
//						time.addJogo();
//						if(Integer.parseInt(parts[2]) < Integer.parseInt(parts[3])) {
//							time.addVitoria();
//						}
//						else if (Integer.parseInt(parts[2]) > Integer.parseInt(parts[3])){
//							time.addDerrota();
//						}
//						else {
//							time.addEmpate();
//						}
//						exists = true;
						time.registrarResultados(pontosAdversario,pontosDaCasa);
						exists = true;
					}
				}
				if(exists == false) {
					listaDeTimes.add(new Times(nomeTimeAdversario));
					if(listaDeTimes.size() > 0) {
						listaDeTimes.get(listaDeTimes.size() - 1).registrarResultados(pontosAdversario, pontosDaCasa);
					}
					else {
						listaDeTimes.get(listaDeTimes.size()).registrarResultados(pontosAdversario, pontosDaCasa);
					}
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
		System.out.printf("Time: ");
		String input = scannerInput.nextLine();
//		for(int i = 0; i < listaDeTimes.size();i++) {
//			Times time = listaDeTimes.get(i);
//			System.out.println(time);
//		}
		for(Times time : listaDeTimes) {
			if(time.getNome().equals(input)) {
				System.out.printf(time.toString());
			}
		}
  	}
}