/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.occupier;

import db.DBConnector;
import dtb.occupier.userResetPassword;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class resetPasswordAuthenticator1823 {
     public   boolean isReset(userResetPassword user){
    String mailid =user.getMailid();
    String cp = user.getCp();
        String password = user.getPassword();
        
        int tablePassword= 0;
        try {
            Statement st = DBConnector.getStatement();
            String query="Update occupier SET password='"+password+"' where email_id='"+mailid+"'";
            System.out.println("Query=" +query);
            
            tablePassword =st.executeUpdate(query);
        }
        catch(SQLException e){
            System.out.println(e);
        }
        
         if(tablePassword >0)
            {
                System.out.println("data updated");
                return true;
            }
        System.out.println("not updated");  
        return false;
}
}