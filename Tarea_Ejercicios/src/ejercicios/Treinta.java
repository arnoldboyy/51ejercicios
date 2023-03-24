/********************************************
* Autor:Kevin Arnold Cortés pacheco         *
* Fecha Creación: 23/03/23                  *
* Fecha Actualización: 23/03/23             *
* Descripción: . Programa para comprobar si *
*       un número de tres cifras es capicúa.*    
*********************************************/

package ejercicios;

import java.util.Scanner;

public class Treinta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número de tres cifras: ");
    int numero = scanner.nextInt();
    
    int cifra1 = numero / 100;
    int cifra2 = (numero / 10) % 10;
    int cifra3 = numero % 10;
    
    if(cifra1 == cifra3) {
      System.out.println(numero + " es un número capicúa.");
    } else {
      System.out.println(numero + " no es un número capicúa.");
    }
  }
}

/*
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class treinta extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField textField;
    private JButton button;

    public treinta() {
        super("Comprobar si un número de tres cifras es capicúa");
        label1 = new JLabel("Ingrese un número de tres cifras:");
        textField = new JTextField(3);
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
        String inputString = textField.getText();
        int inputInt = Integer.parseInt(inputString);

        if (inputInt >= 100 && inputInt <= 999) {
            int firstDigit = inputInt / 100;
            int lastDigit = inputInt % 10;

            if (firstDigit == lastDigit) {
                label2.setText("El número ingresado es capicúa.");
            } else {
                label2.setText("El número ingresado no es capicúa.");
            }
        } else {
            label2.setText("El número ingresado no tiene tres cifras.");
        }
    }

    public static void main(String[] args) {
        new treinta();
    }
}

 */
