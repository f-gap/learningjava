package part4.roomexample;

public class Room {
	private String code;
	private int seats;
	
	public Room(String classCode, int numberOfSeats) {
		this.code = classCode;
		this.seats = numberOfSeats;
	}
	
	public String getClassCode() {
		return this.code;
	}
	
	public int getNumberOfSeats() {
		return this.seats;
	}
}
