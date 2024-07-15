package decoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza=new ExtraTopping(new ExtraCheese(new Farmhouse()));
        System.out.println(pizza.cost());
    }
  

}
