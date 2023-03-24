/******************* *******************************
* Autor:Kevin Arnold Cortés Pacheco                *
* Fecha Creación: 23/03/23                         *
* Fecha Actualización: 23/03/23                    *
* Descripción:Programa que muestre los múltiplos de*
*                         un número desde 1 hasta M*
****************************************************/

package ejercicios;

import java.util.Scanner;

public class CuarentaySiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = scanner.nextInt();
        System.out.print("Ingresa el límite superior: ");
        int m = scanner.nextInt();
        System.out.print("Los múltiplos de " + n + " hasta " + m + " son: ");
        for(int i=1; i<=m; i++){
            if(i%n==0){
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }
}

