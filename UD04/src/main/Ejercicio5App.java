package main;

public class Ejercicio5App {

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;

		System.out.println("Valor inicial de A = " + a + "\nValor inicial de B = " + b + 
				 "\nValor inicial de C = " + c + "\nValor inicial de D = " + d );
		
		b = c;
		System.out.println("Valor de B = "+b);
		
		c = a;
		System.out.println("Valor de C = "+c);
		
		a = d;
		System.out.println("Valor de A = "+a);
		
		d = b;
		System.out.println("Valor de D = "+d);
	}

}
