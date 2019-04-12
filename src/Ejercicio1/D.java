    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author AUTONOMA
 */
public class D extends C{
    public void dividir(){
        float a=0,b=0,res=0;
        String msj="";
        a= Float.parseFloat(JOptionPane.showInputDialog("Inserte Primer Numero"));
        b= Float.parseFloat(JOptionPane.showInputDialog("Inserte Segundo Numero"));
        if(b==0){
            JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
        }else{
            res=a/b;
            msj+="Respuesta: " + res;
            JOptionPane.showMessageDialog(null, msj);
        }
            
    }
}
