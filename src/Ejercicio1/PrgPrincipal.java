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
public class PrgPrincipal {
    D objD;
    
    public static void main(String[] args) {
        PrgPrincipal objPrgPrincipal = new PrgPrincipal();
        objPrgPrincipal.menuOpciones();
    }
    public void menuOpciones(){
        objD = new D();
        int menu = 0;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Suma(1),Resta(2),Multiplicacion(3),Division(4)"));
        
        switch(menu){
            case 1: objD.sumar();break;
            case 2: objD.restar();break;
            case 3: objD.Multiplicar();break;
            case 4: objD.dividir();break;
        }
    }
}
