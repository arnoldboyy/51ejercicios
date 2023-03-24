/******************* *********************************************
* Autor:Kevin Arnold Cortés Pacheco                              *
* Fecha Creación: 23/03/23                                       *
* Fecha Actualización: 23/03/23                                  *
* Descripción: Programa Java que muestre los números del 1 al 100*
*                              utilizando la instrucción do while*
******************************************************************/


package ejercicios;


public class TreintayOcho {
	  public static void main(String[] args) {
	    int i = 1;
	    do {
	      System.out.println(i);
	      i++;
	    } while (i <= 100);
	  }
	}





/* Version con interfaz
 import javax.swing.*;

public class TreintayOcho{
  public static void main(String[] args) {
    JFrame frame = new JFrame("Números del 1 al 100");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JTextArea textArea = new JTextArea(5, 20);
    JScrollPane scrollPane = new JScrollPane(textArea);
    frame.getContentPane().add(scrollPane);
    frame.pack();
    frame.setVisible(true);

    int i = 1;
    do {
      textArea.append(i + "\n");
      i++;
    } while (i <= 100);
  }
}*/

