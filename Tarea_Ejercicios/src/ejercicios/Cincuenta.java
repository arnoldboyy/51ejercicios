/******************* *************************************
* Autor:Kevin Arnold Cortés Pacheco                      *
* Fecha Creación: 23/03/23                               *
* Fecha Actualización: 23/03/23                          *
* Descripción:Contar los números introducidos por teclado*
**********************************************************/

package ejercicios;

import java.util.Scanner;

public class Cincuenta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contador = 0;
        while (input.hasNextInt()) {
            input.nextInt();
            contador++;
        }
        System.out.println("Se han introducido " + contador + " números.");
    }
}

/*Version Interfaz
import javax.swing.JOptionPane;

public class Cincuenta {
    public static void main(String[] args) {
        int contador = 0;
        String input = JOptionPane.showInputDialog("Introduce un número entero (introduce 'fin' para terminar)");
        while (!input.equalsIgnoreCase("fin")) {
            try {
                Integer.parseInt(input);
                contador++;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El valor introducido no es un número entero.");
            }
            input = JOptionPane.showInputDialog("Introduce un número entero (introduce 'fin' para terminar)");
        }
        JOptionPane.showMessageDialog(null, "Se han introducido " + contador + " números.");
    }
}


*/
