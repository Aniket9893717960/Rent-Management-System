/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userRegistration;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.occupier.registrationAuthenticator1823;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "registrationChecker30", urlPatterns = {"/registrationChecker30"})
public class registrationChecker30 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("occupierlogin30.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    System.out.println("In do post methord of Add image servlet.");
         String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String mailid = request.getParameter("mailid");
        Cookie email_id = new Cookie("mailid",mailid);
        response.addCookie(email_id);
        String Oname = request.getParameter("Oname");
        String Oaddress = request.getParameter("Oaddress");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String Mexpectation = request.getParameter("Mexpectation");
        String demand = request.getParameter("demand");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address1");
        String zipcode = request.getParameter("zipcode");
        String phoneNo=request.getParameter("phoneno");
        
         userRegistration user2 = new userRegistration();
         
         user2.setFirstname(firstname);
         user2.setLastname(lastname);
         user2.setMailid(mailid);
         user2.setOname(Oname);
         user2.setOaddress(Oaddress);
         user2.setAge(age);
         user2.setDob(dob);
         user2.setMexceptation(Mexpectation);
         user2.setDemand(demand);
         user2.setAddress(address);
         user2.setAddress2(address2);
         user2.setZipcode(zipcode);
         user2.setPhoneNo(phoneNo);
         
         
         registrationAuthenticator1823 rauthenticator = new registrationAuthenticator1823();
         boolean registration = rauthenticator.isRegistration(user2);
         
    if(registration){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("occupierprofile18-23.jsp");
    }
    else
    {
        response.sendRedirect("occupierregistration30.jsp");
    }
       }  
}
