package ejerciciosForFaciles;

public class Ej03 {
	public static void main(String[] args) {

		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			suma = suma + i; // --> suma+=i; Se llama suma convinada
		}
		System.out.println("La suma de los 100 primeros números es: " + suma);

	}

}
