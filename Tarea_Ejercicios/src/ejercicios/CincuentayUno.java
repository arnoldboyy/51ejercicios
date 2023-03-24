/******************* ***********************************************
* Autor:Kevin Arnold Cortés Pacheco                                *
* Fecha Creación: 23/03/23                                         *
* Fecha Actualización: 23/03/23                                    *
* Descripción:Contar los números positivos introducidos por teclado*
********************************************************************/

package ejercicios;

import java.util.Scanner;

public class CincuentayUno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        int numero = 0;
        while (numero >= 0) {
            System.out.print("Introduce un número entero positivo (introduce un número negativo para terminar): ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                contador++;
            }
        }
        System.out.println("Se han introducido " + contador + " números positivos.");
    }
}
