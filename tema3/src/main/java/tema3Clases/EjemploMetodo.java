package tema3Clases;

public class EjemploMetodo {
	
	
	//...
	
	
	//Métodos como comportamiento
	class Avion{
		
		//atributos declaración
		int cantidadCombustible=1000;
		double alturaVuelo=1;
		
		//métodos declaración
		boolean	despegar(int cantidadCombustible, int alturaVuelo){ // el tipo puede ser cualquiera: boolean, int, char....
		
			this.cantidadCombustible=this.cantidadCombustible - cantidadCombustible;
			this.alturaVuelo=this.alturaVuelo + alturaVuelo;
			
			/*
			if(this.cantidadCombustible>0) {
				return true;
			}else {
				return false;
			}
			*/
			// Es lo mismo que hacer el if-else
			return  (this.cantidadCombustible>0);
			// true si cantidadCombustible > 0;
			// false si cantidadCombustible < 0;
			
		}
		
		// Todo esto iría en otra clase (main)
		
		/*
		Avion avion1=new Avion ();
		
		boolean despegue= avion1.despegar(100,20000);
		System.out.print(despegue);
		*/
	}
	
	
	

}
