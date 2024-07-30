/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.landlord;

import db.DBConnector;
import dtb.landlord.userlandlordServices;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class landlordServicesAuthenticator {
    public void isShow(userlandlordServices user1){
        String id = user1.getId();
         String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String demand = user1.getDemand();
        String address= user1.getAddress();
        String zipcode = user1.getZipcode();
        String email_id = user1.getEmail_id();
        
        try
          {
              Statement st = DBConnector.getStatement();          
              String query = "SELECT * FROM  occupier";
              System.out.println("Query ="+query);
              ResultSet rs =st.executeQuery(query);
              if(rs.next())
                      {
                  user1.setId(id);
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setDemand(demand);
         user1.setAddress(address);
         user1.getZipcode();
         user1.getEmail_id();
          }
          }
          catch(SQLException ex)
          {
              System.out.println(ex);
          }
     }
}
