package fouad.personal.dam.tema3;

public class Redondear {
	 
	float num;
	
	public void redondear(float num) {
		this.num=num;	
	}

	
	// Métodos
		//getter y setter
	public float getNum() {
		return num;
	}

	public void setNum(float num) {
		this.num = num;
	}
	
		// metodo especial
	public void redondeo(float num) {
		System.out.println("El redonde del número [" + num + "] es: " + Math.round(num));
	}
	

}
