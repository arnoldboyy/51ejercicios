/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción: Programa que lea dos números y calcula cuál es el mayor.                   *
******************************************************************************************/

package ejercicios;

import java.util.Scanner;

public class VeintiUno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    
    if(numero1 > numero2) {
      System.out.println(numero1 + " es mayor que " + numero2 + ".");
    } else if(numero2 > numero1) {
      System.out.println(numero2 + " es mayor que " + numero1 + ".");
    } else {
      System.out.println("Los números son iguales.");
    }
  }
}