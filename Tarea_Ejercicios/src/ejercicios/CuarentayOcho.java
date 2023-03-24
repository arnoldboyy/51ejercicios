/******************* *******************************
* Autor:Kevin Arnold Cortés Pacheco                *
* Fecha Creación: 23/03/23                         *
* Fecha Actualización: 23/03/23                    *
* Descripción:Programa que lea números e indique si*
*      son positivos o negativos y pares o impares.*
****************************************************/
package ejercicios;

import java.util.Scanner;

public class CuarentayOcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingresa un número : ");
            num = scanner.nextInt();
            if (num != -1) {
                if (num > 0) {
                    System.out.print("El número " + num + " es positivo y ");
                } else {
                    System.out.print("El número " + num + " es negativo y ");
                }
                if (num % 2 == 0) {
                    System.out.println("par.");
                } else {
                    System.out.println("impar.");
                }
            }
        } while (num != -1);
        scanner.close();
    }
}

/* Version Interfaz
import javax.swing.*;

public class CuarentayOCho {
    public static void main(String[] args) {
        String input;
        int num;
        do {
            input = JOptionPane.showInputDialog(null, "Ingresa un número :");
            num = Integer.parseInt(input);
            if (num != -1) {
                String message = "El número " + num + " es ";
                if (num > 0) {
                    message += "positivo y ";
                } else {
                    message += "negativo y ";
                }
                if (num % 2 == 0) {
                    message += "par.";
                } else {
                    message += "impar.";
                }
                JOptionPane.showMessageDialog(null, message);
            }
        } while (num != -1);
    }
}

*/