/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userCertificate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "CertificateChecker", urlPatterns = {"/CertificateChecker"})
public class CertificateChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("landlordlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("landlord_id");
        String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        String mailid = request.getParameter("email_id");
        String available = request.getParameter("available");
        String demand = request.getParameter("demands");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String Mexpectation = request.getParameter("Mexpectation");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address2");
        String zipcode = request.getParameter("zipcode");
     
                 userCertificate user1 = new userCertificate();
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
}
}
