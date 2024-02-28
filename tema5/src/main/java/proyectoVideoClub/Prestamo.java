package proyectoVideoClub;

import java.sql.Date;

public class Prestamo {
	
	private static Date fechaPrestamo; //Esto nos puede servir como el identificaro unico
	private Date fechaDevolucion; 
	Cliente cliente;
	Pelicula pelicula;
	
	
	public Prestamo(Date fechaPrestamo, Date fecaDevolucion, Cliente cliente, Pelicula pelicula) {
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fecaDevolucion;
		this.cliente = cliente;
		this.pelicula = pelicula;
	}


	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}


	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	public Date getFechaDevolucion() {
		return fechaDevolucion;
	}


	public void setFechaDevolucion(Date fechaDevolucion) {
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
