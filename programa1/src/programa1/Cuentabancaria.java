package programa1;
//Monica Alcañiz Puig
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



class CuentaBancaria {
	double saldoActual;
	String iban;
	
	CuentaBancaria(){
		
	}
	
	CuentaBancaria(double saldoActual,String iban){
		this.saldoActual= saldoActual;
		this.iban = iban;
	}

	public double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(double saldoActual) {
		this.saldoActual = saldoActual;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}


}

class Programa1 {//Declaracion constantes
	
static final double DINERO_INGRESADO_PRIMERA_CUENTA =300;
static final double DINERO_INGRESADO_SEGUNDA_CUENTA = 500;
static final double DINERO_TRANSFERIDO_PRIMERA_CUENTA = 200;
static final double DINERO_TRANSFERIDO_SEGUNDA_CUENTA= 100;


	void mostrarCuentaBancaria(CuentaBancaria cb) {// constructor cuentaBancaria donde se muestran sus atributos
		System.out.println(cb.getIban());
		System.out.println(cb.getSaldoActual());
	}
	double ingresarDinero(CuentaBancaria cb) {//metodo ingresar Dinero de la primera cuentaBancaria
		double saldo=0;
		saldo = saldo+DINERO_INGRESADO_PRIMERA_CUENTA;
		return saldo;
		
		
	}
    
	double ingresarDinero2 (CuentaBancaria cb2) {//metodo ingresar Dinero de la segunda cuentaBancaria
		double saldo2=0;
		saldo2 = saldo2+DINERO_INGRESADO_SEGUNDA_CUENTA;
		return saldo2; 
	}
double transferirDinero1 (CuentaBancaria cb, double saldo) {//metodo transferir dinero de la primera a la segunda cuenta bancaria
	
	saldo= DINERO_INGRESADO_PRIMERA_CUENTA - DINERO_TRANSFERIDO_SEGUNDA_CUENTA*0.02;
	
	return saldo;
}
	double transferirDinero2 (CuentaBancaria cb2, double saldo2) {// metodo transferir dinero de la segunda a la primera cuenta bancaria
		saldo2= DINERO_INGRESADO_SEGUNDA_CUENTA + DINERO_TRANSFERIDO_PRIMERA_CUENTA*0.02;
		return saldo2;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);//Creacion de objetos
		Programa1 p = new Programa1();
		CuentaBancaria cb = new CuentaBancaria();
		CuentaBancaria cb2 = new CuentaBancaria();
		
		double saldo=0,saldo2=0, dineroIngresado, dineroExtraido, DineroTRansferido;
		String iban;
		boolean comprobar;
		
	//Creacion de la primera cuenta bancaria
	
				do {// Comprobación del IBAN
				Pattern pat = Pattern.compile("^ES\\d{22}$");
				System.out.println("Introduce tu IBAN: ");
				iban = entrada.next();
				Matcher mat = pat.matcher(iban);
				if (mat.matches()) {
					comprobar = true;
				} else {
					comprobar = false;

				}
			} while (comprobar == false);
			cb = new CuentaBancaria(0, iban);
			
		//Creacion de la segunda cuenta bancaria
			
			do {// Comprobación del IBAN
				Pattern pat = Pattern.compile("^ES\\d{22}$");
				System.out.println("Introduce otro IBAN: ");
				iban = entrada.next();
				Matcher mat = pat.matcher(iban);
				if (mat.matches()) {
					comprobar = true;
				} else {
					comprobar = false;

				}
			} while (comprobar == false);
			cb2 = new CuentaBancaria(0, iban);
			
		System.out.println(p.ingresarDinero(cb)+"euros" );
		System.out.println(p.ingresarDinero2(cb2)+ "euros");
		System.out.println(p.transferirDinero1(cb,saldo)+"euros");
		System.out.println(p.transferirDinero2(cb2,saldo2)+"euros");
		
		
		
		
		}
	}


