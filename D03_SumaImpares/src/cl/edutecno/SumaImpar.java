package cl.edutecno;

import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el rango de numeros para sumar impares: ");
		int num1 = sc.nextInt();
		int suma = 0;
		
		for (int i = 0; i < num1; i++) {
			if (i%2 != 0) {
				suma+=i;
			}
		}
		System.out.println(suma);
		sc.close();
	}

}
