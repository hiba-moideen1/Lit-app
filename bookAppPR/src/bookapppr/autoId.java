
package bookapppr;
import java.util.*;
import java.sql.*;



public class autoId {
public static Connection connect(){
    Connection con=null;
    try{
       Class.forName("java.sql.DriverManager");
       con= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","password"); 
       
    }catch(Exception e){
        System.out.println("inter.autoId.connect()");
    }
  return con;  
}   
}
