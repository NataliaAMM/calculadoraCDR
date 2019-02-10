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
public class resta implements operacion {

    private operacion next;
    
    @Override
    public void setNext(operacion opsig) {
        next = opsig;
    }

    @Override
    public operacion getNext() {
        return next;
    }

    @Override
    public void operar(int numeroa, int numerob, String operador) {
        if(operador.equals("-")){
            int resultado = numeroa-numerob;
            System.out.println("El resultado de la resta es "+resultado);
        }else{
            next.operar(numeroa, numerob, operador);
        }
    }
    
}
