/******************* *********************************************
* Autor:Kevin Arnold Cortés Pacheco                              *
* Fecha Creación: 23/03/23                                       *
* Fecha Actualización: 23/03/23                                  *
* Descripción: Programa Java que muestre los números del 100 al 1*
*                                 utilizando la instrucción while*
******************************************************************/


package ejercicios;

public class Cuarenta {
	  public static void main(String[] args) {
	    int i = 100;
	    while (i >= 1) {
	      System.out.println(i);
	      i--;
	    }
	  }
	}

/* Versión con interfaz
import javax.swing.*;

public class Cuarenta {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Números del 100 al 1");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextArea textArea = new JTextArea(5, 20);
    JScrollPane scrollPane = new JScrollPane(textArea);
    frame.getContentPane().add(scrollPane);
    frame.pack();
    frame.setVisible(true);

    int i = 100;
    while (i >= 1) {
      textArea.append(i + "\n");
      i--;
    }
  }
}

*/