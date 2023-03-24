/*****************************************************************
* Autor:Kevin Arnold Cortés Pacheco                              *
* Fecha Creación: 23/03/23                                       *
* Fecha Actualización: 23/03/23                                  *
* Descripción: Programa Java que lea un nombre y muestre por     *
*                 pantalla: “Buenos dias nombre_introducido”.    *
*                                                                *
******************************************************************/

package ejercicios;
import java.util.Scanner;

public class Dos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Buenos días " + nombre + "!");
    }
}




/*import javax.swing.JOptionPane;

public class dos {

    public static void main(String[] args) {
        // Pedir al usuario que introduzca su nombre
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");

        // Crear un mensaje con el saludo
        String mensaje = "Buenos días, " + nombre + "!";

        // Mostrar el mensaje en una ventana de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Saludo", JOptionPane.INFORMATION_MESSAGE);
    }
}*/

