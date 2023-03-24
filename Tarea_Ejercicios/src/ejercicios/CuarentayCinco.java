/******************* *****************************************
* Autor:Kevin Arnold Cortés Pacheco                          *
* Fecha Creación: 23/03/23                                   *
* Fecha Actualización: 23/03/23                              *
* Descripción:Programa Java que lea dos números y muestre los*
*                       números desde el menor hasta el mayor*
**************************************************************/

package ejercicios;


import java.util.Scanner;

public class CuarentayCinco {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lectura de los números
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();

    // Encontrar el número menor y el número mayor
    int menor = Math.min(numero1, numero2);
    int mayor = Math.max(numero1, numero2);

    // Mostrar los números desde el menor hasta el mayor
    for (int i = menor; i <= mayor; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}

