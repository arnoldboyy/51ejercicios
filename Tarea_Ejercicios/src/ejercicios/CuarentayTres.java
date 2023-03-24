/******************* *****************************************
* Autor:Kevin Arnold Cortés Pacheco                            *
* Fecha Creación: 23/03/23                                     *
* Fecha Actualización: 23/03/23                                *
* Descripción:    Programa Java que muestre los números desde 1*
* hasta N utilizando las instrucciones for, while y do .. while*
***************************************************************/

package ejercicios;

import java.util.Scanner;

public class CuarentayTres {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Usando for
    System.out.print("Ingrese un número N: ");
    int n = scanner.nextInt();
    for (int i = 1; i <= n; i++) {
      System.out.print(i + " ");
    }
    System.out.println();

    // Usando while
    System.out.print("Ingrese un número N: ");
    n = scanner.nextInt();
    int i = 1;
    while (i <= n) {
      System.out.print(i + " ");
      i++;
    }
    System.out.println();

    // Usando do-while
    System.out.print("Ingrese un número N: ");
    n = scanner.nextInt();
    i = 1;
    do {
      System.out.print(i + " ");
      i++;
    } while (i <= n);
    System.out.println();
  }
}

