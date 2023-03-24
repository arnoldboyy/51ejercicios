/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción: Programa que lea dos números y comprueba si son iguales.                   *
******************************************************************************************/
package ejercicios;
import java.util.Scanner;

public class Veinte {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    
    if(numero1 == numero2) {
      System.out.println("Los números son iguales.");
    } else {
      System.out.println("Los números son diferentes.");
    }
  }
}

/*Versión Interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class veinte extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2;
    private JButton button;

    public veinte() {
        super("Comprobador de igualdad de números");
        label1 = new JLabel("Ingrese el primer número:");
        textField1 = new JTextField(10);
        label2 = new JLabel("Ingrese el segundo número:");
        textField2 = new JTextField(10);
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
        int num1 = Integer.parseInt(textField1.getText());
        int num2 = Integer.parseInt(textField2.getText());

        if (num1 == num2) {
            label3.setText("Los números " + num1 + " y " + num2 + " son iguales.");
        } else {
            label3.setText("Los números " + num1 + " y " + num2 + " son diferentes.");
        }
    }

    public static void main(String[] args) {
        new veinte();
    }
}

*/