/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userResetPassword;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.landlord.resetPasswordAuthenticator;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "resetPasswordChecker", urlPatterns = {"/resetPasswordChecker"})
public class resetPasswordChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("landlordlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
    String password = request.getParameter("password");
     
         
         userResetPassword user = new userResetPassword();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         
         resetPasswordAuthenticator authenticator = new resetPasswordAuthenticator();
         boolean reset = authenticator.isReset(user);
    if(reset){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("landlordlogin.jsp");
    }
    else
    {
        response.sendRedirect("ServicesPage.jsp");
    }
}
}
