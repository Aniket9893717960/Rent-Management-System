/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import dtb.admin.adminShow;
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
@WebServlet(name = "showChecker", urlPatterns = {"/showChecker"})
public class AshowChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login18-22.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
                  String id = request.getParameter("admin_id");
                  String firstname = request.getParameter("first_name");
                  String  lastname = request.getParameter("last_name");
                  String  mailid = request.getParameter("email_id");
                  String placeholder = request.getParameter("placeholder");
                 adminShow user1 = new adminShow();
                 
                 
}
}
