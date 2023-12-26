package practicaHashSet2;

public class Empleado {
	private String nombre;
	private float sueldo;
	public Empleado(String nombre, float sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
}
