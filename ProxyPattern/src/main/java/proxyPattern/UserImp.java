package proxyPattern;

public class UserImp implements UserInf {
    @Override
    public void createUser(String client) {
        // Logic to create a new user, e.g., saving to a database
        System.out.println(client+"User created: ");
    }
}
