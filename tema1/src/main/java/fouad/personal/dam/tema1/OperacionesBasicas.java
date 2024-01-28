package fouad.personal.dam.tema1;

public class OperacionesBasicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int op1, op2;  //declarar una variable
			double resultado;								   

				op1=21; //asignar valor a una variable
				op2=3;	

				//OPERACIONES
				
				//SUMA
				resultado=op1+op2;	
					System.out.println(op1 +  " + " + op2 + " = " + resultado);
				//RESTA
				resultado=op1-op2;
					System.out.println(op1 +  " - " + op2 + " = " + resultado);
				//MULTIPLICACIÓN
				resultado=op1*op2;		
					System.out.println(op1 +  " * " + op2 + " = " + resultado);
				//DIVISIÓN
				resultado= (double) op1/op2;	//(Casting) Para cambiar la clase de una varibale ponemos la nueva clase entre parentesis, antes de la operación
					System.out.println(op1 +  " / " + op2 + " = " + resultado);
					

	}	
	
}
