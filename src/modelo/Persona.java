package modelo;

public class Persona {
	private String nombre, telefono, correo;
	private int edad;
	private Genero genero;
	
	public Persona(String nombre, String telefono, String correo, int edad, Genero genero) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.edad = edad;
		this.genero = genero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", edad=" + edad
				+ ", genero=" + genero + "]";
	}
	
	

}
