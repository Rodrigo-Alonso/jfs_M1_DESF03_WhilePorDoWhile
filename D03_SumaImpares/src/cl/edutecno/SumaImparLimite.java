package cl.edutecno;

import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar el limite inferior: ");
		int limiteinf = sc.nextInt();
		System.out.println("Ingresar el limite superior: ");
		int limitesup = sc.nextInt();
		int suma = 0;
		
		for (int i = limiteinf; i < limitesup; i++) {
			if (i%2 != 0) {
				suma+=i;
			}
		}
		System.out.println(suma);
		sc.close();

	}

}
