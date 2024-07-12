package chainOfResponsibility;

public class DebugLogger extends Logger {

    DebugLogger(Logger nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int logLevel,String message){
        if(logLevel==DEBUG){
            System.out.println("DEBUG: "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }

    
    
}
