/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.admin;

import db.DBConnector;
import dtb.admin.adminRegistration;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class AregistrationAuthenticator {
    public boolean isRegistration(adminRegistration user1){
    String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid = user1.getMailid();
       String placeholder = user1.getPlaceholder();
        
         try
          {
              Statement st = DBConnector.getStatement();
                String query = "INSERT INTO admin(`first_name`,`last_name`,`email_id`,`placeholder`) VALUES ('"+firstname+"','"+lastname+"','"+mailid+"','"+placeholder+"')";
              System.out.println("Query="+query);
              st.executeUpdate(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(firstname!=null && lastname!=null && mailid!=null && placeholder!=null && mailid.endsWith("@gmail.com"))
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;   
    }
}
