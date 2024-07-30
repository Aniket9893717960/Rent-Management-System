/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userUpdate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.landlord.updateAuthenticator;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "updateChecker", urlPatterns = {"/updateChecker"})
public class updateChecker extends HttpServlet {

public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("occupierlogin23-30.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String id = request.getParameter("occupier_id"); 
    String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String mailid = request.getParameter("email");
        Cookie cookies[] = request.getCookies();
                  for (int idx1 = 0; idx1 < cookies.length; idx1++){       
                  mailid = cookies[idx1].getValue();
                  System.out.println(cookies[idx1].getName()+" = "+cookies[idx1].getValue());
                  }
        String available = request.getParameter("available");
        String demand = request.getParameter("demand");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String Mexpectation = request.getParameter("Mexpectation");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address1");
        String zipcode = request.getParameter("zipcode");
        String phoneNo=request.getParameter("phoneno");
     
                 userUpdate user1 = new userUpdate();
                 
                 user1.setId(id);  
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
         user1.setPhoneNo(phoneNo);
         
         updateAuthenticator uauthenticator = new updateAuthenticator();
         boolean update = uauthenticator.isUpdate(user1);
         
          if(update){
        HttpSession session=request.getSession(true);
        session.setAttribute("occupier_id",id);
        response.sendRedirect("landlordProfile.jsp");
    }
    else
    {
        response.sendRedirect("landlordupdate.jsp");
    }
                 
}
}
