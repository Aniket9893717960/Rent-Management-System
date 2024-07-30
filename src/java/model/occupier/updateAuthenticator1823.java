/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.occupier;

import db.DBConnector;
import dtb.occupier.userUpdate;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author INDIA
 */
public class updateAuthenticator1823 {
     public boolean isUpdate(userUpdate user1){
    String id = user1.getId();
     String firstname = user1.getFirstname();
        String lastname = user1.getLastname();
        String Oname = user1.getOname();
        String Oaddress = user1.getOaddress();
        String age = user1.getAge();
        String dob = user1.getDob();
        String Mexpectation = user1.getMexceptation();
        String demand = user1.getDemand();
        String address= user1.getAddress();
        String address2 = user1.getAddress2();
        String zipcode = user1.getZipcode();
        String phoneNo=user1.getPhoneNo();
        
        
        int i=0;
         try
          {
              Statement st = DBConnector.getStatement();
            
            String query = "UPDATE occupier SET occupier_id='"+id+"' or first_name='"+firstname+"' or last_name='"+lastname+"' or Oname='"+Oname+"' or Oaddress='"+Oaddress+"' or age='"+age+"' or dob='"+dob+"' or Mexpectation='"+Mexpectation+"' or demand='"+demand+"' or address='"+address+"' or address2='"+address2+"'  or zipcode='"+zipcode+"' or phone_No='"+phoneNo+"' WHERE occupier_id18='"+id+"'"; 
            
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
