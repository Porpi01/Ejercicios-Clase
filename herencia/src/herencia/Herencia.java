package herencia;

public class Herencia {
	int dato;

}

class Hijo1 extends Herencia {
	String nombre;
}

class Hijo2 extends Herencia {
	boolean cond;
}

class Hijo3 extends Herencia {
	double num;
}

class Nieto extends Hijo2 {

	int x;


}
