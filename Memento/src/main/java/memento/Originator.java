package memento;

public class Originator {
    int x;
    int y;
    public Originator(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setHeight(int x){
        this.x=x;
    }
    public void setWidth(int y){
        this.y=y;
    }
    public Memento createMemento(){
        return new Memento(this.x,this.y);
    }
    public void restoreMemento(Memento mem){
        this.x=mem.x;
        this.y=mem.y;
    }
}
