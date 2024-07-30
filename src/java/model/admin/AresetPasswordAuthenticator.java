/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.admin;

import db.DBConnector;
import dtb.admin.adminResetPassword;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class AresetPasswordAuthenticator {
     public   boolean isReset(adminResetPassword user){
     String mailid =user.getMailid();
     String password = user.getPassword();
        
        int tablePassword= 0;
        try {
            Statement st = DBConnector.getStatement();
            String query="Update landlord SET password='"+password+"' where email_id='"+mailid+"'";
            System.out.println("Query=" +query);
            tablePassword =st.executeUpdate(query);
            System.out.println(tablePassword);
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
