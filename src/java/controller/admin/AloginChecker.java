/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dtb.admin.adminLogin;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.admin.AloginAuthenticatior;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "AloginChecker", urlPatterns = {"/AloginChecker"})
public class AloginChecker extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("adminlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("email_id");
         String password = request.getParameter("password");
         
         adminLogin user = new adminLogin();
         
         user.setMailid(mailid);
         user.setPassword(password);
         
         AloginAuthenticatior authenticator = new AloginAuthenticatior();
         boolean login = authenticator.isLogin(user);
    if(login){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("adminProfile.jsp");
    }
    else
    {
        response.sendRedirect("adminlogin.jsp");
    }
}
}

