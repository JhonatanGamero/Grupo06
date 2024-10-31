
package ArrayList;

import Clases.Organizador;
import java.util.ArrayList;
import java.util.List;

public class OrganizadorList {
    
    List<Organizador> listaOrganizador = new ArrayList<>();
    
    public void agregar (Organizador o){
        listaOrganizador.add(o);
    }
    
    public void quitar (Organizador o){
         listaOrganizador.remove(o);
    }
    
    public Organizador obtener(int pos){
        return listaOrganizador.get(pos);
    }
    
    public List<Organizador> listar (){
         return this.listaOrganizador;
    }
}
    

