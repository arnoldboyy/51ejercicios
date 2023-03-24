/******************************************************
* Autor:Kevin Arnold Cortés Pacheco                   *
* Fecha Creación: 23/03/23                            *
* Fecha Actualización: 23/03/23                       *
* Descripción:Programa que lea un número entero N de 5*
*       cifras y muestre sus cifras desde el principio*                                          
*******************************************************/


package ejercicios;

import java.util.Scanner;

public class Once {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de 5 cifras: ");
        int num = sc.nextInt();
        System.out.println("Las cifras de " + num + " desde el principio son:");
        System.out.print(num/10000 + " ");
        System.out.print((num%10000)/1000 + " ");
        System.out.print((num%1000)/100 + " ");
        System.out.print((num%100)/10 + " ");
        System.out.print(num%10);
    }
}
