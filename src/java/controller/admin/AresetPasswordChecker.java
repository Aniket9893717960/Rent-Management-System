/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dtb.admin.adminResetPassword;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.admin.AresetPasswordAuthenticator;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "AresetPasswordChecker", urlPatterns = {"/AresetPasswordChecker"})
public class AresetPasswordChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("adminlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
    String password = request.getParameter("password");
     
         
         adminResetPassword user = new adminResetPassword();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         
         AresetPasswordAuthenticator authenticator = new AresetPasswordAuthenticator();
         boolean reset = authenticator.isReset(user);
    if(reset){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("adminlogin.jsp");
    }
    else
    {
        response.sendRedirect("ServicesPage.jsp");
    }
}}
