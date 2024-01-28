package fouad.personal.dam.tema3;

public class Rectangulo {

	// Atributos
	int largo;
	int ancho;

	// Constructores
	public Rectangulo() {
		this.largo = 0;
		this.ancho = 0;
	}

	// 2nd Constructor
	public Rectangulo(int largo, int ancho) {
		if (largo >= 0 && ancho >= 0) {
			this.largo = largo;
			this.ancho = ancho;
		} else {
			this.largo = 0;
			this.ancho = 0;
		}
	}

	// Getter y setter
	public int getLargo() {
		if (largo >= 0) {
			return largo;
		} else {
			return largo = 0;
		}
	}

	public void setLargo(int largo) {
		if (largo >= 0) {
			this.largo = largo;
		} else {
			this.largo = 0;
		}
	}

	public int getAncho() {
		if (ancho >= 0) {
			return ancho;
		} else {
			return ancho = 0;
		}
	}

	public void setAncho(int ancho) {
		if (ancho >= 0) {
			this.ancho = ancho;
		} else {
			this.ancho = 0;
		}
	}

	// Métodos especiales
	public int Area() {
		return largo * ancho;
	}

	public int Perimetro() {
		return (largo * 2) + (ancho * 2);
	}

	public String Posicion() {
		if (largo != 0 && ancho != 0) {
			if (largo > ancho) {
				return "Horizontal"; // El rectángulo es horizonatal
			} else if (largo < ancho) {
				return "Vertical"; // El rectángulo es vertical
			} else if (largo == ancho) {
				if (largo == 0 && ancho == 0) {
					return "El rectángulo no existe, no tiene representación";
				} else {
					return "Cuadrado";
				}
			} else {
				return "El cuadrado no exsiste, no tiene valores reales";
			}
		} else if (largo == 0 || ancho == 0) {
			return "No tiene posición";
		} else {
			return "No es posible";
		}
	}

	public String Dimensiones() {
		if (largo == 0 && ancho == 0) {
			return "El rectangulo no tine dimensiones";
		} else {
			return largo + " de largo por  " + ancho + " de ancho";
		}
	}

	public void Dibujo() {
		if (largo != 0 && ancho != 0) {
			for (int i = 0; i < ancho; i++) { // for dentro de otro for, se hacerlo :)
				for (int j = 0; j < largo; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		} else if (largo == 0 || ancho == 0) {
			System.out.println("No tienen representación");
		} else {
			System.out.println();

		}

	}

}
