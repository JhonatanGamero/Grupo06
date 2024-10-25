package Clases;

public class Usuarios extends Persona{
    private int codigoUsuario;
    private String nombreUsuario;
    private String contrasena;
    private String rol;
    
    public Usuarios(String nombre, String genero, String email, int telefono, int codigoUsuario, String nombreUsuario, String contrasena, String rol){
        super (nombre, genero, email, telefono);
        this.codigoUsuario = codigoUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }
    
    @Override
    public void registrar(){
        
    }
    
    @Override
    public void actualizar(){
        
    }
    
    public void iniciarSesion(){
        
    }
    
     public void cerrarSesion(){
        
    }
     
      public void cambiarContrasena(){
        
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
      
      
}
