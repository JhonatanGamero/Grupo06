
package ArrayList;

import Clases.Eventos;
import java.util.ArrayList;
import java.util.List;

public class EventosList {
    List<Eventos> organizarEvento = new ArrayList<>();
    
    public void agregar (Eventos e){
        organizarEvento.add(e);
    }
    
    public void quitar (Eventos e){
         organizarEvento.remove(e);
    }
    
    public Eventos obtener(int pos){
        return organizarEvento.get(pos);
    }
    
    public List<Eventos> listar (){
         return this.organizarEvento;
    }
}
