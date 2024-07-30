/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.landlord;

import db.DBConnector;
import dtb.landlord.userPreviousDeletePage;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class PreviousDeleteAuthenticator {
public   boolean isLogin(userPreviousDeletePage user){
    String mailid =user.getMailid();
        String password = user.getPassword();
        
        String tablePassword=""; 
        
        try {
            Statement st = DBConnector.getStatement();
            String query = "SELECT email_id FROM landlord WHERE password='"+password+"'";
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

