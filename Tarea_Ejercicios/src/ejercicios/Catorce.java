/**********************************************
* Autor:Kevin Arnold Cortés Pacheco           *
* Fecha Creación: 23/03/23                    *
* Fecha Actualización: 23/03/23               *
* Descripción:Programa para calcular el precio*
*                final de venta de un producto*                                    *                                   
***********************************************/

package ejercicios;

import java.util.Scanner;

public class Catorce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = sc.nextDouble();

        double precioFinal = precioBase * (1 - descuento/100);

        System.out.println("El precio final de venta es: " + precioFinal);
    }
}

/*version interfaz
 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class catorce extends JFrame implements ActionListener {
    private JLabel label1, label2, label3;
    private JTextField textField1, textField2, textField3;
    private JButton button;

    public catorce() {
        super("Calcular precio final de venta");
        label1 = new JLabel("Precio de compra:");
        label2 = new JLabel("Porcentaje de ganancia (%):");
        label3 = new JLabel("Precio final de venta:");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        textField3 = new JTextField(10);
        textField3.setEditable(false);
        button = new JButton("Calcular");
        button.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(3, 2));
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(label3);
        panel.add(textField3);
        panel.add(button);

        getContentPane().add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double precioCompra = Double.parseDouble(textField1.getText());
        double porcentajeGanancia = Double.parseDouble(textField2.getText());
        double precioFinal = precioCompra * (1 + porcentajeGanancia / 100);
        textField3.setText(String.format("%.2f", precioFinal));
    }

    public static void main(String[] args) {
        new catorce();
    }
}*/

