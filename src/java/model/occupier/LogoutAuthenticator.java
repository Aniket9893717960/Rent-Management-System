/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.occupier;

import db.DBConnector;
import dtb.occupier.userLogoutTime;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


/**
 *
 * @author INDIA
 */
public class LogoutAuthenticator {
    public   boolean isLogoutTime(userLogoutTime user1){
        String mailid =user1.getMailid();
        String lid = user1.getLid();
        Date d1 = user1.getLogout();
        Date d2 = user1.getLogin();
        int i=0;
        
        try
          {
              
              Statement st = DBConnector.getStatement();
              if(mailid!=null && d2!=null){
                  System.out.println(lid);
         System.out.println(mailid);
         System.out.println(d1);
         System.out.println(d2);
                String query = "UPDATE clockofadmin SET landlord_id ='"+lid+"',logout_time ='"+d1+"' WHERE email_id='"+mailid+"'";
              System.out.println("Query="+query);
               i=st.executeUpdate(query);
          }
          }
          
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
          
         if(lid!=null && mailid!=null && d1!=null && d2!=null)
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;
     }
    }
