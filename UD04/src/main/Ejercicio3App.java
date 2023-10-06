package main;

public class Ejercicio3App {

	public static void main(String[] args) {
		int x = 2;
		int y = 22;
		double n, m;
		n = 8.4;
		m = 4.8;

		System.out.println("Variable x = "+ x + "\nVariable y = " + y + 
						 "\nVariable n = " + n + "\nVariable m = " + m );
		System.out.println(x + " + " +y+ " = "+ (x+y));
		System.out.println(x + " - " +y+ " = "+ (x-y));
		System.out.println(x + " * " +y+ " = "+ (x*y));
		System.out.println(x + " / " +y+ " = "+ (x/y));
		System.out.println(x + " % " +y+ " = "+ (x%y));
		
		System.out.println(m + " + " +n+ " = "+ (m+n));
		System.out.println(m + " - " +n+ " = "+ (m-n));
		System.out.println(m + " * " +n+ " = "+ (m*n));
		System.out.println(m + " / " +n+ " = "+ (m/n));
		System.out.println(m + " % " +n+ " = "+ (m%n));
		
		System.out.println(x + " + " +n+ " = "+ (x+n));
		System.out.println(y + " / " +m+ " = "+ (y/m));
		System.out.println(y + " % " +m+ " = "+ (y%m));
		

		System.out.println("Doble de x = "+ 2*x + "\nDoble de y = " + 2*y + 
						 "\nDoble de n = " + 2*n + "\nDoble de m = " + 2*m );
		
		double suma = x+y+n+m;
		
		System.out.println("Suma total = "+ (suma));
		
		double producto = x*y*n*m;
		
		System.out.println("Producto total = "+ (producto));
		
	}

}
