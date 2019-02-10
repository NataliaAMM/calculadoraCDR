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
public interface operacion {
    
    public void setNext(operacion opsig);
    public operacion getNext();
    public void operar(int numeroa, int numerob, String operador);
}
