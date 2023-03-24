/**********************************************************
* Autor:Kevin Arnold Cortés Pacheco                       *
* Fecha Creación: 23/03/23                                *
* Fecha Actualización: 23/03/23                           *
* Descripción:Programa que calcula el área de un triángulo*
*                    a partir de la longitud de sus lados.*                                              
***********************************************************/



package ejercicios;

import java.util.Scanner;

public class Nueve {
    public static void main(String[] args) {
        double lado1, lado2, lado3, semiperimetro, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la longitud del primer lado: ");
        lado1 = sc.nextDouble();
        System.out.print("Ingrese la longitud del segundo lado: ");
        lado2 = sc.nextDouble();
        System.out.print("Ingrese la longitud del tercer lado: ");
        lado3 = sc.nextDouble();
        semiperimetro = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("El área del triángulo es: " + area);
    }
}