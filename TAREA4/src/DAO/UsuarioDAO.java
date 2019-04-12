package DAO;

import Bean.Usuario;

public class UsuarioDAO {
    public boolean entrar(Usuario objUsuario){
        String usu,cla;
        boolean estado = false;
        usu = objUsuario.getUsu();
        cla = objUsuario.getCla();
        
        if(usu.equals("ivan") && cla.equals("123")){
            estado = true;
        }else{
            estado = false;
        }
        return estado;
    }
}
