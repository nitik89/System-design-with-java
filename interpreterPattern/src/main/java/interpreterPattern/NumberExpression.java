package interpreterPattern;

public class NumberExpression implements Expression {
    String stringValue;
    NumberExpression(String stringVal) {
        this.stringValue=stringVal;
    }
    @Override
    public int interpret(Context context){
        return context.get(stringValue);
    }
    
}
