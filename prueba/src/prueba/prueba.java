package prueba;


class CuentaBancaria {
	private int saldo = 0;

	public void operar(int a) {
		saldo += a;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
}

class Prueba {
	
	public static void main(String[] args) {
		
		CuentaBancaria c = new CuentaBancaria();
		c.setSaldo(-1000);
		System.out.println(c.getSaldo());
	}
}

