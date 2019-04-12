package GUI;

import Bean.Usuario;
import DAO.UsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FrmLoginAcceso extends JFrame implements ActionListener{
    JButton btnEntrar;
    JLabel lblUsuario,lblClave,lblMensaje;
    JTextField txtUsuario;
    JPasswordField txtClave;
    UsuarioDAO objUsuarioDAO;
    Usuario objUsuario;
    FrmPrincipal objFrmPrincipal;

    public FrmLoginAcceso() {
        initComponents();
        objUsuarioDAO = new UsuarioDAO();
        
    }

    private void initComponents() {
        setSize(300,300);
        setTitle("Ventana de Acceso");
        setLayout(null);
        btnEntrar = new JButton();
        btnEntrar.setText("Entrar");
        btnEntrar.setBounds(70,125,150,30);
        btnEntrar.addActionListener(this);
        getContentPane().add(btnEntrar);
        
        lblUsuario = new JLabel();
        lblUsuario.setText("Usuario: ");
        lblUsuario.setBounds(50,50,150,30);
        getContentPane().add(lblUsuario);
        
        lblClave = new JLabel();
        lblClave.setText("Clave: ");
        lblClave.setBounds(50,80,150,30);
        getContentPane().add(lblClave);
        
        lblMensaje = new JLabel();
        lblMensaje.setBounds(50,180,150,30);
        getContentPane().add(lblMensaje);
        
        txtUsuario = new JTextField();
        txtUsuario.setBounds(100,50,150,30);
        getContentPane().add(txtUsuario);
        
        txtClave = new JPasswordField();
        txtClave.setBounds(100,80,150,30);
        getContentPane().add(txtClave);
    }
    
    public static void main(String[] args) {
        FrmLoginAcceso objVentana = new FrmLoginAcceso();
        objVentana.setVisible(true);
    }
    
    public void entrar(){
        String usu,cla;
        boolean estado = false;
        usu = txtUsuario.getText();
        cla = txtClave.getText();
        objUsuario = new Usuario();
        objUsuario.setUsu(usu);
        objUsuario.setCla(cla);
        estado = objUsuarioDAO.entrar(objUsuario);
        
        if(estado){
            objFrmPrincipal = new FrmPrincipal();
            objFrmPrincipal.setVisible(true);
            this.dispose();
        }else{
            lblMensaje.setText("Usuario y clave incorrectos");
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnEntrar){
            entrar();
        }
    
    }

    
}
