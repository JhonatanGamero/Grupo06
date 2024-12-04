
package ArrayList;

import Clases.Usuarios;
import java.util.ArrayList;
import java.util.List;

public class UsuariosList {
    List<Usuarios> listaUsuarios = new ArrayList<>();
    
    public void agregar (Usuarios u){
        listaUsuarios.add(u);
    }
    
    public void quitar (Usuarios u){
         listaUsuarios.remove(u);
    }
    
    public List<Usuarios> listar (){
         return this.listaUsuarios;
    }
}
