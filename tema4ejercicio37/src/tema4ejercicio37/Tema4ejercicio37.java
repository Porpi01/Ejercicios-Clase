package tema4ejercicio37;

class X {
    int i = 1221;
     
    void methodOfX() {
        System.out.println(i);
    }
}
 
public class Tema4ejercicio37 {
    public static void main(String[] args) {
        X x = new X();
        System.out.println(x.i); 
        x.methodOfX();
    }
}
