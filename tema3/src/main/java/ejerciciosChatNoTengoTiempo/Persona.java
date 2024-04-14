package ejerciciosChatNoTengoTiempo;
import java.util.Random;

public class Persona {

	private final String nombre;
    private int edad;
    private  char sexo; //Se supone que esto es un final
    private double peso;
    private double altura;
    private String DNI;

    // Constantes para el cálculo de IMC
    private static final int PESO_IDEAL = 0;
    private static final int DEBAJO_PESO_IDEAL = -1;
    private static final int SOBREPESO = 1;

    // Constructor con el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
        this.generaDNI();
    }

    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this(nombre);
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
    }

    // Constructor con todos los atributos salvo DNI
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura = altura;
    }

    // Métodos

    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : 'H';
    }

    private void generaDNI() {
        Random rnd = new Random();
        int numDNI = rnd.nextInt(90000000) + 10000000; // Número de 8 cifras
        int resto = numDNI % 23;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        this.DNI = numDNI + "" + letras.charAt(resto);
    }

    public int calcularIMC() {
        double imc = peso / Math.pow(altura, 2);
        if (imc < 20) {
            return DEBAJO_PESO_IDEAL;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura +
                "\nDNI: " + DNI;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // Método equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Persona)) return false;
        Persona persona = (Persona) obj;
        return nombre.equals(persona.nombre) &&
                DNI.equals(persona.DNI);
    }

    // Método hashCode
    public int hashCode() {
        return nombre.hashCode() + DNI.hashCode();
    }
    
}
