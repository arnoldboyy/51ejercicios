/*****************************************************************
* Autor:Kevin Arnold Cortés Pacheco                              *
* Fecha Creación: 23/03/23                                       *
* Fecha Actualización: 23/03/23                                  *
* Descripción: Programa Java que lee un número entero por teclado*
*  y obtiene y muestra por pantalla el doble y el triple de ese  *
*                                                          número*                                                               *
******************************************************************/

package ejercicios;
import java.util.Scanner;
public class Tres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        
        int doble = num * 2;
        int triple = num * 3;
        
        System.out.println("El doble de " + num + " es: " + doble);
        System.out.println("El triple de " + num + " es: " + triple);
    }
}
