
package business;

/**
 * Clase Person: clase donde se declaran los atributos del objeto Persona
 * 
 * @author Monica Alcañiz Puig
 * @version 24 de febrero de 2023
 *
 */

public class Person {
	// Atributos de la clase Person

	private int código;
	public static int contador = 0;
	private String name;
	private String geographic_data;
	private String fechaNacimiento;
	private String phone;
	private String departamento;
	private String email;
	private String ssn;
	private String fechaIncorporacion;
	private String imageTxt; // Health plan beneficiary number
	private String bankAccNum; // Bank account numbers
	private String sueldo;

//Full face photos and comparable images
//Any unique identifying number, characteristic or code

	/**
	 * Constructor Person sin parámetros
	 */

	public Person() {

	}

	/**
	 * Constructor Person con parámetros utilizado para declarar que las variables
	 * de la clase son las mismas que las variables del constructor
	 * 
	 * @param name:               parámetro de tipo String
	 * @param geographic_data:    parámetro de tipo String
	 * @param fechaNacimiento:    parámetro de tipo String
	 * @param phone:              parámetro de tipo String
	 * @param departamento:       parámetro de tipo String
	 * @param email:              parámetro de tipo String
	 * @param ssn:                parámetro de tipo String
	 * @param fechaIncorporacion: parámetro de tipo String
	 * @param imageTxt:           parámetro de tipo String
	 * @param bankAccNum:         parámetro de tipo String
	 */
	public Person(String name, String geographic_data, String fechaNacimiento, String phone, String departamento,
			String email, String ssn, String fechaIncorporacion, String imageTxt, String bankAccNum, String sueldo) {

		this.código = contador;
		contador++;
		this.name = name;
		this.geographic_data = geographic_data;
		this.fechaNacimiento = fechaNacimiento;
		this.phone = phone;
		this.departamento = departamento;
		this.email = email;
		this.ssn = ssn;
		this.fechaIncorporacion = fechaIncorporacion;
		this.imageTxt = imageTxt;
		this.bankAccNum = bankAccNum;
		this.sueldo = sueldo;
	}

	
	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public String getImageTxt() {
		return imageTxt;
	}

	/**
	 * Método getFechaNacimiento de tipo String utilizado para devolver la fecha de
	 * Nacimiento
	 * 
	 * @return fechaNacimiento: parámetro de tipo String
	 */

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Método setFechaNacimiento de tipo String utilizado para indicar que la
	 * variable de la clase es igual a la variable del método
	 * 
	 * @param fechaNacimiento de tipo String
	 */

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	/**
	 * Método getCódigo de tipo int utilizado para devolver el código
	 * 
	 * @return código: parámetro de tipo int
	 */

	public int getCódigo() {
		return código;
	}

	/**
	 * Método getContador de tipo int utilizado para devolver el contador.
	 * 
	 * @return contador: parámetro de tipo int
	 */

	public static int getContador() {
		return contador;
	}

	/**
	 * Método setContador de tipo String utilizado para indicar que la variable de
	 * la clase es igual a la variable del método
	 * 
	 * @param contador de tipo String
	 */

	public static void setContador(int contador) {
		Person.contador = contador;
	}

	/**
	 * Método setcodigo de tipo String utilizado para indicar que la variable
	 * decódigo es igual a la variable contador
	 * 
	 * @param contador
	 */

	public void setCódigo(int código) {
		this.código = código;
	}

	/**
	 * Método getDepartamento de tipo String utilizado para devolver el departamento
	 * 
	 * @return departamento: parámetro de tipo String
	 */

	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Método setDepartamento de tipo String utilizado para indicar que la variable
	 * de la clase es igual a la variable del método
	 * 
	 * @param departamento
	 */

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	/**
	 * Método getFechaIncorporación de tipo String utilizado para devolver la fecha
	 * de Incorporación
	 * 
	 * @return fechaIncorporacion: parámetro de tipo String
	 */

	public String getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	/**
	 * Método setFechaIncorporación de tipo String utilizado para indicar que la
	 * variable de la clase es igual a la variable del método
	 * 
	 * @param fechaIncorporacion
	 */
	public void setFechaIncorporacion(String fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	/**
	 * Método getName de tipo String utilizado para devolver el nombre
	 * 
	 * @return name: parámetro de tipo String
	 */

	public String getName() {
		return name;
	}

	/**
	 * Método setName de tipo String utilizado para indicar que la variable de la
	 * clase es igual a la variable del método
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Método getGeographic_data de tipo String utilizado para devolver la
	 * localizacón
	 * 
	 * @return geographic_data: parámetro de tipo String
	 */

	public String getGeographic_data() {
		return geographic_data;
	}

	/**
	 * Método setGeographic_data de tipo String utilizado para indicar que la
	 * variable de la clase es igual a la variable del método
	 * 
	 * @param geographic_data
	 */

	public void setGeographic_data(String geographic_data) {
		this.geographic_data = geographic_data;
	}

	/**
	 * Método getFechaNacimiento de tipo String utilizado para devolver la fecha de
	 * Nacimiento
	 * 
	 * @return fechaNacimiento: parámetro de tipo String
	 */

	public String getPhone() {
		return phone;
	}

	/**
	 * Método setPhone de tipo String utilizado para indicar que la variable de la
	 * clase es igual a la variable del método
	 * 
	 * @param phone
	 */

	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Método getEmail de tipo String utilizado para devolver el email
	 * 
	 * @return email: parámetro de tipo String
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * Método setEmail de tipo String utilizado para indicar que la variable de la
	 * clase es igual a la variable del método
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método getSSn de tipo String utilizado para devolver la fecha de Nacimiento
	 * 
	 * @return fechaNacimiento: parámetro de tipo String
	 */

	public String getSsn() {
		return ssn;
	}

	/**
	 * Método setSSn de tipo String utilizado para indicar que la variable de la
	 * clase es igual a la variable del método
	 * 
	 * @param ssn
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * Método getImagetxt de tipo String utilizado para devolver la imagen
	 * 
	 * @return imageTxt: parámetro de tipo String
	 */

	public String getImagetxt() {
		return imageTxt;
	}

	/**
	 * Método setImageTxt de tipo String utilizado para indicar que la variable de
	 * la clase es igual a la variable del método
	 * 
	 * @param imageTxt
	 */

	public void setImageTxt(String imageTxt) {
		this.imageTxt = imageTxt;
	}

	/**
	 * Método getBankAccNum de tipo String utilizado para devolver la cuentaBancaria
	 * 
	 * @return bankAccNum: parámetro de tipo String
	 */

	public String getBankAccNum() {
		return bankAccNum;
	}

	/**
	 * Método setBankAccNum de tipo String utilizado para indicar que la variable de
	 * la clase es igual a la variable del método
	 * 
	 * @param bankAccNum
	 */
	public void setBankAccNum(String bankAccNum) {
		this.bankAccNum = bankAccNum;
	}

}
