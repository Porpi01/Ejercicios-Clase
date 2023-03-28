package tema7ejercicio11;

import java.util.ArrayList;
import java.util.List;

class Trabajadores {
	protected String nif;

	public Trabajadores() {

	}

	public Trabajadores(String nif) {
		this.nif = nif;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

}

class Asalariados extends Trabajadores {

	private String departamento;
	int salario=1500;

	public Asalariados() {
		super();
	}

	public Asalariados(String nif, String departamento, int salario) {
		super(nif);
	
		this.departamento = departamento;
		this.salario = salario;

	}
	
	

}

class TrabajadoresHoras extends Trabajadores {
	private int salario;
	
	public TrabajadoresHoras () {
		
	}

	public TrabajadoresHoras(String nif, int salario) {
		super(nif);
		this.salario = salario;
	}
	
	public static double calcularSalario (int hora) {
		double sueldo;
		sueldo = hora*3;
		
		return sueldo;
		
	}
}


public class Tema7ejercicio11 {

	public static void main(String[] args) {

		List<Trabajadores> integrantes = new ArrayList<Trabajadores>();
		
		 Asalariados asalariado  = new Asalariados ("11111111", "Administracion", 1500);
		 TrabajadoresHoras trhoras = new TrabajadoresHoras("22222222" , 3);
			
		 integrantes.add(asalariado);
		 integrantes.add(trhoras);
		 
		 System.out.println(asalariado.salario  + " euros al mes");
		 System.out.println(trhoras.calcularSalario(8)+ " euros al dia");
			
		

	}

}
