/******************************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                                       *
* Fecha Creación: 23/03/23                                                                *
* Fecha Actualización: 23/03/23                                                           *
* Descripción:Programa Java que lea un número entero y calcule si es positivo o negativo. *
******************************************************************************************/


package ejercicios;
import java.util.Scanner;
public class DiesiOcho {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.print("Ingrese un número entero: ");
	    int numero = scanner.nextInt();
	    
	    if(numero > 0) {
	      System.out.println(numero + " es un número positivo.");
	    } else if(numero < 0) {
	      System.out.println(numero + " es un número negativo.");
	    } else {
	      System.out.println(numero + " es cero.");
	    }
	  }
	}

/*versión interfaz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class diesiocho extends JFrame implements ActionListener {
    private JLabel label1, label2;
    private JTextField textField;
    private JButton button;

    public diesiocho() {
        super("Verificador de número positivo/negativo");
        label1 = new JLabel("Ingrese un número entero:");
        label2 = new JLabel("");
        textField = new JTextField(10);
        button = new JButton("Verificar");
        button.addActionListener(this);

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
        if (num > 0) {
            label2.setText("El número " + num + " es positivo.");
        } else if (num < 0) {
            label2.setText("El número " + num + " es negativo.");
        } else {
            label2.setText("El número " + num + " es cero.");
        }
    }

    public static void main(String[] args) {
        new diesiocho();
    }
}*/
