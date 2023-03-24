/******************* **************************************
* Autor:Kevin Arnold Cortés Pacheco                       *
* Fecha Creación: 23/03/23                                *
* Fecha Actualización: 23/03/23                           *
* Descripción: Programa Java que lea dos números y muestre*
*                            los números pares entre ellos*
***********************************************************/

package ejercicios;

import java.util.Scanner;

public class CuarentaySeis {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lectura de los números
    System.out.print("Ingrese el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Ingrese el segundo número: ");
    int numero2 = scanner.nextInt();

    // Encontrar el número menor y el número mayor
    int menor = Math.min(numero1, numero2);
    int mayor = Math.max(numero1, numero2);

    // Mostrar los números pares entre el menor y el mayor
    for (int i = menor; i <= mayor; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}

/*Versión Interfaz
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CuarentaySeisI extends JFrame implements ActionListener {
  private JLabel label1, label2, resultadoLabel;
  private JTextField textField1, textField2, resultadoTextField;
  private JButton button;
  
  public CuarentaySeis() {
    setTitle("Numeros Pares Entre Dos Numeros");
    setSize(400, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(new GridLayout(4, 2));

    label1 = new JLabel("Primer número: ");
    add(label1);
    textField1 = new JTextField();
    add(textField1);

    label2 = new JLabel("Segundo número: ");
    add(label2);
    textField2 = new JTextField();
    add(textField2);

    resultadoLabel = new JLabel("Números pares: ");
    add(resultadoLabel);
    resultadoTextField = new JTextField();
    resultadoTextField.setEditable(false);
    add(resultadoTextField);

    button = new JButton("Mostrar números pares");
    button.addActionListener(this);
    add(button);
  }

  public void actionPerformed(ActionEvent e) {
    int numero1 = Integer.parseInt(textField1.getText());
    int numero2 = Integer.parseInt(textField2.getText());
    int menor = Math.min(numero1, numero2);
    int mayor = Math.max(numero1, numero2);
    String resultado = "";

    for (int i = menor; i <= mayor; i++) {
      if (i % 2 == 0) {
        resultado += i + " ";
      }
    }

    resultadoTextField.setText(resultado);
  }

  public static void main(String[] args) {
    CuarentaySeis ventana = new CuarentaySeis();
    ventana.setVisible(true);
  }
}

*/