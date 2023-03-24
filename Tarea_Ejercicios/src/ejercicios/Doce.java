/******************************************************
* Autor:Kevin Arnold Cortés Pacheco                   *
* Fecha Creación: 23/03/23                            *
* Fecha Actualización: 23/03/23                       *
* Descripción:Programa que lea un número entero N de 5*
*       cifras y muestre sus cifras desde el final*                                          
*******************************************************/
package ejercicios;

import java.util.Scanner;

public class Doce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de 5 cifras: ");
        int num = sc.nextInt();
        System.out.println("Las cifras de " + num + " desde el final son:");
        System.out.print(num%10 + " ");
        System.out.print((num%100)/10 + " ");
        System.out.print((num%1000)/100 + " ");
        System.out.print((num%10000)/1000 + " ");
        System.out.print(num/10000);
    }
}

/* versión con interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class doce extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public doce() {
        super("Mostrar cifras desde el final");
        label = new JLabel("Introduce un número entero de 5 cifras:");
        textField = new JTextField(10);
        button = new JButton("Mostrar cifras");
        button.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String numString = textField.getText();

        if (numString.length() != 5) {
            JOptionPane.showMessageDialog(this, "El número debe tener 5 cifras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        StringBuilder cifrasReversa = new StringBuilder();

        for (int i = numString.length() - 1; i >= 0; i--) {
            char cifra = numString.charAt(i);
            cifrasReversa.append(cifra).append("\n");
        }

        JOptionPane.showMessageDialog(this, "Cifras del número desde el final:\n" + cifrasReversa, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new doce();
    }
}
*/
