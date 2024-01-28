package tema3Clases;

public class MainEmpleado {
	public static void main(String[] args) {

		// Instanciar nuevos objetos - Crear objetos
		Empleado trabajador1 = new Empleado("Marcos");
		Empleado trabajador2 = new Empleado("Lupe");
		Empleado trabajador3 = new Empleado("Helena");
		Empleado trabajador4 = new Empleado("Oso");
		Empleado trabajador5 = new Empleado("Geshit");
		Empleado trabajador6 = new Empleado("Luis");
		Empleado trabajador7 = new Empleado("Atom");

		// Llamada al método 'ObtenerNombreSeccion' mediante el objeto
		System.out.println(trabajador1.ObtenerNombreSeccion());
		System.out.println(trabajador2.ObtenerNombreSeccion());
		System.out.println(trabajador3.ObtenerNombreSeccion());
		System.out.println(trabajador4.ObtenerNombreSeccion());
		System.out.println(trabajador5.ObtenerNombreSeccion());
		System.out.println(trabajador6.ObtenerNombreSeccion());
		System.out.println(trabajador7.ObtenerNombreSeccion());

	}

}
