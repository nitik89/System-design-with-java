package memento;

public class Memento {
    int x;
    int y;
    public Memento(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int getHeight(){
        return x;
    }
    public int getWidth(){
        return  y;
    }
}
