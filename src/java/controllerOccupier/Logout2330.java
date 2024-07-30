/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userLogoutTime;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.occupier.LogoutAuthenticator;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "Logout2330", urlPatterns = {"/Logout2330"})
public class Logout2330 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("occupierlogin23-30.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        String lid = request.getParameter("lid");
        String mailid =  request.getParameter("mailid");
         Cookie cookies[] = request.getCookies();
        for (int idx = 0; idx < cookies.length; idx++) 
        {       
                mailid = cookies[idx].getValue();
               System.out.println(cookies[idx].getName()+" = "+cookies[idx].getValue());
        }
         Date d1 = new Date();
         Date d2;
         System.out.println(d1);
         
         userLogoutTime user1 = new userLogoutTime();
         user1.getLid();
         user1.getMailid();
         user1.getLogout();
         user1.getLogin();
         
         LogoutAuthenticator outAuthenticator = new LogoutAuthenticator();
         boolean logout = outAuthenticator.isLogoutTime(user1);
         
          if(logout){
        HttpSession session=request.getSession(true);
        session.setAttribute("landlord_id",lid);
        session.setAttribute("mailid",mailid);
        request.getSession().invalidate();
        response.sendRedirect("home.jsp");
          }
    else
    {
        response.sendRedirect("gethome.jsp");
    }
}
}
