package decoratorPattern;

public class ExtraTopping extends ToppingDecorator {
    BasePizza basePizza;
     ExtraTopping(BasePizza basePizza){
        this.basePizza=basePizza;
    }
    @Override
    public int cost(){
        return this.basePizza.cost()+40;
    }
}
