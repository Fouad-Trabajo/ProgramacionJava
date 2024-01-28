package clasesAbstractas;

public class MainClaseAbstracta {
	public static void main(String[] args) {

		// Instanciar objetos
		Cuadrado cuadradoRojo = new Cuadrado(3, 1, 1);
		Cuadrado cuadradoVerde = new Cuadrado(1.5, 5, -3);
		Circulo circuloNegro = new Circulo(3.14, 3.3, 44, 66);
		Circulo circuloAzul = new Circulo(3.14, 5, 22, 9);
		Circulo circuloGetPi=new Circulo(3.14, 3.14,0,0);

		// Impresión de instancias/objetos
		System.out.println("El área del cuadrado rojo es: " + cuadradoRojo.calcularArea());
		System.out.println("El área del cuadrado verde es: " + cuadradoVerde.calcularArea());

		System.out.println("---------------------------------------------------");
		System.out.println("El área del círculo negro es: " + circuloNegro.calcularArea());
		System.out.println("El área del circulo Azul es: " + circuloAzul.toString());
		//También se puede hacer llamando al toString o con otro método que devuelva la operacion
		System.out.println("Área-Estoy llamando al getPi: " + circuloGetPi.getPi());
	}
}
