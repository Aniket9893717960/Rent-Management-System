/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.occupier;

import db.DBConnector;
import dtb.occupier.userRegistration;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class registrationAuthenticator1823 {
     public boolean isRegistration(userRegistration user2){
          String firstname = user2.getFirstname();
        String lastname = user2.getLastname();
        String mailid = user2.getMailid();
        String Oname = user2.getOname();
        String Oaddress = user2.getOaddress();
        String age = user2.getAge();
        String dob = user2.getDob();
        String Mexpectation = user2.getMexceptation();
        String demand = user2.getDemand();
        String address= user2.getAddress();
        String address2 = user2.getAddress2();
        String zipcode = user2.getZipcode();
        String phoneNo=user2.getPhoneNo();
        
         try
          {
              Statement st = DBConnector.getStatement();
                 String query = "INSERT INTO occupier(`first_name`,`last_name`,`email_id`,`Oname`,`Oaddress`,`age`,`dob`,`Mexpectation`,`demand`,`address`,`address2`,`zipcode`,`phone_no`) VALUES ('"+firstname+"','"+lastname+"','"+mailid+"','"+Oname+"','"+Oaddress+"','"+age+"','"+dob+"','"+Mexpectation+"','"+demand+"','"+address+"','"+address2+"','"+zipcode+"','"+phoneNo+"')";
               System.out.println("Query="+query);
               st.executeUpdate(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(firstname!=null && lastname!=null && mailid!=null && Oname!=null && Oaddress!=null && age!=null && dob!=null && Mexpectation!=null && demand!=null && address!=null && address2!=null  && zipcode!=null && phoneNo!=null && mailid.endsWith("@gmail.com"))
            {
                System.out.print("uploaded image");
                return true;
            }
            System.out.print("Failed to upload image");
        return false;
        
    }

   
}
