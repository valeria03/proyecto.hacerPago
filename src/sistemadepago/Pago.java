/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sistemadepago;

/**
 *
 * @author SONY
 */
public class Pago {
    
public float hacerPago(Usuario u){
float  Pago = u.getHora()* u.getSueldo();
return Pago;


}
    
}
