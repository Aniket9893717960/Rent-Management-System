/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userLogin;
import dtb.occupier.userLoginTime;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.occupier.loginAuthenticator1823;


@WebServlet(name = "loginChecker1823", urlPatterns = {"/loginChecker1823"})
public class loginChecker1823 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("occupierlogin18-22.jsp");
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
         
         loginAuthenticator1823 authenticator = new loginAuthenticator1823();
         boolean login = authenticator.isLogin(user);
         boolean loginTime = authenticator.isLoginTime(user1);
         System.out.println(loginTime);
    if(login){
        HttpSession session=request.getSession(true);
        session.setAttribute("mailid",mailid);
        response.sendRedirect("occupierServicesPage.jsp");
    }
    else
    {
        response.sendRedirect("occupierlogin18-22.jsp");
    }
}
}