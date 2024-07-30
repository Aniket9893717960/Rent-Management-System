/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userPreviousDeletePage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "PreviousDeleteChecker", urlPatterns = {"/PreviousDeleteChecker"})
public class PreviousDeleteChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("landlordlogin.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    String mailid = request.getParameter("mailid");
         String password = request.getParameter("password");
         
          HttpSession session = request.getSession(true);//By this oommand we havee to enable session
        /*session object is behave like a global object
         by this we have to access every page or data of the webApplication TestSession*/
        session.setAttribute("mailid",mailid);
         session.setAttribute("password",password);
         
         System.out.println(session.getId());/*by session.getId() we have to see session ID 
         this method print session id into consol screen */
         userPreviousDeletePage user = new userPreviousDeletePage();
         
         user.setMailid(mailid);
         user.setPassword(password); 
}}
