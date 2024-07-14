package interpreterPattern;

public class AddExpression implements Expression {
    Expression leftExp;
    Expression rightExp;
    AddExpression( Expression leftExp, Expression rightExp) {
        this.leftExp=leftExp;
        this.rightExp=rightExp;
    }
    public int interpret(Context context){
        return leftExp.interpret(context)+rightExp.interpret(context);
    }
    
}
