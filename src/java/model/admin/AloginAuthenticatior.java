/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.admin;

import db.DBConnector;
import dtb.admin.adminLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class AloginAuthenticatior {
     public   boolean isLogin(adminLogin user){
        String mailid =user.getMailid();
        String password = user.getPassword();
        
        String tablePassword=""; 
        
        try {
            Statement st = DBConnector.getStatement();
            String query="Select password from admin where email_id='"+mailid+"'";
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
