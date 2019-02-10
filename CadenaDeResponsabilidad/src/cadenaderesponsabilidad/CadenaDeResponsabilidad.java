/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadenaderesponsabilidad;

import java.util.Scanner;

/**
 *
 * @author NATA
 */
public class CadenaDeResponsabilidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculadora calc = new calculadora();
        
        System.out.println("Ingrese el primer numero a operar");
        int numeroa = sc.nextInt();
        System.out.println("Ingrese el segundo numero a operar");
        int numerob = sc.nextInt();
        System.out.println("Ingrese el simbolo de la operacion que desea realizar");
        String operando = sc.next();
        
        calc.dirigir(numeroa, numerob, operando);
    }
    
}
