package proyectoVideoClub;

import java.sql.Date;
import java.time.LocalDate;

public class Prestamo {
	private final int DURACION_PRESTAMO_DEFECTO=2;
	
	private static LocalDate fechaPrestamo; //Esto nos puede servir como el identificaro unico
	private LocalDate fechaDevolucion; 
	private Cliente cliente;
	private Pelicula pelicula;
	
	
	public Prestamo(Date fechaPrestamo, Date fecaDevolucion, Cliente cliente, Pelicula pelicula) {
		this.fechaPrestamo = LocalDate.now();
		this.fechaDevolucion = LocalDate.now().plusDays(DURACION_PRESTAMO_DEFECTO);
		this.cliente = cliente;
		this.pelicula = pelicula;
	}


	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(LocalDate fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Pelicula getPelicula() {
		return pelicula;
	}


	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	
	
	
	
	

}
