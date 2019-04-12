package Ejercicio2;

import javax.swing.JOptionPane;
public class E implements Protocolo1,Protocolo2{

    @Override
    public void sumar() {
        float a=0,b=0,res=0;
        String msj="";
        a= Float.parseFloat(JOptionPane.showInputDialog("Inserte Primer Numero"));
        b= Float.parseFloat(JOptionPane.showInputDialog("Inserte Segundo Numero"));
        res=a+b;
        msj+="Respuesta: " + res;
        JOptionPane.showMessageDialog(null, msj);
    }

    @Override
    public void restar() {
    }

    @Override
    public void multiplicar() {
    }

    @Override
    public void dividir() {
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
