package interpreterPattern;

public class SubExpress implements Expression{
    Expression leftExp;
    Expression rightExp;
    SubExpress( Expression leftExp, Expression rightExp) {
        this.leftExp=leftExp;
        this.rightExp=rightExp;
    }
    public int interpret(Context context){
        return leftExp.interpret(context)-rightExp.interpret(context);
    }
}
