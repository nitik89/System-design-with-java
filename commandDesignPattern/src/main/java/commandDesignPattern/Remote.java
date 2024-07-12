package commandDesignPattern;

public class Remote {
    command cmd;
    
    public void setCommand(command cmd){
        this.cmd=cmd;
    }
   public void pressButton(){
        cmd.execute();
    }

    
}
