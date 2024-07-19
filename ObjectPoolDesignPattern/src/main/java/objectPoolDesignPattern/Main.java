package objectPoolDesignPattern;

public class Main {
    public static void main(String[] args) {
        DbConnectionPoolManager dbConnectionPoolManager=DbConnectionPoolManager.getInstance();
        DbConnection dbConnection1=dbConnectionPoolManager.getDbConnection();
        DbConnection dbConnection2=dbConnectionPoolManager.getDbConnection();
        dbConnectionPoolManager.releaseConnection(dbConnection1);
        DbConnection dbConnection3=dbConnectionPoolManager.getDbConnection();
        System.out.println(dbConnection1);
        System.out.println(dbConnection2);
        System.out.println(dbConnection3);
    }
}
