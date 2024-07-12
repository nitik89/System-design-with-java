package chainOfResponsibility;

public class ErrorLogger extends Logger {

    ErrorLogger(Logger nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int logLevel,String message){
        if(logLevel==ERROR){
            System.out.println("ERROR: "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }

    
    
}
