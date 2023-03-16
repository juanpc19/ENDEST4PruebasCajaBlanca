package ejercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numero;

		CuentaImpares cuenta = new CuentaImpares();
		
		SumaNumeros suma = new SumaNumeros();

		Scanner dogma = new Scanner(System.in);
		
		numero = dogma.nextInt();

		System.out.println(cuenta.cuentaImpares(numero));
		
		numero = dogma.nextInt();

		System.out.println(suma.sumaNumeros(numero));

		dogma.close();
	}

}
