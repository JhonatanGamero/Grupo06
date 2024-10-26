
package Clases;

public class Organizador extends Persona{
    private int codigoOrganizador;

    public Organizador() {
    }

    public Organizador(String nombre, String genero, String email, int telefono, int codigoOrganizador){
        super(nombre, genero, email, telefono);
        this.codigoOrganizador = codigoOrganizador;
    }

    public int getCodigoOrganizador() {
        return codigoOrganizador;
    }

    public void setCodigoOrganizador(int codigoOrganizador) {
        this.codigoOrganizador = codigoOrganizador;
    }
    
    @Override
    public void registrar(){
        
    }
    
    @Override
    public void actualizar(){
        
    }
    
    public void gestionarEvento(){
    }
    
    public void agregarParticipante(){
    }

}
