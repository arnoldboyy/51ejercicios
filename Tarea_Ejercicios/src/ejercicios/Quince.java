 /*******************************************************************
* Autor:Kevin Arnold Cortés pacheco                                 *
* Fecha Creación: 23/03/23                                          *
* Fecha Actualización: 23/03/23                                     *
* Descripción:Programa quite a una variable N sus m últimas cifras. *
********************************************************************/

package ejercicios;

import java.util.Scanner;

public class Quince {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int n = scanner.nextInt();
    System.out.print("Ingrese la cantidad de cifras a quitar: ");
    int m = scanner.nextInt();
    
    int resultado = n / (int)Math.pow(10, m);
    resultado = resultado * (int)Math.pow(10, m);
    
    System.out.println("El resultado es: " + resultado);
  }
}
