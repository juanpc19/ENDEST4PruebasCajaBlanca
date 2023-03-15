package ejercicios;

public class SumaNumeros {

	//suma numeros pares
	public int sumaNumeros(int num) {
		int suma = 0;
		for (int i = 1; i < num; i++) {
			if(i%2==0) {
				suma += i;
			}
		}
		return suma;
	}
}
