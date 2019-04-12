
package Principal;

import DAO.Operacion;
import javax.swing.JOptionPane;

public class PrgPrincipal {

    public static void main(String[] args) {
        Operacion objOperacion = new Operacion();
        objOperacion.llenarArreglo();
        String monstrar = objOperacion.MonstrarElementosArreglo();
        JOptionPane.showMessageDialog(null, monstrar);
    }
    
}
