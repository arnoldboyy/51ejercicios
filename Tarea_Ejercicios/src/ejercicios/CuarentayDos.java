/******************* *****************************************
* Autor:Kevin Arnold Cortés Pacheco                          *
* Fecha Creación: 23/03/23                                   *
* Fecha Actualización: 23/03/23                              *
* Descripción:  Programa Java que muestre los números del 100*
*                    al 1 utilizando la instrucción for      *
**************************************************************/

package ejercicios;

public class CuarentayDos {
	  public static void main(String[] args) {
	    for (int i = 100; i >= 1; i--) {
	      System.out.println(i);
	    }
	  }
	}

/*Versión interfaz
import javax.swing.*;

public class CuarentayDos {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Números del 100 al 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextArea textArea = new JTextArea(5, 20);
    JScrollPane scrollPane = new JScrollPane(textArea);
    frame.getContentPane().add(scrollPane);
    frame.pack();
    frame.setVisible(true);

    for (int i = 100; i >= 1; i--) {
      textArea.append(i + "\n");
    }
  }
}

*/