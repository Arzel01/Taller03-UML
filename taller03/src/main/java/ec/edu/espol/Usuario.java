package ec.edu.espol;


public abstract class Usuario {
    protected String usuario;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected java.util.AbstractCollection incidentes;


    protected boolean logIn(){
        return true;
    }

    protected boolean logOut(){
        return true;
    }
}
