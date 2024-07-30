/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.landlord;

import db.DBConnector;
import dtb.landlord.userAggrement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class aggrementAuthenticator {
    public void isAuthenticator(userAggrement user1){
      String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String mailid = user1.getMailid();
        String available = user1.getAvailable();
        String demand = user1.getDemand();
        String age = user1.getAge();
        String dob = user1.getDob();
        String Mexpectation = user1.getMexceptation();
        String address= user1.getAddress();
        String address2 = user1.getAddress2();
        String zipcode = user1.getZipcode();
        
        
         try
          {
              Statement st = DBConnector.getStatement();          
              String query = "SELECT * FROM landlord WHERE email_id='"+mailid+"'";
              System.out.println("Query ="+query);
              
              ResultSet rs =st.executeQuery(query);
              if(rs.next())
                      {
                  user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setAvailable(available);
         user1.setDemand(demand);
         user1.setAge(age);
         user1.setDob(dob);
         user1.setMexceptation(Mexpectation);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setZipcode(zipcode);
          }
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
    }
}

