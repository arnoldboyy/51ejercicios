/*********************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                              *
* Fecha Creación: 23/03/23                                                       *
* Fecha Actualización: 23/03/23                                                  *
* Descripción: Programa para pasar una calificación numérica a alfabética.       *
**********************************************************************************/
package ejercicios;
import java.util.Scanner;

public class TreintaySeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la calificación numérica (entre 0 y 10): ");
        int calificacionNumerica = sc.nextInt();

        if (calificacionNumerica >= 0 && calificacionNumerica <= 10) {
            switch (calificacionNumerica) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("Calificación alfabética: Insuficiente");
                    break;
                case 5:
                    System.out.println("Calificación alfabética: Suficiente");
                    break;
                case 6:
                    System.out.println("Calificación alfabética: Bien");
                    break;
                case 7:
                case 8:
                    System.out.println("Calificación alfabética: Notable");
                    break;
                case 9:
                case 10:
                    System.out.println("Calificación alfabética: Sobresaliente");
                    break;
            }
        } else {
            System.out.println("La calificación debe estar entre 0 y 10.");
        }
    }
}

/*
import javax.swing.*;

public class TreintaySeis extends JFrame {
    private JLabel label1, label2;
    private JTextField textField1, textField2;
    private JButton button;

    public TreintaySeis() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Calificación Numérica a Alfabética");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);

        label1 = new JLabel("Calificación Numérica:");
        label1.setBounds(10, 20, 150, 20);
        add(label1);

        textField1 = new JTextField();
        textField1.setBounds(170, 20, 100, 20);
        add(textField1);

        label2 = new JLabel("Calificación Alfabética:");
        label2.setBounds(10, 50, 150, 20);
        add(label2);

        textField2 = new JTextField();
        textField2.setEditable(false);
        textField2.setBounds(170, 50, 100, 20);
        add(textField2);

        button = new JButton("Convertir");
        button.setBounds(85, 100, 120, 30);
        button.addActionListener(e -> convertirCalificacion());
        add(button);

        setVisible(true);
    }

    private void convertirCalificacion() {
        String calificacionNum = textField1.getText();
        int calificacion = Integer.parseInt(calificacionNum);

        String calificacionLetra;

        if (calificacion >= 90 && calificacion <= 100) {
            calificacionLetra = "A";
        } else if (calificacion >= 80 && calificacion < 90) {
            calificacionLetra = "B";
        } else if (calificacion >= 70 && calificacion < 80) {
            calificacionLetra = "C";
        } else if (calificacion >= 60 && calificacion < 70) {
            calificacionLetra = "D";
        } else {
            calificacionLetra = "F";
        }

        textField2.setText(calificacionLetra);
    }

    public static void main(String[] args) {
        new TreintaySeis();
    }
}
*/


