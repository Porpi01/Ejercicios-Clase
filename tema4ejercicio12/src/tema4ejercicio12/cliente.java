package tema4ejercicio12;

class cliente {
	double dinero;
	String nombre;

	cliente() {

	}

	cliente(String nombre, double dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}

	double getDinero() {
		return this.dinero;
	}

	String getNombre() {
		return this.nombre;
	}

	void setDinero(double dinero) {
		this.dinero = dinero;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
