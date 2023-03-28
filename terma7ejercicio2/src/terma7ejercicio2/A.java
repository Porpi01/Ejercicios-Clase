package terma7ejercicio2;

class X {
	protected int i = 1221;

	void methodOfX() {
		System.out.println(i);
	}
}

class MainClass {
	public static void main(String[] args) {
		X x = new X();

		x.methodOfX();
	}
}