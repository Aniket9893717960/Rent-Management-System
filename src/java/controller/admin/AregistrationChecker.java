/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dtb.admin.adminRegistration;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.admin.AregistrationAuthenticator;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "AregistrationChecker", urlPatterns = {"/AregistrationChecker"})
public class AregistrationChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("occupierlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String mailid = request.getParameter("mailid");
        String placeholder = request.getParameter("placeholder");
         
         adminRegistration user1 = new adminRegistration();
         
         user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setMailid(mailid);
         user1.setPlaceholder(placeholder);
         
         AregistrationAuthenticator rauthenticator = new AregistrationAuthenticator();
         boolean registration = rauthenticator.isRegistration(user1);
         
    if(registration){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("adminProfile.jsp");
    }
    else
    {
        response.sendRedirect("adminRegistration.jsp");
    }
}

}
