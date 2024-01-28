package fouad.personal.dam.tema3;

public class Imc {
	
	// Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private char sexo;
	private final double peso, altura;
	
	
	// Constructores
	public Imc(String nombre) {
		this.nombre = nombre;
	}
	
	// 2nd Constructor
	public Imc(String nombre, int edad, char sexo) {
		this.nombre=nombre;
		this.edad=edad;
		this.sexo=sexo;
	}

	// 3er Constructor
	public Imc(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	public int calcularIMC() {
		if (peso/(altura*altura)<20) {
			return -1;
		}else if(peso/(altura*altura)>=20 && peso/(altura*altura)<=25) {
			return 0;
		}else {
			return 1;
		}
		
	}
	
	public boolean esMayorDeEdad() {
		if(edad>=18) {
			return true;
		}else {
			return false;
		}
	}
	
	public char ComprobarSexo(char sexo) {
		if (sexo=='M') {
			return this.sexo='M';
		}else {
			return this.sexo='H';
		}
	}
	
	
	@Override
	public String toString() {
		return "Imc [nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	
}
	
