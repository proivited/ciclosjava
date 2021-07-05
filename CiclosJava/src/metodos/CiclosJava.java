package metodos;

import java.util.Scanner;
public class CiclosJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/
		
		/**
		 * ciclo for
		 * for(variable de inicializacion; numero de veces que se repite;
		 */
		/*
		for(int i = 0; i<5; i++) {
			System.out.println(i+1);
		}*/
		
		
		/**
		 * Crar un metodo que nos de la tabla de multiplicar
		 */
		int numero = 0;
		Scanner leerNumero = new Scanner(System.in);
		
		System.out.println("Inmtroduce tu numero:");
		numero = leerNumero.nextInt();
		multiplicacion(numero);
		
	
		}
		
		public static void multiplicacion (int numero) {
			for(int i = 1; i <= 10; i++) {
				System.out.println(i + " * " + numero + " = " + (i*numero));
				
		}
		
	}

}
