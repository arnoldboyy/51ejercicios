/****************************************************************
* Autor:Kevin Arnold Cortés pacheco                             *
* Fecha Creación: 23/03/23                                      *
* Fecha Actualización: 23/03/23                                 *
* Descripción:Programa que lea dos números por teclado y muestre*
*          el resultado de la división del mayor entre el menor.* 
*            Se debe comprobar que el divisor no puede ser cero.*
*****************************************************************/

package ejercicios;

import java.util.Scanner;

public class TreintayDos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        
        int mayor = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        
        if (menor == 0) {
            System.out.println("El divisor no puede ser cero.");
        } else {
            double resultado = (double) mayor / menor;
            System.out.println("El resultado de la division es: " + resultado);
        }
        
        input.close();
    }
}

/*versión interfaz
 import javax.swing.*;

public class treintaydos {
   public static void main(String[] args) {
      // Crear ventana y paneles
      JFrame ventana = new JFrame("División del mayor entre el menor");
      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();

      // Crear etiquetas, campos de texto y botón
      JLabel etiqueta1 = new JLabel("Primer número:");
      JLabel etiqueta2 = new JLabel("Segundo número:");
      JTextField campo1 = new JTextField(10);
      JTextField campo2 = new JTextField(10);
      JButton boton = new JButton("Calcular");

      // Añadir elementos a los paneles
      panel1.add(etiqueta1);
      panel1.add(campo1);
      panel1.add(etiqueta2);
      panel1.add(campo2);
      panel2.add(boton);

      // Añadir paneles a la ventana y mostrarla
      ventana.getContentPane().add(panel1);
      ventana.getContentPane().add(panel2, "South");
      ventana.pack();
      ventana.setVisible(true);

      // Acción del botón al hacer clic
      boton.addActionListener(e -> {
         int num1 = Integer.parseInt(campo1.getText());
         int num2 = Integer.parseInt(campo2.getText());

         if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
         } else {
            int mayor = num1 > num2 ? num1 : num2;
            int menor = num1 < num2 ? num1 : num2;
            double resultado = (double) mayor / menor;
            JOptionPane.showMessageDialog(null, "El resultado de dividir el mayor entre el menor es: " + resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
         }
      });
   }
}

*/