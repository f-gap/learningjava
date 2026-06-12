package part4.files.times;

public class Times {
	private String nome;
	private int jogos;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	Times (String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString () {
		return "Time: " + nome + ", partidas jogadas: " + jogos + " vitorias: " + vitorias + " derrotas: " + derrotas;
	}

	public String getNome() {return nome;}
	public int getJogos() {return jogos;}

	public void addJogo() {this.jogos++;}
	public void addVitoria() {this.vitorias++;}
	public void addDerrota() {this.derrotas++;}
	public void addEmpate() {this.empates++;}

	public void registrarResultados(int pontosTimeDaCasa,int pontosAdversario) {
		addJogo();
		if(pontosTimeDaCasa > pontosAdversario) {
			this.addVitoria();
		}
		else if(pontosTimeDaCasa < pontosAdversario) {
			this.addDerrota();
		}
		else {
			this.addEmpate();
		}
	}
}
