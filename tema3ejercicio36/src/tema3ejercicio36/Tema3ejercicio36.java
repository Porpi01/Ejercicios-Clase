package tema3ejercicio36;

import java.util.Scanner;

public class Tema3ejercicio36 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner e = new Scanner(System.in);
        int saldo = 10000, intDinero, extDinero, saldoRestante, saldofinal, numero;

        System.out.println("Menú:1)Consultar saldo " + "2)Introducir dinero " + "3)Extraer dinero");

        System.out.println("Escoja un número de opción");
        numero = e.nextInt();
        if (numero > 3)
            System.out.println("Error opción no valida");
        else
            switch (numero) {
            case 1:
                System.out.println("Su saldo actual es " + saldo);
                saldo = e.nextInt();
                break;
            case 2:
                System.out.println("Introducir dinero");
                intDinero = e.nextInt();
                saldoRestante = saldo + intDinero;
                System.out.println("Su saldo actual es " + saldoRestante);
                break;
            case 3:
                System.out.println("Extraer dinero");
                extDinero = e.nextInt();
                saldofinal = saldo - extDinero;
                System.out.println("Su saldo actual es " + saldofinal);
                if (saldofinal == 0) {
                    System.out.println("Su cuenta está vacía");
                    break;
                }

            }
    }

}


