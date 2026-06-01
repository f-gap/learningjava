package part4.files.times;

public class Times {
	private String nome;
	private int pontos;
	private int jogos;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	Times (String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}
	
	@Override
	public String toString () {
		return "Time: " + nome + ", partidas jogadas: " + jogos; 
	}
	
	public void win() {
		vitorias++;
	}
	
	public void lose() {
		derrotas++;
	}
}
