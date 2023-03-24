/********************************************************************************
* Autor:Kevin Arnold Cortés Pacheco                                             *
* Fecha Creación: 23/03/23                                                      *
* Fecha Actualización: 23/03/23                                                 *
* Descripción:Programa lea la longitud de los catetos de un triángulo rectángulo*
*           y calcule la longitud de la hipotenusa según el teorema de Pitágoras*                                              
*********************************************************************************/

package ejercicios;

import java.util.Scanner;

public class Siete {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del primer cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Ingrese la longitud del segundo cateto: ");
        cateto2 = sc.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La longitud de la hipotenusa es: " + hipotenusa);
    }
}