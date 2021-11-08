package cl.edutecno;

import java.util.Scanner;

public class SoloPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresar una cantidad de pares a mostrar: ");
		int num1 = sc.nextInt();
		int i = 0;
		
		while(i < num1*2) {//4*2 = 0-2-4-6
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		sc.close();

	}

}
