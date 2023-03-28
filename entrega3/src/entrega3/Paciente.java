package entrega3;

//Monica Alcañiz Puig
class Paciente {// Atributos de la clase paciente

	String nombre, SIP;
	int edad;
	double glucosa, HDL, LDL, VLDL, hierro, potasio, colesterolTotal, noHDL, sodio, trigliceridos;
	char sexo;

	Paciente() {/* Constructor paciente sin parametros */

	}

	Paciente(String nombre, char sexo, String SIP, int edad, double glucosa, double HDL, double LDL, double VLDL,
			double hierro, double potasio, double colesterolTotal, double noHDL, double sodio, double trigliceridos) {
		this.nombre = nombre;
		this.sexo = sexo;
		this.SIP = SIP;
		this.edad = edad;
		this.glucosa = glucosa;
		this.HDL = HDL;
		this.LDL = LDL;
		this.VLDL = VLDL;
		this.hierro = hierro;
		this.potasio = potasio;
		this.colesterolTotal = colesterolTotal;
		this.noHDL = noHDL;
		this.sodio = sodio;
		this.trigliceridos = trigliceridos;
	}/*
		 * Constructor paciente con parametros Sexo,SIP, edad, glucosa, HDL, LDL, VLDL,
		 * hierro, potasio, colesterolTotla, noHDL, sodio y trigliceridos
		 */

	public double getSodio() {
		return sodio;
	}

	public void setSodio(double sodio) {
		this.sodio = sodio;
	}

	public double getTrigliceridos() {
		return trigliceridos;
	}

	public void setTrigliceridos(double trigliceridos) {
		this.trigliceridos = trigliceridos;
	}

	public double getColesterolTotal() {// Declaración de get y set de los atributos de la clase Paciente
		return colesterolTotal;
	}

	public void setColesterolTotal(double colesterolTotal) {
		this.colesterolTotal = colesterolTotal;
	}

	public double getNoHDL() {
		return noHDL;
	}

	public void setNoHDL(double noHDL) {
		this.noHDL = noHDL;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getSIP() {
		return SIP;
	}

	public void setSIP(String SIP) {
		this.SIP = SIP;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getGlucosa() {
		return glucosa;
	}

	public void setGlucosa(double glucosa) {
		this.glucosa = glucosa;
	}

	public double getHDL() {
		return HDL;
	}

	public void setHDL(double hDL) {
		HDL = hDL;
	}

	public double getLDL() {
		return LDL;
	}

	public void setLDL(double lDL) {
		LDL = lDL;
	}

	public double getVLDL() {
		return VLDL;
	}

	public void setVLDL(double vLDL) {
		VLDL = vLDL;
	}

	public double getHierro() {
		return hierro;
	}

	public void setHierro(double hierro) {
		this.hierro = hierro;
	}

	public double getPotasio() {
		return potasio;
	}

	public void setPotasio(double potasio) {
		this.potasio = potasio;
	}

}

