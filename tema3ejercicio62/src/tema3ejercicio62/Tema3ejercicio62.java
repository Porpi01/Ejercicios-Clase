package tema3ejercicio62;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Tema3ejercicio62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
        String dominio;

        System.out.println("Introduce dominio página web: ");
        dominio = entrada.nextLine();
        Pattern pat = Pattern.compile("^https?:\\/\\/(www\\.)?[a-z]+\\.[a-z]{2,3}$");
        Matcher mat = pat.matcher(dominio);
        if (mat.matches()) {
            System.out.println("Cumple el patrón");
        } else {
            System.out.println("No cumple el patrón");
        }

    }

}


	


