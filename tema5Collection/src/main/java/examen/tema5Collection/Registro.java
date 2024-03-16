package examen.tema5Collection;

public class Registro {

	private String descripcionPeticion;
	private double presupuestoObraUrgente;

	// Constructor
	public Registro(String descripcionPeticion, double presupuestoObraUrgente) {
		this.descripcionPeticion = descripcionPeticion;
		this.presupuestoObraUrgente = presupuestoObraUrgente;
	}

	// Getter y setter
	public void setDescripcionPeticion(String descripcionPeticion) {
		this.descripcionPeticion = descripcionPeticion;
	}

	public double getPresupuestoObraUrgente() {
		return presupuestoObraUrgente;
	}

	public void setPresupuestoObraUrgente(double presupuestoObraUrgente) {
		this.presupuestoObraUrgente = presupuestoObraUrgente;
	}

	// El ejercicio 3 depende del ejercicio 2
	// procesar es el método pop

}
