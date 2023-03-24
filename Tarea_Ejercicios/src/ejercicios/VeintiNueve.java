/*********************************************
* Autor:Kevin Arnold Cortés pacheco          *
* Fecha Creación: 23/03/23                   *
* Fecha Actualización: 23/03/23              *
* Descripción: Programa para calcular si un  *
*                            año es bisiesto.*    
**********************************************/

package ejercicios;

import java.util.Scanner;

public class VeintiNueve {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un año: ");
    int year = scanner.nextInt();
    
    boolean bisiesto = false;
    
    if(year % 4 == 0) {
      if(year % 100 == 0) {
        if(year % 400 == 0) {
          bisiesto = true;
        }
      } else {
        bisiesto = true;
      }
    }
    
    if(bisiesto) {
      System.out.println(year + " es un año bisiesto.");
    } else {
      System.out.println(year + " no es un año bisiesto.");
    }
  }
}

