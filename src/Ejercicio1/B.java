
package Ejercicio1;

import javax.swing.JOptionPane;

public class B extends A{
    public void restar(){
        float a=0,b=0,res=0;
        String msj="";
        a= Float.parseFloat(JOptionPane.showInputDialog("Inserte Primer Numero"));
        b= Float.parseFloat(JOptionPane.showInputDialog("Inserte Segundo Numero"));
        res=a-b;
        msj+="Respuesta: " + res;
        JOptionPane.showMessageDialog(null, msj);
    }
}
