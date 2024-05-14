package ut9.Serverproduct;

public class Producto {
	
	public final Integer id;
	public final String name;
	
	
	public Producto(int id, String name) {
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Productos [id=" + id + ", name=" + name + "]";
	}
	
	
	
	

}
