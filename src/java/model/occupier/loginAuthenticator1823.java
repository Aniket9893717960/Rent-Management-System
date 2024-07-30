package model.occupier;

import db.DBConnector;
import dtb.occupier.userLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dtb.occupier.userLoginTime;
import java.util.Date;

public class loginAuthenticator1823 {
    public   boolean isLoginTime(userLoginTime user1){
        String mailid =user1.getMailid();
        Date d1 = user1.getLogin(); 
        
        try
          {
              Statement st = DBConnector.getStatement();
                String query = "INSERT INTO clockofAdmin(`email_id`,`login_time`) VALUES ('"+mailid+"','"+d1+"')";
              System.out.println("Query="+query);
              st.executeUpdate(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         System.out.println(mailid);
         System.out.println(d1);
         if(mailid!=null && d1!=null)
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;
     }
    public   boolean isLogin(userLogin user){
        String mailid =user.getMailid();
        String password = user.getPassword();
        
        String tablePassword=""; 
        
        try {
            Statement st = DBConnector.getStatement();
            String query="Select password from occupier where email_id='"+mailid+"'";
            System.out.println("Query=" +query);
            
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next()){
                tablePassword =rs.getString(1);
            }
        }
        catch(SQLException e){
            System.out.println(e);
        }
     if(mailid!=null && password!=null && password.equals(tablePassword)){
        return true;
    }
     return false;
}
}
