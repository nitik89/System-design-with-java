package proxyPattern;

public class UserProxy implements UserInf{
    UserImp userobj;
    UserProxy(UserImp userobj) {
    this.userobj = userobj;
    }

    @Override
    public void createUser(String client) {
        if(client.equals("ADMIN")){
            userobj.createUser(client);
        }   
        else{
            System.out.println("Only ADMIN users can create users");
        }
    }
}
