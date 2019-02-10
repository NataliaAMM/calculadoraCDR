/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadenaderesponsabilidad;

/**
 *
 * @author NATA
 */
public class calculadora {
    
    public void dirigir(int numeroa, int numerob, String operador) {
        operacion director []= new operacion[5];
        director[0] = new suma();
        director[1] = new resta();
        director[2] = new multiplicacion();
        director[3] = new division();
        director[4] = new imposible();
        
        for(int i=0; i<director.length-1; i++){
            director[i].setNext(director[i+1]);
        }
        
        director[0].operar(numeroa, numerob, operador);
    }
    
}
