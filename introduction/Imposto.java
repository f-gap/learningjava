package introduction;

import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Valor do presente: ");
        double valor = Double.valueOf(scanner.nextLine());
        double imposto;
        if (valor < 5000) {
            imposto = 0;
        }
        else if(valor == 5000) {
            imposto = 100;
        }
        else if (valor < 25000) {
            imposto = 100 + (valor * 8/100);
        }
        else if (valor == 25000) {
            imposto = 1700;
        }
        else if (valor < 55000) {
            imposto = 1700 + (valor * 10/100);
        }
        else if (valor == 55000) {
            imposto = 4700;
        }
        else if (valor < 200000) {
            imposto = 47000 + (valor * 12/100);
        }
        else if (valor == 200000) {
            imposto = 22100;
        }
        else if (valor < 1000000) {
            imposto = 22100 + (valor * 15/100);
        }
        else if (valor == 1000000) {
            imposto = 142100;
        }
        else {
            imposto = 142100 + (valor * 17/100);
        }
    }
}
