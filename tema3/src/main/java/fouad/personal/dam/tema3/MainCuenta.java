package fouad.personal.dam.tema3;

import java.util.*;

public class MainCuenta {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Instanciar-Crear objetos de la clase Cuenta
		Cuenta cuenta1 = new Cuenta("Federecio", 0);
		System.out.println("El titular de la cuenta 1 es: " + cuenta1.getTitular());

		System.out.print("¿Cuanto dinero tienes en la cuenta? ");
		double cantidad1 = sc.nextDouble();
		cuenta1.Ingresar(cantidad1);

		// Usando Scanner, para pedir al usuario, cuánto quiere ingresar/retirar de la cuenta
		System.out.print("¿Cúanto dinero quieres ingresar en la cuenta? ");
		double cantidadIngresar1 = sc.nextDouble();
		cuenta1.Ingresar(cantidadIngresar1);

		System.out.print("¿Cuanto dinero quieres retirar de la cuenta? ");
		double cantidadRetirar1 = sc.nextDouble();
		cuenta1.Retirar(cantidadRetirar1);

		System.out.println("----------------------------");

		// Instanciar-Crear cuenta 2
		Cuenta cuenta2 = new Cuenta("Rodrigo", 0, 0);
		System.out.println("El titular de la cuenta 2 es: " + cuenta2.getTitular() + " y su edad es: " + cuenta2.getEdad());

		// Dinero en la cuenta
		System.out.print("¿Cuanto dinero tienes en la cuenta? ");
		double cantidad2 = sc.nextDouble();
		cuenta2.Ingresar(cantidad2);

		// Ingresar
		System.out.print("¿Cuanto dinero quieres ingresar? ");
		double cantidadIngresar2 = sc.nextDouble();
		cuenta2.Retirar(cantidadIngresar2);

		System.out.print("¿Cuanto dinero quieres retirar? ");
		double cantidadRetirar2 = sc.nextDouble();
		cuenta2.Retirar(cantidadRetirar2);

		sc.close();
	}

}
