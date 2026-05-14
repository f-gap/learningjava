package part3.trianglexample;

public class Triangle {
	public double a;
	public double b;
	public double c;
	public double p;
	
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.p = (a+b+c)/2;
	}
	
	public Triangle() {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public double area() {
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
}
