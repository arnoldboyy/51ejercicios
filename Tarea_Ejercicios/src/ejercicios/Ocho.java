/********************************************************************************
* Autor:Kevin Arnold Cortés Pacheco                                             *
* Fecha Creación: 23/03/23                                                      *
* Fecha Actualización: 23/03/23                                                 *
* Descripción:Programa que calcula el volumen de una esfera.                    *                                              
*********************************************************************************/





package ejercicios;

import java.util.Scanner;

public class Ocho {
    public static void main(String[] args) {
        double radio, volumen;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio de la esfera: ");
        radio = sc.nextDouble();
        volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}

/*
//version con interfaz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ocho extends JFrame implements ActionListener {
    private JLabel lblRadio, lblResultado;
    private JTextField txtRadio, txtResultado;
    private JButton btnCalcular;

    public ocho() {
        setTitle("Cálculo del volumen de una esfera");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblRadio = new JLabel("Radio de la esfera:");
        txtRadio = new JTextField(10);

        lblResultado = new JLabel("Volumen de la esfera:");
        txtResultado = new JTextField(10);
        txtResultado.setEditable(false);

        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(lblRadio);
        panel.add(txtRadio);
        panel.add(lblResultado);
        panel.add(txtResultado);
        panel.add(btnCalcular);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String radioStr = txtRadio.getText();
        double radio = Double.parseDouble(radioStr);
        double volumen = 4/3.0 * Math.PI * Math.pow(radio, 3);
        String volumenStr = String.format("%.2f", volumen);
        txtResultado.setText(volumenStr);
    }

    public static void main(String[] args) {
        new ocho();
    }
}*/
