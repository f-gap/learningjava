package part3.trianglexample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle[] triangles = new Triangle[2];
		for(int i = 0;i<2;i++) {
			double a = Double.parseDouble(scanner.nextLine());
			double b = Double.parseDouble(scanner.nextLine());
			double c = Double.parseDouble(scanner.nextLine());
			triangles[i] = new Triangle(a,b,c);
			System.out.println("Área do " + i + "° triangulo: " + triangles[i].area());
		}
		if(triangles[0].area() > triangles[1].area()) { 
			System.out.println("Área do maior triangulo = " + triangles[0].area());
		}
		else if(triangles[0].area() < triangles[1].area()) { 
			System.out.println("Área do maior triangulo = " + triangles[1].area());
		}	
		else {
			System.out.println("as áreas dos triangulos sao iguais");
		}
	}

}
