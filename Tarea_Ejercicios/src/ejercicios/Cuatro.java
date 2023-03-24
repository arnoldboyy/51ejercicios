/******************************************************************
* Autor:Kevin Arnold Cortés Pacheco                               *
* Fecha Creación: 23/03/23                                        *
* Fecha Actualización: 23/03/23                                   *
* Descripción: Programa que lea una cantidad de grados centígrados*
*  y la pase a grados Fahrenheit.La fórmula correspondiente es:   *
*                                             F = 32 + ( 9 * C/5) *                                                              *
*******************************************************************/


package ejercicios;
//modo consola
import java.util.Scanner;

public class Cuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la temperatura en grados centígrados: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = 32 + (9 * celsius / 5);
        
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
    }
}

/*
//Con Interfaz
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Cuatro extends JFrame implements ActionListener {
    private JLabel lblCelsius, lblFahrenheit;
    private JTextField txtCelsius, txtFahrenheit;
    private JButton btnConvertir;

    public Cuatro() {
        setTitle("Conversión de grados Celsius a Fahrenheit");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblCelsius = new JLabel("Grados Celsius:");
        txtCelsius = new JTextField(10);

        lblFahrenheit = new JLabel("Grados Fahrenheit:");
        txtFahrenheit = new JTextField(10);
        txtFahrenheit.setEditable(false);

        btnConvertir = new JButton("Convertir");
        btnConvertir.addActionListener(this);

        JPanel panel = new JPanel();
        panel.add(lblCelsius);
        panel.add(txtCelsius);
        panel.add(lblFahrenheit);
        panel.add(txtFahrenheit);
        panel.add(btnConvertir);

        add(panel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String celsiusStr = txtCelsius.getText();
        double celsius = Double.parseDouble(celsiusStr);
        double fahrenheit = 32 + (9 * celsius / 5);
        String fahrenheitStr = String.format("%.2f", fahrenheit);
        txtFahrenheit.setText(fahrenheitStr);
    }

    public static void main(String[] args) {
        new Cuatro();
    }
}*/
