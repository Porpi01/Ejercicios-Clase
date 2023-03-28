package tema6ejercicio8;

public class Producto {

	String nombre;
	double precio;
	int unidades;

	Producto() {
	}

	Producto(String nombre, double precio, int unidades) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidades = unidades;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	boolean quedan_unidades() {
		if (this.unidades > 0) {
			return true;
		} else {
			return false;
		}
	}

}
