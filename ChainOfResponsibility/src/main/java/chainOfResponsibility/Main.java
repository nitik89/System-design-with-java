package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
       Logger logObj=new InfoLogger(new DebugLogger(new ErrorLogger(null) ));
       logObj.log(Logger.ERROR,"error got on this");
       logObj.log(Logger.DEBUG,"need to debug this");
       logObj.log(Logger.INFO,"info got it");
        
    }
}
