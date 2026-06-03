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
	
	public String getNome() {return nome;}
	public int getPontos() {return pontos;}
	public int getJogos() {return jogos;}
	
	public void addJogo() {this.jogos++;}
	public void addVitoria() {this.vitorias++;}
	public void addDerrota() {this.derrotas++;}
	public void addEmpate() {this.empates++;}
	
	public void win() {
		vitorias++;
	}
	
	public void lose() {
		derrotas++;
	}
}
