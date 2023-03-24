/*********************************************************
* Autor:Kevin Arnold Cortés Pacheco                      *
* Fecha Creación: 23/03/23                               *
* Fecha Actualización: 23/03/23                          *
* Descripción: Programa que lee un número de 3 cifras y  *
*                        muestra sus cifras por separado.*                                            
**********************************************************/



package ejercicios;


import java.util.Scanner;

public class Diez {
    public static void main(String[] args) {
        int numero, cifra1, cifra2, cifra3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número de 3 cifras: ");
        numero = sc.nextInt();
        cifra1 = numero / 100;
        cifra2 = (numero / 10) % 10;
        cifra3 = numero % 10;
        System.out.println("Las cifras del número son: " + cifra1 + ", " + cifra2 + ", " + cifra3);
    }
}

/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class diez extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton button;

    public diez() {
        super("Separar cifras de un número");
        label = new JLabel("Introduce un número de 3 cifras:");
        textField = new JTextField(10);
        button = new JButton("Separar cifras");
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

        if (numString.length() != 3) {
            JOptionPane.showMessageDialog(this, "El número debe tener 3 cifras", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int num = Integer.parseInt(numString);
        int digito1 = num / 100;
        int digito2 = (num % 100) / 10;
        int digito3 = num % 10;

        JOptionPane.showMessageDialog(this, "Cifras del número:\n" + digito1 + "\n" + digito2 + "\n" + digito3, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        new diez();
    }
}*/
