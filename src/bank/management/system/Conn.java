package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:Mysql:///bankmanagementsystem", "root", "450963sh");
            s = c.createStatement();
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
        
}
