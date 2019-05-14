

package tk.alfredorubio.validadorgraficosimple.model;

/**
 * Clase para almacenar las credenciales de un usuario
 * 
 * @author ARN
 */
public class Credencial {
    
    private String email;
    private String password;

    private final int LONG_MIN_PASSWORD = 3;

    public Credencial(String email, String password) throws UsuarioErroneoException, PasswordErroneaException {
        
        if (email.trim().length() == 0) {
            throw new UsuarioErroneoException();
        }
        
        if (password.trim().length() <= 3) {
            throw new PasswordErroneaException();
        }
 
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
