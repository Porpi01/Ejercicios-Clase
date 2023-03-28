package entrega3;

//Monica Alcañiz Puig
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Entrega3 {

	static final double GLUCOSA_MIN_NORMAL = 70;/* Declaración de constantes */
	static final double GLUCOSA_MAX_NORMAL = 100;
	static final double GLUCOSA_MIN_MEDIA = 100;
	static final double GLUCOSA_MAX_MEDIA = 125;
	static final double GLUCOSA_ALTA = 126;

	static final double HIERRO_MIN_NORMAL = 60;
	static final double HIERRO_MAX_NORMAL = 170;

	static final double POTASIO_MIN_NORMAL = 3.7;
	static final double POTASIO_MAX_NORMAL = 5.2;

	static final double COLESTEROL_NORMAL_MENORES = 170;
	static final double NOHDL_MIN_MENORES = 120;

	static final double HDL_MENORES = 45;

	static final double COLESTEROL_MAX_MAYORES = 200;
	static final double COLESTEROL_MIN_MAYORES = 125;
	static final double NOHDL_MAYORES = 130;

	static final double LDL = 100;

	static final double HDL_HOMBRES = 40;

	static final double HDL_MUJER = 50;

	static final double SODIO_MIN_NORMAL = 135;
	static final double SODIO_MAX_NORMAL = 145;

	static final double TRIGLICERIDOS_NORMAL_ADULTO = 150;
	static final double TRIGLICERIDOS_LIMITE_ALTO_MIN_ADULTO = 151;

	static final double TRIGLICERIDOS_ALTO_ADULTO = 200;
	static final double TRIGLICERIDOS_MUY_ALTO_ADULTO = 500;

	static final double TRIGLICERIDOS_NORMAL_MENOR = 75;
	static final double TRIGLICERIDOS_LIMITE_ALTO_MAX_MENOR = 99;
	static final double TRIGLICERIDOS_ALTO_MENOR = 100;

	static final double TRIGLICERIDOS_NORMAL_ADOLESCENTE = 90;
	static final double TRIGLICERIDOS_LIMITE_ALTO_MIN_ADOLESCENTE = 90;
	static final double TRIGLICERIDOS_LIMITE_ALTO_MAX_ADOLESCENTE = 129;
	static final double TRIGLICERIDOS_ALTO_ADOLESCENTE = 130;

	/* Fin declaración de constantes */

	void mostrarMenu() { /* Este constructor muestra el menú con las posibles opciones */
		System.out.println("Escoge una opción");
		System.out.println("1. Introduce los datos: ");
		System.out.println("2. Analisis Glucosa: ");
		System.out.println("3. Analisis Hierro: ");
		System.out.println("4. Analisis Potasio: ");
		System.out.println("5. Analisis Colesterol: ");
		System.out.println("6. Analisis Sodio: ");
		System.out.println("7. Analisis trigliceridos: ");
		System.out.println("8. Mostrar estado paciente: ");
		System.out.println("9. Salir");
	}

	void mostrarPaciente(Paciente p) {/* Este constructor muestra los atributos de la clase Paciente p */
		System.out.println(p.getNombre());
		System.out.println(p.getEdad());
		System.out.println(p.getSexo());
		System.out.println(p.getSIP());
		System.out.println(p.getHDL());
		System.out.println(p.getLDL());
		System.out.println(p.getVLDL());
		System.out.println(p.getHierro());
		System.out.println(p.getPotasio());
		System.out.println(p.getGlucosa());
		System.out.println(p.getNoHDL());
		System.out.println(p.getColesterolTotal());
		System.out.println(p.getSodio());
		System.out.println(p.getTrigliceridos());
	}

	double calcularGlucosa(Paciente p) {/*
										 * Este método calcula el nivel de glucosa del paciente, devolviendo un numero
										 * en función de su estado
										 */

		double glucosa = p.getGlucosa();

		if ((glucosa >= GLUCOSA_MIN_NORMAL) && (glucosa <= GLUCOSA_MAX_NORMAL)) {
			return 0;
		} else if ((glucosa >= GLUCOSA_MIN_MEDIA) && (glucosa <= GLUCOSA_MAX_MEDIA)) {
			return 1;

		} else if (glucosa > GLUCOSA_ALTA) {
			return 2;
		} else {
			return 3;
		}
	}

	void mostrarGlucosa(int estado) {/*
										 * Este método imprime por pantalla el nivel de glucosa del paciente
										 * anteriormente calculado con el método calcularGlucosa, en función del número
										 * devuelto
										 */

		switch (estado) {
		case 0:
			System.out.println("Su nivel de glucosa es normal");
			break;
		case 1:
			System.out.println("Usted tiene prediabetes");
			break;
		case 2:
			System.out.println("Usted tiene diabetes");
			break;
		case 3:
			break;

		}

	}

	double calcularHierro(Paciente p) {/*
										 * Este método calcula el nivel de hierro del paciente, devolviendo un numero en
										 * función de su estado
										 */

		double hierro = p.getHierro();

		if ((hierro >= HIERRO_MIN_NORMAL) && (hierro <= HIERRO_MAX_NORMAL)) {
			return 0;
		} else if (hierro < HIERRO_MIN_NORMAL) {
			return 1;

		} else {
			return 2;
		}

	}

	void mostrarHierro(int estado) {/*
									 * Este método imprime por pantalla el nivel de hierro del paciente
									 * anteriormente calculado con el método calcularHierro, en función del número
									 * devuelto
									 */

		switch (estado) {
		case 0:
			System.out.println("Su nivel de hierro es normal");
			break;
		case 1:
			System.out.println("Usted tiene anemia");
			break;
		case 2:
			System.out.println("Usted tiene hemocromatosis");
			break;
		}

	}

	double calcularPotasio(Paciente p) {/*
										 * Este método calcula el nivel de potasio del paciente, devolviendo un numero
										 * en función de su estado
										 */

		double potasio = p.getPotasio();

		if ((potasio >= POTASIO_MIN_NORMAL) && (potasio <= POTASIO_MAX_NORMAL)) {
			return 0;
		} else if (potasio < POTASIO_MIN_NORMAL) {
			return 1;

		} else {
			return 2;
		}

	}

	void mostrarPotasio(int estado) {/*
										 * Este método imprime por pantalla el nivel de potasio del paciente
										 * anteriormente calculado con el método calcularPotasio, en función del número
										 * devuelto.
										 */

		switch (estado) {
		case 0:
			System.out.println("Su nivel de potasio es normal");
			break;
		case 1:
			System.out.println("Usted tiene carencia de potasio");
			break;
		case 2:
			System.out.println("Usted tiene hiperpotasemia");
			break;
		}

	}

	double calcularColesterolTotal(Paciente p) {/*
												 * Este método calcula la cantidad de colesterol en el paciente en
												 * función de las concentraciones de HDL, LDL y VLDL
												 */

		double colesterolTotal;
		colesterolTotal = p.getHDL() + p.getLDL() + p.getVLDL();
		return colesterolTotal;

	}

	double calcularColesterolEdad(Paciente p,
			double colesterol) {/*
								 * Este método calcula el nivel de ColesterolTotal del paciente, el cual depende
								 * de la edad, devolviendo un numero en función de su estado
								 */

		if (p.getEdad() <= 19) {

			if (colesterol <= COLESTEROL_NORMAL_MENORES) {
				return 0;
			} else {
				return 1;
			}
		} else {

			if ((colesterol >= COLESTEROL_MIN_MAYORES) && (colesterol <= COLESTEROL_MAX_MAYORES)) {
				return 0;
			} else {
				return 1;

			}
		}
	}

	void mostrarColesterol(int estado) {/*
										 * Este método imprime por pantalla el nivel de ColesterolTotal del paciente
										 * anteriormente calculado con el método calcularColesterolTotalEdad, en función
										 * del número devuelto
										 */

		if (estado == 0) {
			System.out.println("Su nivel de colesterol es normal");
		} else {
			System.out.println("Su nivel de colesterol es malo");

		}
	}

	double calcularNoHDL(Paciente p) {/*
										 * Este método calcula la cantidad de NoHDL en el paciente, en función de las
										 * concentraciones de LDL y VLDL
										 */

		double noHDl;
		noHDl = p.getLDL() + p.getVLDL();
		return noHDl;
	}

	double calcularNoHDLSexo(Paciente p,
			double noHDL) {/*
							 * Este método calcula el nivel de NoHDL del paciente, el cual depende de la
							 * edad, devolviendo un numero en función de su estado
							 */

		if (p.getEdad() <= 19) {

			if (noHDL <= NOHDL_MIN_MENORES) {
				return 0;
			} else {
				return 1;
			}
		} else {

			if (noHDL <= NOHDL_MAYORES) {
				return 0;
			} else {
				return 1;
			}
		}

	}

	void mostrarNoHDLSexo(int estado) {/*
										 * Este método imprime por pantalla el nivel de NoHDL del paciente,
										 * anteriormente calculado con el método calcularNoHDL, en función del número
										 * devuelto
										 */

		if (estado == 0) {
			System.out.println("Su nivel de No-HDL es normal");
		} else {
			System.out.println("Su nivel de No-HDL es malo");

		}
	}

	double calcularLDL(Paciente p) {/*
									 * Este método calcula el nivel de LDL del paciente, devolviendo un numero en
									 * función de su estado
									 */

		if (p.getLDL() <= LDL) {
			return 0;
		} else {
			return 1;
		}
	}

	void mostrarLDL(int estado) {/*
									 * Este método imprime por pantalla el nivel de LDL del paciente anteriormente
									 * calculado con el método calcularLDL, en función del número devuelto
									 */
		if (estado == 0) {
			System.out.println("Su nivel de LDL es normal");
		} else {
			System.out.println("Su nivel de LDL es malo");

		}
	}

	double calcularHDL(Paciente p) {/*
									 * Este método calcula el nivel de HDL del paciente,el cual depende del sexo y
									 * la edad, devolviendo un numero en función de su estado
									 */

		if (p.getEdad() <= 19) {

			if (p.getHDL() >= HDL_MENORES) {
				return 0;
			} else {
				return 1;
			}
		} else {

			if (p.getSexo() == 'm') {
				if (p.getHDL() >= HDL_MUJER) {
					return 0;
				} else {
					return 1;
				}

			} else if (p.getSexo() == 'h') {
				if (p.getHDL() >= HDL_HOMBRES) {
					return 0;
				} else {
					return 1;

				}
			}
		}
		return 0;
	}

	void mostrarHDL(int estado) {/*
									 * Este método imprime por pantalla el nivel deHDL del paciente anteriormente
									 * calculado con el método calcularHDL, en función del número devuelto
									 */

		if (estado == 0) {
			System.out.println("Su nivel de HDL es normal");
		} else {
			System.out.println("Su nivel de HDL es malo");

		}
	}

	double calcularSodio(Paciente p) {/*
										 * Este método calcula el nivel de Sodio del paciente devolviendo un numero en
										 * función de su estado
										 */

		if ((p.getSodio() >= SODIO_MIN_NORMAL) && (p.getSodio() <= SODIO_MAX_NORMAL)) {
			return 0;
		} else if (p.getSodio() < SODIO_MIN_NORMAL) {
			return 1;
		} else {
			return 2;
		}
	}

	void mostrarSodio(int estado) {/*
									 * Este método imprime por pantalla el nivel sodio del paciente anteriormente
									 * calculado con el método calcularSodio, en función del número devuelto
									 */
		if (estado == 0) {
			System.out.println("Su nivel de sodio es normal");
		} else if (estado == 1) {
			System.out.println("Su nivel de sodio es bajo");
		} else {
			System.out.println("Su nivel de sodio es alto");
		}
	}

	double calcularTrigliceridos(Paciente p) {/*
		 * Este método calcula el nivel de Trigliceridos del paciente devolviendo un numero en
		 * función de su estado y su edad
		 */
		if (p.getEdad() < 10) {

			if (p.getTrigliceridos() < TRIGLICERIDOS_NORMAL_MENOR) {
				return 0;
			} else if ((p.getTrigliceridos() >= TRIGLICERIDOS_NORMAL_MENOR)
					&& (p.getTrigliceridos() <= TRIGLICERIDOS_LIMITE_ALTO_MAX_MENOR)) {
				return 1;
			} else {
				return 2;
			}
		} else if ((p.getEdad() >= 10) && (p.getEdad() <= 19)) {

			if ((p.getTrigliceridos() < TRIGLICERIDOS_NORMAL_ADOLESCENTE)) {
				return 0;
			} else if ((p.getTrigliceridos() >= TRIGLICERIDOS_NORMAL_ADOLESCENTE)
					&& (p.getTrigliceridos() <= TRIGLICERIDOS_LIMITE_ALTO_MAX_ADOLESCENTE)) {
				return 1;

			} else {
				return 2;
			}

		} else {
			if (p.getTrigliceridos() <= TRIGLICERIDOS_NORMAL_ADULTO) {
				return 0;
			} else if ((p.getTrigliceridos() > TRIGLICERIDOS_NORMAL_ADULTO)
					&& (p.getTrigliceridos() < TRIGLICERIDOS_ALTO_ADULTO)) {
				return 1;
			} else if ((p.getTrigliceridos() >= TRIGLICERIDOS_ALTO_ADULTO)&&(p.getTrigliceridos()<TRIGLICERIDOS_MUY_ALTO_ADULTO)) {
				return 2;
			} else {
				return 3;
			}
		}

	}

	void mostrarTrigliceridos(int estado) {/*
		 * Este método imprime por pantalla el nivel de trigliceridos del paciente anteriormente
		 * calculado con el método calcularTrigliceridos en función del número devuelto y su edad
		 */
		switch (estado) {
		case 0:
			System.out.println("Su nivel de trigliceridos es normal");
			break;
		case 1:
			System.out.println("Su nivel de trigliceridos es un poco alto ");
			break;
		case 2:
			System.out.println("Su nivel de trigliceridos es alto");
			break;
		case 3:
			System.out.println("Su nivel de trigliceridos es muy alto");
			break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		Entrega3 m = new Entrega3();// Creación de objetos de la clase y del paciente
		Paciente p = new Paciente();

		int opcion, edad, estado = 0;// Declaración variables

		String nombre, SIP;
		double glucosa, hierro, potasio, HDL, LDL, VLDL, colesterolTotal = 0, NoHDL = 0, sodio, trigliceridos;
		char sexo;
		boolean comprobar;

		do {
			m.mostrarMenu();// Llamada al constructor mostrarMenu
			opcion = entrada.nextInt();
			switch (opcion) {

			case 1:// Pedida de variables del paciente

				do {// Comprobación del nombre
					Pattern pat = Pattern.compile("^[A-Z][a-z]+$");
					System.out.println("Introduce nombre: ");
					nombre = entrada.next();
					Matcher mat = pat.matcher(nombre);
					if (mat.matches()) {
						comprobar = true;
					} else {
						comprobar = false;

					}
				} while (comprobar == false);

				System.out.println("Introduce la edad: ");
				edad = entrada.nextInt();
				
				
				System.out.println("Introduce el sexo: ");
				sexo = entrada.next().charAt(0);
				
				do {// Comprobacion del SIP
					Pattern pat = Pattern.compile("^\\d{8}$");
					System.out.println("Introduce el SIP: ");
					SIP = entrada.next();
					Matcher mat = pat.matcher(SIP);
					if (mat.matches()) {
						comprobar = true;
					} else {
						comprobar = false;
					}
				} while (comprobar == false);

				System.out.println("Introduce nivel de glucosa: ");
				glucosa = entrada.nextDouble();
				System.out.println("Introduce nivel de hierro: ");
				hierro = entrada.nextDouble();
				System.out.println("Introduce nivel de potasio ");
				potasio = entrada.nextDouble();
				System.out.println("Introduce nivel de HDL: ");
				HDL = entrada.nextDouble();
				System.out.println("Introduce nivel de LDL: ");
				LDL = entrada.nextDouble();
				System.out.println("Introduce nivel de VLDL:");
				VLDL = entrada.nextDouble();
				System.out.println("Introduce nivel de sodio:");
				sodio = entrada.nextDouble();
				System.out.println("Introduce nivel de trigliceridos");
				trigliceridos = entrada.nextDouble();
				p = new Paciente(nombre, sexo, SIP, edad, glucosa, HDL, LDL, VLDL, hierro, potasio, colesterolTotal,
						NoHDL, sodio, trigliceridos);
				colesterolTotal = (int) m.calcularColesterolTotal(p);

				break;
			case 2:

				estado = (int) m.calcularGlucosa(p);//Invocacion al metodo calcularGlucosa
				m.mostrarGlucosa(estado);//Invocacion al metodo mostrarGlucosa

				break;

			case 3:

				estado = (int) m.calcularHierro(p);//Invocacion al metodo calcularHierro
				m.mostrarHierro(estado);//Invocacion al metodo mostrarHierro

				break;
			case 4:
				estado = (int) m.calcularPotasio(p);//Invocacion al metodo calcularPotasio
				m.mostrarPotasio(estado);//Invocacion al metodo mostrarPotasio

				break;
			case 5:

				estado = (int) m.calcularColesterolEdad(p, colesterolTotal);//Invocacion al metodo calcularColesterolTotal
				m.mostrarColesterol(estado);//Invocacion al metodo mostrarColesterol

				NoHDL = m.calcularNoHDL(p);//Invocación al método calcular NoHDL
				estado = (int) m.calcularNoHDLSexo(p, NoHDL);//Invocación al método calcularNoHDL
				m.mostrarNoHDLSexo(estado);//Invocacion al metodo mostrarSexo

				estado = (int) m.calcularLDL(p);//Invocación al metodo calcularLDL
				m.mostrarLDL(estado);//Invocacion al metodo LDL

				estado = (int) m.calcularHDL(p);//Invocacion al metodo calcularHDL
				m.mostrarHDL(estado);//Invocacion al metodo mostrarHDL
				
				break;
			case 6:
				estado = (int) m.calcularSodio(p);//Invocacion al metodo calcularSodio
				m.mostrarSodio(estado);//Invocacion al metodo mostrarSodio
				break;
				
			case 7:
				estado = (int) m.calcularTrigliceridos(p);//Invocacion al metodo calcularTrigliceridos
				m.mostrarTrigliceridos(estado);//Invocacion al metodo mostrarTrigliceridos

				break;
			case 8:
				estado = (int) m.calcularGlucosa(p);
				m.mostrarGlucosa(estado);

				estado = (int) m.calcularHierro(p);
				m.mostrarHierro(estado);

				estado = (int) m.calcularPotasio(p);
				m.mostrarPotasio(estado);

				colesterolTotal = (int) m.calcularColesterolTotal(p);
				estado = (int) m.calcularColesterolEdad(p, colesterolTotal);
				m.mostrarColesterol(estado);

				NoHDL = m.calcularNoHDL(p);
				estado = (int) m.calcularNoHDLSexo(p, NoHDL);
				m.mostrarNoHDLSexo(estado);

				estado = (int) m.calcularLDL(p);
				m.mostrarLDL(estado);

				estado = (int) m.calcularHDL(p);
				m.mostrarHDL(estado);

				estado = (int) m.calcularSodio(p);
				m.mostrarSodio(estado);

				estado = (int) m.calcularTrigliceridos(p);
				m.mostrarTrigliceridos(estado);
				break;
				
			case 9:
				System.out.println("Salir");
				break;
				
			default:
				System.out.println("Error");
				break;

			}
		} while (opcion != 9);

	}
}
