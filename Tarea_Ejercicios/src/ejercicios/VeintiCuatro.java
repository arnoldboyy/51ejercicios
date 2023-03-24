/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción:Comprobar si un número es múltiplo de dos o de tres*
******************************************************************************************/

package ejercicios;

import java.util.Scanner;

public class VeintiCuatro {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();
    
    if(numero % 2 == 0) {
      System.out.println(numero + " es múltiplo de dos.");
    } 
    
    if(numero % 3 == 0) {
      System.out.println(numero + " es múltiplo de tres.");
    }
    
    if(numero % 2 != 0 && numero % 3 != 0) {
      System.out.println(numero + " no es múltiplo de dos ni de tres.");
    }
  }
}
/*version interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class veinticuatro extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField textField;
    private JButton button;

    public veinticuatro() {
        super("Comprobar si un número es múltiplo de dos o de tres");
        label1 = new JLabel("Ingrese un número entero:");
        textField = new JTextField(10);
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
        int num = Integer.parseInt(textField.getText());

        if (num % 2 == 0) {
            label2.setText("El número " + num + " es múltiplo de dos.");
        } else if (num % 3 == 0) {
            label2.setText("El número " + num + " es múltiplo de tres.");
        } else {
            label2.setText("El número " + num + " no es múltiplo de dos ni de tres.");
        }
    }

    public static void main(String[] args) {
        new veinticuatro();
    }
}

*/