package tema4ejercicio13;

class Bici {
	static int codBici;
	boolean libre;
	int codUsuario; // Usuario que alquila la bici (0 si está libre)

	public Bici(int codBici, boolean libre, int CodUsuario) {
	
	this.libre = libre;
	this.codUsuario=0;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public int getCodBici() {
		return codBici;
	}

	public void setCodBici(int codBici) {
		this.codBici = codBici;
	}

	public boolean isLibre() {
		return libre;
	}

	public void setLibre(boolean libre) {
		this.libre = libre;
	}
}