/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.admin;

import db.DBConnector;
import dtb.admin.adminShow;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class AShowAuthenticator {
     public void isShow(adminShow user1){
        String id = user1.getId();
     String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid = user1.getMailid();
        String placeholder = user1.getPlaceholder();
        
        try
          {
              Connection con = DBConnector.getConnection();
              Statement st = null;
              String query = "SELECT * FROM admin WHERE email_id='"+mailid+"'";
               System.out.println("Query="+query);
               st = con.createStatement();
              
              ResultSet rs =st.executeQuery(query);
              if(rs.next())
                      {
                  user1.setId(id);
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setPlaceholder(placeholder);
                      }
                 }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
    }
}