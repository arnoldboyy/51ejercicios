/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción:Programa Java que lea un número entero y calcule si es par o impar.         *
******************************************************************************************/


package ejercicios;
import java.util.Scanner;

public class DiesiSiete {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();
    
    if(numero % 2 == 0) {
      System.out.println(numero + " es un número par.");
    } else {
      System.out.println(numero + " es un número impar.");
    }
  }
}
