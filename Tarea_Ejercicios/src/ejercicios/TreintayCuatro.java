package ejercicios;
/*****************************************************************
* Autor:Kevin Arnold Cortés pacheco                              *
* Fecha Creación: 23/03/23                                       *
* Fecha Actualización: 23/03/23                                  *
* Descripción:Programa que lea tres números enteros H, M, S que  *  
* contienen hora, minutos y segundos respectivamente, y comprueba*
*                       si la hora que indican es una hora válida*
******************************************************************/

import java.util.Scanner;

public class TreintayCuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la hora: ");
        int hora = scanner.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = scanner.nextInt();
        
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
            System.out.println("La hora introducida es válida.");
        } else {
            System.out.println("La hora introducida no es válida.");
        }
    }
}






/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class treintaycuatro extends JFrame implements ActionListener {
    private JTextField horaTextField, minTextField, segTextField;
    private JLabel resultadoLabel;

    public treintaycuatro() {
        // Configurar ventana
        setTitle("Comprobar hora válida");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Crear panel principal
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Añadir componentes al panel
        panel.add(new JLabel("Hora: "));
        horaTextField = new JTextField(5);
        panel.add(horaTextField);

        panel.add(new JLabel("Minutos: "));
        minTextField = new JTextField(5);
        panel.add(minTextField);

        panel.add(new JLabel("Segundos: "));
        segTextField = new JTextField(5);
        panel.add(segTextField);

        JButton comprobarButton = new JButton("Comprobar");
        comprobarButton.addActionListener(this);
        panel.add(comprobarButton);

        resultadoLabel = new JLabel("");
        panel.add(resultadoLabel);

        // Añadir panel a la ventana
        add(panel);

        // Mostrar ventana
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Obtener valores de los campos de texto
        int hora = Integer.parseInt(horaTextField.getText());
        int min = Integer.parseInt(minTextField.getText());
        int seg = Integer.parseInt(segTextField.getText());

        // Comprobar si la hora es válida
        if (hora >= 0 && hora <= 23 && min >= 0 && min <= 59 && seg >= 0 && seg <= 59) {
            resultadoLabel.setText("La hora es válida");
        } else {
            resultadoLabel.setText("La hora no es válida");
        }
    }

    public static void main(String[] args) {
        HoraValida ventana = new treintaycuatro();
    }
}

*/
