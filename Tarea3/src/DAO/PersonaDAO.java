package DAO;

import java.util.ArrayList;
import Bean.Persona;

public class PersonaDAO {
    ArrayList<Persona> lista = null;
    Persona objPersona = null;
    String codigo[] = {"001","002","003"};
    String nombre[] = {"Ciro","Danny","Ivan"};
    String apellido[] = {"Rodriguez","Montoya","Perez"};

    public PersonaDAO() {
        lista = new ArrayList<Persona>();
    }
    
    public ArrayList<Persona> listarPersonas(){
        try {
            for(int i=0;i<3;i++){
                objPersona = new Persona();
                objPersona.setCodigo(codigo[i]);
                objPersona.setNombre(nombre[i]);
                objPersona.setApellido(apellido[i]);
                lista.add(objPersona);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
}
