/********************************************************
* Autor:Kevin Arnold Cortés pacheco                     *
* Fecha Creación: 23/03/23                              *
* Fecha Actualización: 23/03/23                         *
* Descripción:  Programa que lea dos números por teclado*
               y muestre el resultado de la división del*
              primero por el segundo. Se debe comprobar *
                       que el divisor no puede ser cero * 
*********************************************************/

package ejercicios;

import java.util.Scanner;

public class TreintayUno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el dividendo: ");
        int dividendo = input.nextInt();
        
        int divisor = 0;
        while (divisor == 0) {
            System.out.print("Ingrese el divisor (no puede ser cero): ");
            divisor = input.nextInt();
            if (divisor == 0) {
                System.out.println("El divisor no puede ser cero.");
            }
        }
        
        double resultado = (double) dividendo / divisor;
        System.out.println("El resultado de la division es: " + resultado);
        
        input.close();
    }
}
