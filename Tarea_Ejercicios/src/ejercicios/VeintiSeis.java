/**************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                   *
* Fecha Creación: 23/03/23                                                            *
* Fecha Actualización: 23/03/23                                                       *
* Descripción: Programa que lea dos caracteres por teclado y compruebe si son iguales.*
***************************************************************************************/

package ejercicios;

import java.util.Scanner;

public class VeintiSeis {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer carácter: ");
    char caracter1 = scanner.next().charAt(0);
    System.out.print("Ingrese el segundo carácter: ");
    char caracter2 = scanner.next().charAt(0);
    
    if(caracter1 == caracter2) {
      System.out.println("Los caracteres son iguales.");
    } else {
      System.out.println("Los caracteres son diferentes.");
    }
  }
}
/*version interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class veintiseis JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2;
    private JButton button;

    public veintiseis() {
        super("Comprobar si dos caracteres son iguales");
        label1 = new JLabel("Ingrese el primer caracter:");
        textField1 = new JTextField(1);
        label2 = new JLabel("Ingrese el segundo caracter:");
        textField2 = new JTextField(1);
        button = new JButton("Comprobar");
        button.addActionListener(this);
        label3 = new JLabel("");

        JPanel panel = new JPanel(new GridLayout(4, 1));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(button);
        panel.add(label3);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        char char1 = textField1.getText().charAt(0);
        char char2 = textField2.getText().charAt(0);

        if (char1 == char2) {
            label3.setText("Los caracteres ingresados son iguales.");
        } else {
            label3.setText("Los caracteres ingresados son diferentes.");
        }
    }

    public static void main(String[] args) {
        new veintiseis();
    }
}

*/