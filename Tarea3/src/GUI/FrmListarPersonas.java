package GUI;

import Bean.Persona;
import DAO.PersonaDAO;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class FrmListarPersonas extends JFrame implements ActionListener{
    JButton btnListar;
    DefaultTableModel modelo;
    JScrollPane barra;
    JTable tabla;
    String titulo[] = {"Codigo","Nombre","Apellido"};
    PersonaDAO objPersonaDAO = null;
    ArrayList<Persona> lista = null;

    public FrmListarPersonas() {
        initComponents();
        objPersonaDAO = new PersonaDAO();
    }

    public void initComponents() {
        setSize(500,500);
        setLayout(null);
        btnListar = new JButton();
        btnListar.setText("Listar Personas");
        btnListar.addActionListener(this);
        btnListar.setBounds(100,50,300,30);
        getContentPane().add(btnListar);
        
        barra = new JScrollPane();
        tabla = new JTable();
        modelo = new DefaultTableModel(null,titulo);
        tabla.setModel(modelo);
        barra.setViewportView(tabla);
        barra.setBounds(50,100,400,200);
        getContentPane().add(barra);
    }
    public void mostrarPersona(){
        int i = 0;
        lista = objPersonaDAO.listarPersonas();
        modelo = new DefaultTableModel(null,titulo);
        modelo.setNumRows(lista.size());
        for(Persona objPersona:lista){
            modelo.setValueAt(objPersona.getCodigo(),i,0);
            modelo.setValueAt(objPersona.getNombre(),i,1);
            modelo.setValueAt(objPersona.getApellido(),i,2);
            i++;            
        }
        tabla.setModel(modelo);
    }
    
    public static void main(String[] args) {
        FrmListarPersonas ventana = new FrmListarPersonas();
        ventana.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnListar){
            mostrarPersona();
        }
    }
    
    
    
    
}
