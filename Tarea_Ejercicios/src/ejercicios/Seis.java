/************************************************************************************************
* Autor:Kevin Arnold Cortés Pacheco                                                             *
* Fecha Creación: 23/03/23                                                                      *
* Fecha Actualización: 23/03/23                                                                 *
* Descripción:Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.   *                                              
*************************************************************************************************/



package ejercicios;


import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        double kmh, ms;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la velocidad en Km/h: ");
        kmh = sc.nextDouble();
        ms = kmh / 3.6; // conversión de Km/h a m/s
        System.out.println(kmh + " Km/h equivale a " + ms + " m/s");
    }
}


/*version interfaz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class seis extends JFrame implements ActionListener {
    private JLabel lblKmh, lblMs;
    private JTextField txtKmh, txtMs;
    private JButton btnConvertir;

    public seis() {
        setTitle("Conversión de velocidad Km/h a m/s");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblKmh = new JLabel("Velocidad en Km/h:");
        txtKmh = new JTextField(10);

        lblMs = new JLabel("Velocidad en m/s:");
        txtMs = new JTextField(10);
        txtMs.setEditable(false);

        btnConvertir = new JButton("Convertir");
        btnConvertir.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(lblKmh);
        panel.add(txtKmh);
        panel.add(lblMs);
        panel.add(txtMs);
        panel.add(btnConvertir);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String kmhStr = txtKmh.getText();
        double kmh = Double.parseDouble(kmhStr);
        double ms = kmh / 3.6;
        String msStr = String.format("%.2f", ms);
        txtMs.setText(msStr);
    }

    public static void main(String[] args) {
        new seis();
    }
}*/
