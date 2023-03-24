/***************************************************
* Autor:Kevin Arnold Cortés Pacheco                *
* Fecha Creación: 23/03/23                         *
* Fecha Actualización: 23/03/23                    *
* Descripción: Programa que calcula el número de la*
*     suerte de una persona a partir de su fecha de*
*                                       nacimiento.*                                   
****************************************************/

package ejercicios;

import java.util.Scanner;

public class Trece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu fecha de nacimiento en formato dd/mm/aaaa: ");
        String fecha = sc.nextLine();
        int dia = Integer.parseInt(fecha.substring(0,2));
        int mes = Integer.parseInt(fecha.substring(3,5));
        int anio = Integer.parseInt(fecha.substring(6));
        int suma = dia + mes + anio;
        while (suma > 9) {
            int aux = suma;
            suma = 0;
            while (aux > 0) {
                suma += aux % 10;
                aux /= 10;
            }
        }
        System.out.println("Tu número de la suerte es " + suma + ".");
    }
}