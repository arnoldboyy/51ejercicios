/******************* **********************************
* Autor:Kevin Arnold Cortés Pacheco                   *
* Fecha Creación: 23/03/23                            *
* Fecha Actualización: 23/03/23                       *
* Descripción:Programa que pase de millas a kilómetros*
*******************************************************/

package ejercicios;

import java.util.Scanner;

public class CuarentayNueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa la distancia en millas: ");
        double millas = input.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println(millas + " millas equivalen a " + kilometros + " kilómetros.");
    }
}

