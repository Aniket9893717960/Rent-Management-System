/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.occupier;

import db.DBConnector;
import dtb.occupier.userShow;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class showAuthenticator1823 {
      public void isShow(userShow user1){
        String id = user1.getId();
        String lid = user1.getLid();
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
        String phoneNo=user1.getPhoneNo();
        
        try
          {
              Statement st = DBConnector.getStatement();          
              String query = "SELECT * FROM occupier WHERE email_id ='"+mailid+"'";
              System.out.println("Query ="+query);
              ResultSet rs =st.executeQuery(query);
              if(rs.next())
                      {
                  user1.setId(id);
                  user1.setLid(lid);
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setAvailable(available);
         user1.setDemand(demand);
         System.out.println(demand);
         user1.setDob(dob);
         user1.setMexceptation(Mexpectation);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setZipcode(zipcode);
         user1.setPhoneNo(phoneNo);
          }
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
     }
}
