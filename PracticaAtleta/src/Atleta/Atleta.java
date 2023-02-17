package Atleta;

public class Atleta {
	protected String dni;
	protected String nombre;
	protected int edad;
	
	@Override
	public String toString() {
		return "Atleta [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	public Atleta(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}

