/****************************************************************
* Autor:Kevin Arnold Cortés pacheco                             *
* Fecha Creación: 23/03/23                                      *
* Fecha Actualización: 23/03/23                                 *
* Descripción:Calcular el mayor de tres números enteros en Java.*
*****************************************************************/

package ejercicios;

import java.util.Scanner;

public class TreintayTres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        int num3 = input.nextInt();
        
        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }
        
        System.out.println("El mayor de los tres numeros es: " + mayor);
        
        input.close();
    }
}
