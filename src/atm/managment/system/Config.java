package atm.managment.system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Config {
    Connection connection;
    Statement statement;

    public Config(){

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Vgfghk2q");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
