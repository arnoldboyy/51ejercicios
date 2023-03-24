/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción: Programa que lea un número entero y muestre si el número es múltiplo de 10 *
******************************************************************************************/


package ejercicios;

import java.util.Scanner;

public class DiesiNueve {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();
    
    if(numero % 10 == 0) {
      System.out.println(numero + " es múltiplo de 10.");
    } else {
      System.out.println(numero + " no es múltiplo de 10.");
    }
  }
}
