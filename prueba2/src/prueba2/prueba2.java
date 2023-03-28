package prueba2;

import prueba3.Prueba3;

class B extends Prueba3 {
	    @Override
	    int methodOne(int i) {
	        return methodTwo(i++);
	    }
	}
	 
	public class prueba2 {
	    public static void main(String[] args) {
	      System.out.println(new B().methodOne(101));
	    }
	}