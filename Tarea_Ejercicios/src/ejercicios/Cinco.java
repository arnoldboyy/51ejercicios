/************************************************************************************************
* Autor:Kevin Arnold Cortés Pacheco                                                             *
* Fecha Creación: 23/03/23                                                                      *
* Fecha Actualización: 23/03/23                                                                 *
* Descripción: Programa que lee por teclado el valor del radio de una circunferencia y calcula y*
*                muestra por pantalla la longitud y el área de la circunferencia. Longitud de la*
*                            circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2*                                         *
*************************************************************************************************/


package ejercicios;

import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor del radio de la circunferencia: ");
        double radio = sc.nextDouble();
        
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }
}