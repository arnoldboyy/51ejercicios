/*********************************************
* Autor:Kevin Arnold Cortés pacheco          *
* Fecha Creación: 23/03/23                   *
* Fecha Actualización: 23/03/23              *
* Descripción:Programa que lea dos caracteres*
*   y compruebe si son dos letras minúsculas.*
**********************************************/


package ejercicios;

import java.util.Scanner;

public class VeintiSiete {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer carácter: ");
    char caracter1 = scanner.next().charAt(0);
    System.out.print("Ingrese el segundo carácter: ");
    char caracter2 = scanner.next().charAt(0);
    
    if(caracter1 >= 'a' && caracter1 <= 'z' && caracter2 >= 'a' && caracter2 <= 'z') {
      System.out.println("Ambos caracteres son letras minúsculas.");
    } else {
      System.out.println("Los caracteres no son dos letras minúsculas.");
    }
  }
}

