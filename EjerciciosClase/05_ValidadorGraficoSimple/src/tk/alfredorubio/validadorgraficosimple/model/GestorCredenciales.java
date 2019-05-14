
package tk.alfredorubio.validadorgraficosimple.model;

/**
 *  Clase para manejar las credenciales de un usuario
 * 
 * @author ARN
 */
public class GestorCredenciales {


    public boolean validarCredencial(Credencial c) {
        
        boolean correcto = false;
       
        AlmacenCredenciales almacen = new AlmacenCredenciales();
        
        Credencial credencialAlmacenada = almacen.getCredencial(c);
        
        if (c.getEmail().equals(credencialAlmacenada.getEmail()) && 
            c.getPassword().equals(credencialAlmacenada.getPassword()) ) {
            correcto = true;
        }
        
        return correcto;
    
    }
}
