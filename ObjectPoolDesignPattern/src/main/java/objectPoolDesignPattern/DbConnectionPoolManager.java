package objectPoolDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class DbConnectionPoolManager {
    private List<DbConnection> connections=new ArrayList<>();
    private List<DbConnection>connectionCurrentlyInUse=new ArrayList<>();
    private static final int INITIAL_POOL_SIZE = 3;
    private static final int MAX_POOL_SIZE = 6;
    private static DbConnectionPoolManager obj=null;
   
    private DbConnectionPoolManager() {
        for(int i=0;i<INITIAL_POOL_SIZE;i++){
            connections.add(new DbConnection());
        }
    }
     //write a singleton pattern for it no new instance to be created if already there
     public static DbConnectionPoolManager getInstance(){
        if(obj==null){
            synchronized (DbConnectionPoolManager.class){
                if(obj==null){
                    obj=new DbConnectionPoolManager();
                }
            }
        }
        return obj;
    }
  
    public synchronized  DbConnection getDbConnection(){
       if(connections.isEmpty()&&connectionCurrentlyInUse.size()<MAX_POOL_SIZE){
        connections.add(new DbConnection());
       }
       else if(connections.isEmpty()&&connectionCurrentlyInUse.size()>=MAX_POOL_SIZE){
        return null;
       }
       DbConnection dbConnection=connections.remove(0);
       connectionCurrentlyInUse.add(dbConnection);
       return dbConnection;
    }
    public synchronized void releaseConnection(DbConnection dbConnection){
        if(dbConnection!=null){
            connectionCurrentlyInUse.remove(dbConnection);
            connections.add(dbConnection);
        }
    }

}
