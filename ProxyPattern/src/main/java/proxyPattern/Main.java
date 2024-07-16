package proxyPattern;

public class Main {
    public static void main(String[] args) {
        UserImp userImp=new UserImp();
    UserInf user=new UserProxy(userImp);
    user.createUser("ADMIN");
    }
    
}
