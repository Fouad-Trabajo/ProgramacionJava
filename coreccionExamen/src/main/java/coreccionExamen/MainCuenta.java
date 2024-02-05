package coreccionExamen;

import java.util.*;

public class MainCuenta {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Instanciar objetos de la clase Cuenta
		Cuenta cuenta1 = new Cuenta(2467.38, "Luis", "70912205P", "€");
		Cuenta cuenta2 = new Cuenta(2467.38, "Felipe", "06545678L", "€");
		Cuenta cuenta3 = new Cuenta(2467.38, "Carolina", "70765765K", "€");
		Cuenta cuenta4 = new Cuenta(2467.38, "Carmen", "06090609L", "€");

		// Instanciar 1 objeto de la clase CuentaAPlazoFijo
		CuentaAPlazoFijo c1 = new CuentaAPlazoFijo(196.15, "Rubén", "56465465D", "€", "12/12/2023");
		CuentaDeCredito cc1 = new CuentaDeCredito(196.15, "Rubén", "565989546F", "€");
		CuentaDeCredito cc2 = new CuentaDeCredito(2656.45, "Marcos", "56464655D", "€");

		// Impresión de objetos
		System.out.println("Datos de la cuenta 1: " + cuenta1.toString());
		System.out.println("Datos de la cuenta 2: " + cuenta2.toString());
		System.out.println("Datos de la cuenta 3: " + cuenta3.toString());
		System.out.println("Datos de la cuenta 4: " + cuenta4.toString());
		System.out.println("");

		System.out.println("Ingresar dinero en la cuenta de " + cuenta1.getNombre() + ": " + cuenta1.IngresarDinero(280));

		System.out.println("Retirar dinero en la cuenta de " + cuenta3.getNombre() + ": " + cuenta2.RetirarDinero(150.46));
		cuenta4.setSaldo(3428.67); //sin usar IngresarDinero
		System.out.println("El saldo actualizado de " + cuenta4.getNombre() + " es: " + cuenta4.getSaldo());
		System.out.println("");

		System.out.println("Cuenta a plazo fijo" + c1.toString());

		System.out.println("Retirar dinero de al CuentaDeCredito: " + cc1.RetirarDinero(90));
		System.out.println(cc1.toString());
		sc.close();
	}

}
