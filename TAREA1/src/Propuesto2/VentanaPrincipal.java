package Propuesto2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener{
    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JButton btnCalcular;
    private JTextArea area;
    private JScrollPane barra;
    
    public VentanaPrincipal() {
        setSize(500,500);
        setLayout(null);
        lblNumero1 = new JLabel();
        lblNumero1.setText("Agregar Sueldo: ");
        lblNumero1.setBounds(50,50,200,30);
        getContentPane().add(lblNumero1);
        
        lblNumero2 = new JLabel();
        lblNumero2.setText("Agregar Numero de Hijos: ");
        lblNumero2.setBounds(50,80,200,30);
        getContentPane().add(lblNumero2);
        
        txtNumero1 = new JTextField();
        txtNumero1.setBounds(170,50,250,30);
        getContentPane().add(txtNumero1);
        
        txtNumero2 = new JTextField();
        txtNumero2.setBounds(170,80,250,30);
        getContentPane().add(txtNumero2);
        
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
        String msj="El sueldo total es ";
        float num1 = Integer.parseInt(txtNumero1.getText());
        int num2 = Integer.parseInt(txtNumero2.getText());
        float resultado;
        
        if(num2>0){
            resultado = num1*115/100;
        }else
            resultado = num1;
        msj+=""+resultado;
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