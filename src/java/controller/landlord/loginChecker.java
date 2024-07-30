/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userLogin;
import dtb.occupier.userLoginTime;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.landlord.loginAuthenticatior;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "loginChecker", urlPatterns = {"/loginChecker"})
public class loginChecker extends HttpServlet {
            public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     response.sendRedirect("landlordlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
         String password = request.getParameter("password");
         Date d1 = new Date();
         System.out.println(d1);
         
         userLogin user = new userLogin();
         userLoginTime user1 = new userLoginTime();
         
         user.setMailid(mailid);
         user1.setMailid(mailid);
         user.setPassword(password);
         user1.setLogin(d1);
         
         loginAuthenticatior authenticator = new loginAuthenticatior();
         boolean login = authenticator.isLogin(user);
         boolean loginTime = authenticator.isLoginTime(user1);
         System.out.println(loginTime);
    if(login){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("ServicesPage.jsp");
    }
      else if(loginTime)
    {
        HttpSession session=request.getSession(true);
        session.setAttribute("d1", d1);
        response.sendRedirect("ServicesPage.jsp");
    }
    else
    {
        response.sendRedirect("landlordlogin.jsp");
    }
}
}
