package chainOfResponsibility;

public abstract class Logger {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    Logger newLoggerProcessor;

    Logger(Logger logger) {
        this.newLoggerProcessor=logger;
    }
    public void log(int loglevel,String message){
        if(newLoggerProcessor!=null){
            newLoggerProcessor.log(loglevel,message);
        }
    }
    



}
