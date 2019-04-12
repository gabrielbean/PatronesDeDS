
package DAO;
import Bean.Numero;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Operacion extends OperacionSuperior{
    Numero objNumero;
    int i=0;

    public Operacion() {
        lista = new ArrayList<Numero>();
    }
    
    public void llenarArreglo(){
        for(i=0;i<10;i++){
            lista.add(new Numero(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero"))));
        }
    }
    
    public String MonstrarElementosArreglo(){
        String msj="";
        for(i=0;i<lista.size();i++){
            objNumero = (Numero)lista.get(i);
            msj+=objNumero.getNumero()+"\n";
        }
        return msj;
    }
    
}
