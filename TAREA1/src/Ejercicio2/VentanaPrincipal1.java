/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author gabri
 */
public class VentanaPrincipal1 extends JFrame implements ActionListener{
    private JLabel lblNumero;
    private JTextField txtNumero;
    private JButton btnAgregar;
    private JButton btnListar;
    private JButton btnLimpiar;
    private JTextArea area;
    private JScrollPane barra;
    private int num[] = new int[100];
    private int i=0;

    public VentanaPrincipal1() {
        setSize(500,500);
        setLayout(null);
        lblNumero = new JLabel();
        lblNumero.setText("Agregar Numero: ");
        lblNumero.setBounds(50,50,200,30);
        getContentPane().add(lblNumero);
        
        txtNumero = new JTextField();
        txtNumero.setBounds(170,50,250,30);
        getContentPane().add(txtNumero);
        
        btnAgregar = new JButton();
        btnAgregar.setText("Agregar");
        btnAgregar.setBounds(50,100,100,30);
        getContentPane().add(btnAgregar);
        
        btnAgregar.addActionListener(this);
        
        btnListar = new JButton();
        btnListar.setText("Listar");
        btnListar.setBounds(170,100,100,30);
        getContentPane().add(btnListar);
        
        btnListar.addActionListener(this);
        
        btnLimpiar = new JButton();
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBounds(300,100,100,30);
        getContentPane().add(btnLimpiar);
        
        btnLimpiar.addActionListener(this);
        
        barra = new JScrollPane();
        area = new JTextArea();
        barra.setViewportView(area);
        barra.setBounds(50,150,380,300);
        getContentPane().add(barra);
    }
    
    public static void main(String[] args) {
        VentanaPrincipal1 ventana = new VentanaPrincipal1();
        ventana.setVisible(true);
    }
    
    public void agregarDatos(){
        String numCad;
        
        try {
            numCad = txtNumero.getText().trim();
            num[i] = Integer.parseInt(numCad);
            i++;
            txtNumero.setText("");
            
        }
        catch (NumberFormatException e1) {
            JOptionPane.showMessageDialog(null, "ERROR POR FAVOR INGRESAR UN NUMERO ENTERO");
        }
        catch (ArrayIndexOutOfBoundsException e2){
            JOptionPane.showMessageDialog(null, "ALMACENAMIENTO LLENO");            
        }
    }
    
    public void listarDatos(){
        String acumCad = "";
        for(int j=0; j<i; j++){
            acumCad+=num[j]+"\n";
        }
        area.append(acumCad);
    }
    
    public void limpiarDatos(){
        txtNumero.setText("");
        area.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnAgregar){
            agregarDatos();
        }
        if(e.getSource()==btnLimpiar){
            limpiarDatos();
        }
        if(e.getSource()==btnListar){
            listarDatos();
        }
    }
}
