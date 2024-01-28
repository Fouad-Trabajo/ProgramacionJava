package fouad.personal.dam.tema3;

public class MainRectangulo {

	public static void main(String[] args) {

		// Instanciar objetos de la clase Rectangulo
		Rectangulo rectanguloAzul = new Rectangulo(3, 4); // Los valores de largo y ancho están en centimentros

		// Impresión de los objetos
		System.out.println("RECTÁNGULO AZUL"); // Objeto 1
		System.out.println("El área del rectángulo azul es: " + rectanguloAzul.Area());
		System.out.println("El perímetro del rectángulo azul es: " + rectanguloAzul.Perimetro());
		System.out.println("La posión del rectángulo azul es: " + rectanguloAzul.Posicion());
		System.out.println("Las dimensiones del rectángulo azul son: " + rectanguloAzul.Dimensiones());
		System.out.println("Representación: ");
		rectanguloAzul.Dibujo();
		System.out.println("---------------------------------------------------");
		System.out.println("RECTÁNGULO ROJO"); // Hacer lo mismo con los diferentes objetos instanciados

	}

}
