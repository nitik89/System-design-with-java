package chainOfResponsibility;

public class InfoLogger extends Logger {

    InfoLogger(Logger nextProcessor) {
        super(nextProcessor);
    }
    @Override
    public void log(int logLevel,String message){
        if(logLevel==INFO){
            System.out.println("INFO: "+message);
        }
        else{
            super.log(logLevel,message);
        }
    }

    
    
}
