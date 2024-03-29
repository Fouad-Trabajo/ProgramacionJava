package balanceado;

import java.util.Random;
import java.util.Stack;

public class Balanceado {

	private final static String PATT_SIGNOS_APERTURA = "\\[|\\(|\\{";
	private final static String PATT_SIGNOS_CIERRE = "\\]|\\)|\\}";

	private final static String EXPRESION1 = "(1{ {2(5)}5}[3]2)";
	private final static String EXPRESION2 = "(1{{-1[3+6]2{(}))";
	private final static String EXPRESION3 = "(1{)}5}[3]2)";
	private final static String EXPRESION4 = "(1{ {2(5)}5}[3]2)";

	public static void generarExpresion() {
		Random rand = new Random();
		// Método para generar una expresión aletoria
		String[] expresiones = { EXPRESION1, EXPRESION2, EXPRESION3, EXPRESION4 };
		int indice = rand.nextInt(4);
		String expresion = expresiones[indice];
		System.out.println(expresion);
	}

	public boolean isBalanceada() {
		Stack<Character> pila = new Stack<>();
		char[] arrayCaracteres = EXPRESION1.toCharArray();

		for (int i = 0; i < arrayCaracteres.length; i++) {
			String charActual = String.valueOf(arrayCaracteres[i]);

			if (Character.toString(arrayCaracteres[i]).matches(PATT_SIGNOS_APERTURA)) {
				pila.push(arrayCaracteres[i]);
			} else if (Character.toString(arrayCaracteres[i]).matches(PATT_SIGNOS_CIERRE)) {
				if (pila.isEmpty()) { // La pila está vacía
					System.out.println("La pila está desbalanceada");
					return false;
				} else { // La pila está llena
					pila.pop(); // Saco un símbolo de apertura
					// Comparo el simbolo de apertura que he extraído con los simbolos de cierre
					switch (arrayCaracteres[i]) {
					case ']':

						break;
					case ')':

						break;
					case '}':

						break;
					}
				}
			} else {

			}
		}
		return false;
	}

	public static void main(String[] args) {

		generarExpresion();

	}

}
