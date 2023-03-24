/************************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                             *
* Fecha Creación: 23/03/23                                                                      *
* Fecha Actualización: 23/03/23                                                                 *
* Descripción:. Programa que lea un carácter por teclado y compruebe si es una letra mayúscula. *
************************************************************************************************/

package ejercicios;


import java.util.Scanner;

public class VeintiCinco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un carácter: ");
    char caracter = scanner.next().charAt(0);
    
    if(caracter >= 'A' && caracter <= 'Z') {
      System.out.println(caracter + " es una letra mayúscula.");
    } else {
      System.out.println(caracter + " no es una letra mayúscula.");
    }
  }
}