package ejerciciosChatNoTengoTiempo;

import java.util.*;

public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// Pedir datos por teclado
		System.out.print("Introduce nombre: ");
		String nombre = sc.nextLine();

		System.out.print("Introduce edad: ");
		int edad = sc.nextInt();

		sc.nextLine(); // Limpiar el buffer

		System.out.print("Introduce sexo (H/M): ");
		char sexo = sc.nextLine().charAt(0);

		System.out.print("Introduce peso en kg: ");
		double peso = sc.nextDouble();

		System.out.print("Introduce altura en metros: ");
		double altura = sc.nextDouble();

		// Crear objetos de la clase Persona
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
		Persona persona2 = new Persona(nombre, edad, sexo);
		Persona persona3 = new Persona(nombre);

		// Mostrar información y realizar comprobaciones
		Persona[] personas = { persona1, persona2, persona3 };

		for (Persona persona : personas) {
			int imc = persona.calcularIMC();
			boolean mayorEdad = persona.esMayorDeEdad();

			System.out.println("\nInformación de la persona:");
			System.out.println(persona.toString());

			switch (imc) {
			case -1:
				System.out.println("Por debajo de su peso ideal.");
				break;
			case 0:
				System.out.println("Peso ideal.");
				break;
			case 1:
				System.out.println("Tiene sobrepeso.");
				break;
			}

			System.out.println("¿Es mayor de edad? " + mayorEdad);
			sc.close();
		}

	}

}
