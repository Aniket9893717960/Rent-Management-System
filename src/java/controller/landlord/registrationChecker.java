/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userRegistration;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.landlord.registrationAuthentication;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "registrationChecker", urlPatterns = {"/registrationChecker"})
public class registrationChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("landlordlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
     String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String mailid = request.getParameter("mailid");
        Cookie email_id = new Cookie("mailid",mailid);
        response.addCookie(email_id);
        String available = request.getParameter("available");
        String demand = request.getParameter("demand");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address1");
        String zipcode = request.getParameter("zipcode");
        String phoneNo=request.getParameter("phoneno");
        
         
         userRegistration user1 = new userRegistration();
         
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setAvailable(available);
         user1.setDemand(demand);
         user1.setAge(age);
         user1.setDob(dob);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setZipcode(zipcode);
         user1.setPhoneNo(phoneNo);
         
         registrationAuthentication rauthenticator = new registrationAuthentication();
         boolean registration = rauthenticator.isRegistration(user1);
         
    if(registration){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("landlordaggrement.jsp");
    }
    else
    {
        response.sendRedirect("landlordregistration.jsp");
    }
}

}
