package cl.edutecno;

import java.util.Scanner;

public class SecuenciaFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese la cantidad de numeros a mostrar");
		int num1 = sc.nextInt();
		int fibonacci1 = 1;
		int fibonacci2 = 1;
 		
		for (int i = 0; i < num1; i++) {
			
			if (i == 0) {
				System.out.println(i);
			}else if (i == 1) {
				System.out.println(i);
				System.out.println(i);
			}else if (i > 1) {
				fibonacci2 = fibonacci1 + fibonacci2;//1+1=2 -> 1+2=3 -> 2+3=5 -> 3+5=8
				fibonacci1 = fibonacci2 - fibonacci1;//2-1=1 -> 3-1=2 -> 5-2=3 -> 8-3=5
				System.out.println(fibonacci2);
			}
		}
		sc.close();
	}
	/*
		//Otra forma de hacer fibonacci
		System.out.println("Ingrese la cantidad de numeros a mostrar");
		int n = sc.nextInt();
		int i = 0;
		int num_1 = 0;
		
		System.out.printf("%d \n", num_1);
		
		int num2 = 1;
		int num = 0;
		
		while (i<n){
			num= num_1 + num2;
			System.out.printf("%d \n", num);
			num2 =  num_1;
			num_1 = num_1;
			
			i = i+1;
		
		}
	}
	*/
}
