package Clases;

public class Participantes extends Persona{
    private String tipoParticipante;

    public Participantes() {
    }

    public Participantes(String nombre, String genero, String email, int telefono, String tipoParticipante) {
        super(nombre, genero, email, telefono);
        this.tipoParticipante = tipoParticipante;
    }

    public String getTipoParticipante() {
        return tipoParticipante;
    }

    public void setTipoParticipante(String tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }
    
     @Override
    public void registrar(){
        
    }
    
    @Override
    public void actualizar(){
        
    }
    
    public void registrarParticipante(){
    }
    
    public void cancelarRegistro(){ 
    }

}
