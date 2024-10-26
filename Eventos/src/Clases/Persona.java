
package Clases;

public abstract class Persona {
                private String nombre;
                private String genero;
                private String email;
                private int telefono;

    public Persona() {
    }
                
    public Persona (String nombre, String genero, String email, int telefono){
                    this.nombre = nombre;
                    this.genero = genero;
                    this.email = email;
                    this.telefono = telefono;
                }
                
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    public abstract void registrar();
    public abstract void actualizar();
                
}
