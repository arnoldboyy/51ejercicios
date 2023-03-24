/****************************************************************************
* Autor:Kevin Arnold Cortés Pacheco                                         *
* Fecha Creación: 23/03/23                                                  *
* Fecha Actualización: 23/03/23                                             *
* Descripción: Programa Java que lea dos números enteros por teclado        *
*                                                y los muestre por pantalla.*
*****************************************************************************/

package ejercicios;

import java.util.Scanner;

public class Uno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();
        
        System.out.println("Los números introducidos son: " + num1 + " y " + num2);
    }
}
