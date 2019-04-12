package Propuesto1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JLabel lblNumero3;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtNumero3;
    private JButton btnCalcular;
    private JTextArea area;
    private JScrollPane barra;
    private int num[] = new int[100];
    private int i=0;
    
    public VentanaPrincipal() {
        setSize(500,500);
        setLayout(null);
        lblNumero1 = new JLabel();
        lblNumero1.setText("Agregar Numero1: ");
        lblNumero1.setBounds(50,50,200,30);
        getContentPane().add(lblNumero1);
        
        lblNumero2 = new JLabel();
        lblNumero2.setText("Agregar Numero2: ");
        lblNumero2.setBounds(50,80,200,30);
        getContentPane().add(lblNumero2);
        
        lblNumero3 = new JLabel();
        lblNumero3.setText("Agregar Numero3: ");
        lblNumero3.setBounds(50,110,200,30);
        getContentPane().add(lblNumero3);
        
        txtNumero1 = new JTextField();
        txtNumero1.setBounds(170,50,250,30);
        getContentPane().add(txtNumero1);
        
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(170,80,250,30);
        getContentPane().add(txtNumero2);
        
        txtNumero3 = new JTextField();
        txtNumero3.setBounds(170,110,250,30);
        getContentPane().add(txtNumero3);
        
        btnCalcular = new JButton();
        btnCalcular.setText("Calcular");
        btnCalcular.setBounds(50,140,100,30);
        getContentPane().add(btnCalcular);
        
        btnCalcular.addActionListener(this);
                
        barra = new JScrollPane();
        area = new JTextArea();
        barra.setViewportView(area);
        barra.setBounds(50,180,380,300);
        getContentPane().add(barra);
    }
    public void calcular(){
        String msj="";
        int num1 = Integer.parseInt(txtNumero1.getText());
        int num2 = Integer.parseInt(txtNumero2.getText());
        int num3 = Integer.parseInt(txtNumero3.getText());
        
        if(num1>=num2){
            if(num1>=num3){
                msj+="El numero mayor es " + num1 + "\n";
                if(num2>=num3){
                    msj+="El numero menor es " + num3 + "\n";
                }else
                    msj+="El numero menor es " + num2 + "\n";
            }else{
                msj+="El numero mayor es " + num3 + "\n";
                msj+="El numero menor es " + num2 + "\n";
            }
        }else if(num2>=num3){
            msj+="El numero mayor es " + num2 + "\n";
            if(num1>=num3){
                msj+="El numero menor es " + num3 + "\n";
            }else
                msj+="El numero menor es " + num1 + "\n";
        }
        area.append(msj);
    }
    
    public static void main(String[] args) {
        VentanaPrincipal objVentanaPrincipal = new VentanaPrincipal();
        objVentanaPrincipal.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnCalcular){
            calcular();
        }
    }
}
