/*********************************************************************************
* Autor:Kevin Arnold Cortés pacheco                                              *
* Fecha Creación: 23/03/23                                                       *
* Fecha Actualización: 23/03/23                                                  *
* Descripción: Programa que lea una variable entera mes y compruebe si el valor  *
* corresponde a un mes de 30, 31 o 28 días. Se mostrará además el nombre del mes.*
* Se debe comprobar que el valor introducido esté comprendido entre 1 y 12.      *
**********************************************************************************/

package ejercicios;

import java.util.Scanner;

public class TreintayCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;
        do {
            System.out.print("Introduzca un mes (1-12): ");
            mes = sc.nextInt();
        } while (mes < 1 || mes > 12);

        String nombreMes = "";
        int numDias = 0;
        switch (mes) {
            case 2:
                nombreMes = "Febrero";
                numDias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                nombreMes = "Abril, Junio, Septiembre o Noviembre";
                numDias = 30;
                break;
            default:
                nombreMes = "Enero, Marzo, Mayo, Julio, Agosto, Octubre o Diciembre";
                numDias = 31;
                break;
        }

        System.out.println(nombreMes + " tiene " + numDias + " días.");
    }
}

