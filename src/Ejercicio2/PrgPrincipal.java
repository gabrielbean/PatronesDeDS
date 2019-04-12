package Ejercicio2;

import javax.swing.JOptionPane;

public class PrgPrincipal {
    A objA;
    B objB;
    
    public static void main(String[] args) {
        PrgPrincipal objPrgPrincipal = new PrgPrincipal();
        objPrgPrincipal.menuPrincipal();
    }
    public void menuPrincipal(){
        objA = new A();
        objB = new B();
        
        int menu = 0;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Suma(1),Resta(2),Multiplicacion(3),Division(4)"));
        
        switch(menu){
            case 1: objA.sumar();break;
            case 2: objA.restar();break;
            case 3: objB.multiplicar();break;
            case 4: objB.dividir();break;
        }
    }
}
