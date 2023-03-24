/******************* *****************************************
* Autor:Kevin Arnold Cortés Pacheco                            *
* Fecha Creación: 23/03/23                                     *
* Fecha Actualización: 23/03/23                                *
* Descripción:    Programa Java que muestre los números desde N*
* hasta 1 utilizando las instrucciones for, while y do .. while*
***************************************************************/

package ejercicios;

import java.util.Scanner;

public class CuarentayCuatro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Usando for
    System.out.print("Ingrese un número N: ");
    int n = scanner.nextInt();
    for (int i = n; i >= 1; i--) {
      System.out.print(i + " ");
    }
    System.out.println();

    // Usando while
    System.out.print("Ingrese un número N: ");
    n = scanner.nextInt();
    int i = n;
    while (i >= 1) {
      System.out.print(i + " ");
      i--;
    }
    System.out.println();

    // Usando do-while
    System.out.print("Ingrese un número N: ");
    n = scanner.nextInt();
    i = n;
    do {
      System.out.print(i + " ");
      i--;
    } while (i >= 1);
    System.out.println();
  }
}

/*Versión Interfaz
 import javax.swing.JOptionPane;

public class CuarentayCuatro {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Ingrese un número N:");
    int n = Integer.parseInt(input);

    // Usando for
    String outputFor = "Usando for: ";
    for (int i = n; i >= 1; i--) {
      outputFor += i + " ";
    }
    JOptionPane.showMessageDialog(null, outputFor);

    // Usando while
    String outputWhile = "Usando while: ";
    int i = n;
    while (i >= 1) {
      outputWhile += i + " ";
      i--;
    }
    JOptionPane.showMessageDialog(null, outputWhile);

    // Usando do-while
    String outputDoWhile = "Usando do-while: ";
    i = n;
    do {
      outputDoWhile += i + " ";
      i--;
    } while (i >= 1);
    JOptionPane.showMessageDialog(null, outputDoWhile);
  }
}

 */
