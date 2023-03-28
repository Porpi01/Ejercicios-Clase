
package business;

public class Person {
    
	

	private static int código ;
	public static int contador =0;
	private String name;
	private String geographic_data;
	private String fechaNacimiento;
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	private String phone;
	private String departamento;
	private String email;
	private String ssn;
	private String fechaIncorporacion;
	private String imageTxt; // Health plan beneficiary number
	private String bankAccNum; // Bank account numbers

//Full face photos and comparable images
//Any unique identifying number, characteristic or code

	public int getCódigo() {
		return código;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Person.contador = contador;
	}

	public void setCódigo(int código) {
		this.código = contador;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGeographic_data() {
		return geographic_data;
	}

	public void setGeographic_data(String geographic_data) {
		this.geographic_data = geographic_data;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getImagetxt() {
		return imageTxt;
	}

	public void setImageTxt(String imageTxt) {
		this.imageTxt = imageTxt;
	}

	public String getBankAccNum() {
		return bankAccNum;
	}

	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

}
