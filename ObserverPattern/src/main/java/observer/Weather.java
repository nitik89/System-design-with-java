package observer;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Observable {
    public List<Observer>observers=new ArrayList<>();
    public int stockData=0;
    @Override
    public void add(Observer ob){
        observers.add(ob);
    }
    @Override
    public void remove(Observer ob){
        observers.remove(ob);
    }
    @Override
    public void notifyObservers(){
        for(Observer ob:observers){
            ob.update();
        }
    }
    @Override
    public void setData(int data){
        if(stockData==0){
            notifyObservers();
        }
        stockData+=data;
    }

    
}
