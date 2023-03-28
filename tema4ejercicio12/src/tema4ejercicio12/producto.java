package tema4ejercicio12;

class producto {
	String nombre;
	double precio;
	int unidadesVenta;

	producto() {

	}

	producto(String nombre, double precio, int unidadesVenta) {
		this.nombre = nombre;
		this.precio = precio;
		this.unidadesVenta = unidadesVenta;
	}

	int getUnidadesventa() {
		return this.unidadesVenta;
	}

	String getNombre() {
		return this.nombre;
	}

	void setUnidadesventa(int unidadesVenta) {
		this.unidadesVenta = unidadesVenta;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	double getPrecio() {
		return this.precio;
	}

	void setPrecio(double precio) {
		this.precio = precio;
	}

}
