package part4.statisticsexample;

public class Statistics {
	int count;
	double sum;
	double sumPair;
	double sumOdd;
	
	public void addNumber(double value) {
		count++;
		sum += value;
		if(value % 2.0 == 0) {
			sumPair += value;
		}
		else {
			sumOdd += value;
		}
	}
	
	public int getCount() {
		return count;
	}
	
	public double sum() {
		return sum;
	}
	
	public double sumPair() {
		return sumPair;
	}
	
	public double sumOdd() {
		return sumOdd;
	}
	
	public double average() {
		return sum/count;
	}
}
