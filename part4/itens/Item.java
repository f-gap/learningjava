package part4.itens;

import java.time.LocalDate;
import java.time.LocalTime;

public class Item {
	private String nome;
	private LocalDate dataDeCriacao;
	private LocalTime horaDeCriacao;
	
	public Item(String input) {
		this.nome = input;
		this.dataDeCriacao = LocalDate.now();
		this.horaDeCriacao = LocalTime.now();
	}
	
	@Override
	public String toString() {
		return this.nome + " (criado em " + this.dataDeCriacao +" às " + this.horaDeCriacao + ")";
	}
}
