/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.landlord;

import db.DBConnector;
import dtb.landlord.userRegistration;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class registrationAuthentication {
    public boolean isRegistration(userRegistration user1){
    String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid = user1.getMailid();
        String available = user1.getAvailable();
        String demand = user1.getDemand();
        String age = user1.getAge();
        String dob = user1.getDob();
        String address= user1.getAddress();
        String address2 = user1.getAddress2();
        String zipcode = user1.getZipcode();
        String phoneNo=user1.getPhoneNo();
        
         try
          {
              Statement st = DBConnector.getStatement();
                String query = "INSERT INTO landlord(`first_name`,`last_name`,`email_id`,`available`,`demands`,`age`,`dob`,`address`,`address2`,`zipcode`,`phone_no`) VALUES ('"+firstname+"','"+lastname+"','"+mailid+"','"+available+"','"+demand+"','"+age+"','"+dob+"','"+address+"','"+address2+"','"+zipcode+"','"+phoneNo+"')";
              System.out.println("Query="+query);
              st.executeUpdate(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(firstname!=null && lastname!=null && mailid!=null && available!=null && demand!=null && age!=null && dob!=null && address!=null && address2!=null  && zipcode!=null && phoneNo!=null && mailid.endsWith("@gmail.com"))
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;   
    }
}

