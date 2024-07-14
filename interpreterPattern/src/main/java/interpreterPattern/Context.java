package interpreterPattern;

import java.util.HashMap;
import java.util.Map;
public class Context {
    Map<String,Integer>contextMap=new HashMap<>();
    public void put(String str,int value){
        contextMap.put(str,value);
    }
    public int get(String str){
        return contextMap.get(str);
    }

}
