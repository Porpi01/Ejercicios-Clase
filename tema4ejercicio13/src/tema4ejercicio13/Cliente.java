package tema4ejercicio13;

public class Cliente {
	static int codCliente;
	String nombre;
	int codBici;

	public Cliente(int codCliente, String nombre, int codBici) {
		
		this.nombre = nombre;
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodBici() {
		return codBici;
	}

	public void setCodBici(int codBici) {
		this.codBici = codBici;
	}

	
}