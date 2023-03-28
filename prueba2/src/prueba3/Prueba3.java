package prueba3;

public class Prueba3 {
    private int methodOne(int i)  {
        return i++;
    }
     
    public int methodTwo(int i)   {
        return methodOne(i++);
    }
}
