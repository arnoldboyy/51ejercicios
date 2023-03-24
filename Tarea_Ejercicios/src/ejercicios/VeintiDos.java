/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción: Comprobar si dos números enteros terminan con la misma cifra               *
******************************************************************************************/

package ejercicios;
import java.util.Scanner;

public class VeintiDos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();
    
    int cifra1 = numero1 % 10;
    int cifra2 = numero2 % 10;
    
    if(cifra1 == cifra2) {
      System.out.println("Los números terminan con la misma cifra.");
    } else {
      System.out.println("Los números no terminan con la misma cifra.");
    }
  }
}

/*versión interfaz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class veintidos extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2;
    private JButton button;

    public veintidos() {
        super("Comprobar terminación de números enteros");
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

        int ultimaCifra1 = num1 % 10;
        int ultimaCifra2 = num2 % 10;

        if (ultimaCifra1 == ultimaCifra2) {
            label3.setText("Los números " + num1 + " y " + num2 + " terminan con la misma cifra.");
        } else {
            label3.setText("Los números " + num1 + " y " + num2 + " no terminan con la misma cifra.");
        }
    }

    public static void main(String[] args) {
        new veintidos();
    }
}

*/