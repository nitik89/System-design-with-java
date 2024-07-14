package memento;

import java.util.ArrayList;
import java.util.List;



public class Caretaker {
   List<Memento>history=new ArrayList<>();
   public void addMemento(Memento mem){
    history.add(mem);
   }
   public Memento undo(){
    if(!history.isEmpty()){
        int lastMemIndex=history.size()-1;
        Memento lastMem=history.get(lastMemIndex);
        history.remove(lastMemIndex);
        return lastMem;
    }
    return null;
   }
    
}
