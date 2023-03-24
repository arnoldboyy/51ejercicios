/*********************************************
* Autor:Kevin Arnold Cortés pacheco          *
* Fecha Creación: 23/03/23                   *
* Fecha Actualización: 23/03/23              *
* Descripción: Programa que lea un carácter y*
*                   compruebe si es un número* 
*                  (Carácter entre '0' y '9')*
**********************************************/


package ejercicios;

import java.util.Scanner;

public class VeintiOcho {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un carácter: ");
    char caracter = scanner.next().charAt(0);
    
    if(caracter >= '0' && caracter <= '9') {
      System.out.println(caracter + " es un número.");
    } else {
      System.out.println(caracter + " no es un número.");
    }
  }
}

/*version interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class veintiocho extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField textField;
    private JButton button;

    public veintiocho() {
        super("Comprobar si un carácter es un número");
        label1 = new JLabel("Ingrese un carácter:");
        textField = new JTextField(1);
        button = new JButton("Comprobar");
        button.addActionListener(this);
        label2 = new JLabel("");

        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(label1);
        panel.add(textField);
        panel.add(button);
        panel.add(label2);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        char inputChar = textField.getText().charAt(0);

        if (inputChar >= '0' && inputChar <= '9') {
            label2.setText("El carácter ingresado es un número.");
        } else {
            label2.setText("El carácter ingresado no es un número.");
        }
    }

    public static void main(String[] args) {
        new veintiocho();
    }
}

 */

