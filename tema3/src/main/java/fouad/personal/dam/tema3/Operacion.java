package fouad.personal.dam.tema3;

public class Operacion {
	public int num1;
	public int num2;
	
	public Operacion() {
		
	}
	
	public Operacion(int num1, int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public static int suma(int num1, int num2) {
			return num1+num2;
	}
	
	public static int resta(int num1, int num2) {
		return num1-num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
