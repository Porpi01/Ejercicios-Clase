package tema6ejercicio8;

public class Cliente {
	String nombre;
	double dinero;

	Cliente() {
	}

	Cliente(String nombre, double dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public double getDinero() {
		return dinero;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	boolean quedaDinero() {
		if (dinero > 0) {
			return true;
		} else {
			return false;
		}
	}
}

	