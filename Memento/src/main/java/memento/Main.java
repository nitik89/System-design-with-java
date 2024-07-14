package memento;


public class Main {
public static void main(String[] args) {
    Originator org=new Originator(10, 20);
    Memento mem=org.createMemento();
    Caretaker care=new Caretaker();
    care.addMemento(mem);
   
    org.setHeight(10);
    org.setWidth(12);
   Memento mem2= org.createMemento();
   care.addMemento(mem2);
   org.setHeight(12);
   org.setWidth(14);

    Memento mem1=care.undo();
    org.restoreMemento(mem1);
    System.out.println(org.x + " "+org.y);
  



}
}
