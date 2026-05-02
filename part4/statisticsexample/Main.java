package part4.statisticsexample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Statistics statistics = new Statistics();
        while(true) {
        	System.out.println("Insert [any value] for statistics or insert [-1] for stop program:");
        	double value = Double.parseDouble(scanner.nextLine());
        	if(value == -1) {
        		break;
        	}
        	statistics.addNumber(value);
        }
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of pair numbers: " + statistics.sumPair());
        System.out.println("Sum of odd numbers: " + statistics.sumOdd());
        System.out.println("Average: " + statistics.average());
	}

}
