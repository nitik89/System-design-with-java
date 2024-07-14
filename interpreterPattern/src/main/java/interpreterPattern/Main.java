package interpreterPattern;

public class Main {
    public static void main(String[] args) {
        Context context=new Context();
        context.put("a",1);
        context.put("b",3);
        context.put("c",4);
        context.put("d",5);
        Expression exp=new SubExpress(new AddExpression(new NumberExpression("c"),new NumberExpression("d")),new AddExpression(new NumberExpression("a"),new NumberExpression("b")));
        System.out.println(exp.interpret(context));
    }
}
