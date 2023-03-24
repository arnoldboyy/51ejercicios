/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción: Programa para pasar de grados centígrados a grados Kelvin y grados Reamur. *
******************************************************************************************/

package ejercicios;

import java.util.Scanner;

public class DieciSeis {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la temperatura en grados Celsius: ");
    double celsius = scanner.nextDouble();
    
    double kelvin = celsius + 273.15;
    double reamur = (celsius * 4) / 5;
    
    System.out.println("La temperatura en grados Kelvin es: " + kelvin);
    System.out.println("La temperatura en grados Reamur es: " + reamur);
  }
}

/*version interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class dieciseis extends JFrame implements ActionListener {
    private JLabel label1, label2, label3, label4;
    private JTextField textField1, textField2, textField3;
    private JButton button;

    public dieciseis() {
        super("Conversor de temperatura");
        label1 = new JLabel("Grados centígrados:");
        label2 = new JLabel("Grados Kelvin:");
        label3 = new JLabel("Grados Reamur:");
        label4 = new JLabel("(1 °C = 273.15 K = 0.8 °Re)");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        textField2.setEditable(false);
        textField3.setEditable(false);
        button = new JButton("Convertir");
        button.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(label4);
        panel.add(button);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double gradosC = Double.parseDouble(textField1.getText());
        double gradosK = gradosC + 273.15;
        double gradosRe = gradosC * 0.8;
        textField2.setText(String.format("%.2f", gradosK));
        textField3.setText(String.format("%.2f", gradosRe));
    }

    public static void main(String[] args) {
        new dieciseis();
    }
}*/

