/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción:Comprobar si un número es múltiplo de tres y de cinco.                      *
******************************************************************************************/

package ejercicios;
import java.util.Scanner;

public class VeintiTres {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();
    
    if(numero % 3 == 0 && numero % 5 == 0) {
      System.out.println(numero + " es múltiplo de tres y de cinco.");
    } else {
      System.out.println(numero + " no es múltiplo de tres y de cinco.");
    }
  }
}
