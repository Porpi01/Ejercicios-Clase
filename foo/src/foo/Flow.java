package foo;

public class Flow {

	private Flow() {
	}
	
	public static void main(String[] args) {
		Flow f = new Flow();
		
		Object o = getObject();
		Object o2 = o;
		Logger.log(o2.toString());//no funciona
	}
	private static Object getObject() {
		return true;
		
	}

}
