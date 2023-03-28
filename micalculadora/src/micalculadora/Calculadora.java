package micalculadora;

public class Calculadora {

	private int num1;
	private int num2;
	private int num3;

	public Calculadora(int a, int b, int c) {
		this.num1 = a;
		this.num2 = b;
		this.num3 = c;
	}
	
    public int suma() {
    	int resultado = num1 + num2;
    	return resultado;
    }
    
    public int resta() {
    	int resultado = num1 - num2;
    	return resultado;
    }
    
    public int multiplicacion() {
    	int resultado = num1 * num2;
    	return resultado;
    }
    
    public int division() {
    	int resultado = num1 / num2;
    	return resultado;
    }
    
    public int cartesiano() {
    	int resultado = num1 * num2 * num3;
    	return resultado;
    }
    
    public int sumatriple() {
    	int resultado = num1 + num2 + num3;
    	return resultado;
    }
    
    public float media() {
    	float resultado = (num1 + num2 + num3)/3;
    	return resultado;
    }
    
    public int mayordelostres() {
    	if((num1> num3) && (num1 >num2)) {
    		return num1;
    	}else if((num2 > num3)) {
    		return num2;
    	}else {
    		return num3;
    	}
		
    	
    }
    
    
    

}
