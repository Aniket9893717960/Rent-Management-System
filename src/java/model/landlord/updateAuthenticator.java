/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.landlord;

import db.DBConnector;
import dtb.landlord.userUpdate;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class updateAuthenticator {
  public boolean isUpdate(userUpdate user1){
        String id = user1.getId();
    String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid =user1.getMailid();
        String available = user1.getAvailable();
        String demand = user1.getDemand();
        String age = user1.getAge();
        String dob = user1.getDob();
        String Mexpectation = user1.getMexceptation();
        String address= user1.getAddress();
        String address2 = user1.getAddress2();
        String zipcode = user1.getZipcode();
        String phoneNo=user1.getPhoneNo();
        
        
        int i=0;
         try
          {
              Statement st = DBConnector.getStatement();
            
            String query = "UPDATE landlord SET first_name='"+firstname+"' or last_name='"+lastname+"' or available='"+available+"' or demands='"+demand+"' or age='"+age+"' or dob='"+dob+"' or Mexpectation='"+Mexpectation+"' or address='"+address+"' or address2='"+address2+"'   or zipcode='"+zipcode+"' or phone_no='"+phoneNo+"' WHERE email_id='"+mailid+"'"; 
            
            i=st.executeUpdate(query);
              System.out.println(query);
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
         
         if(i>0)
            {
                System.out.println("data updated");
                return true;
            }
        System.out.println("not updated");  
        return false;
        
    }
}

