/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userResetPassword;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.occupier.resetPasswordAuthenticator1823;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "resetPasswordChecker1823", urlPatterns = {"/resetPasswordChecker1823"})
public class resetPasswordChecker1823 extends HttpServlet {
     public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login18-22.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
    String cp = request.getParameter("cp");
         String password = request.getParameter("password");
         
         userResetPassword user = new userResetPassword();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         resetPasswordAuthenticator1823 authenticator = new resetPasswordAuthenticator1823();
         boolean reset = authenticator.isReset(user);
    if(reset){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("occupierlogin18-22.jsp");
    }
    else
    {
        response.sendRedirect("profile18-22.jsp");
    }
}
}
