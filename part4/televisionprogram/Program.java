package part4.televisionprogram;

public class Program {
	private String nameOfProgram;
	private int durationOfProgram;
	
	public Program(String name, int durationValue) {
		this.nameOfProgram = name;
		this.durationOfProgram = durationValue;
	}
	
	public int getDuration() {
		return this.durationOfProgram;
	}
	
	@Override
	public String toString() {
		return this.nameOfProgram + ", " + this.durationOfProgram + " minutes";
	}
}
