/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.landlord;

import dtb.landlord.userlandlordServices;
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
@WebServlet(name = "landlordServices", urlPatterns = {"/landlordServices"})
public class landlordServicesChecker extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("gethome.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
                  String firstname = request.getParameter("first_name");
                  String lastname = request.getParameter("last_name");
                  String email_id = request.getParameter("email_id");
                  String demand = request.getParameter("demand");
                  String address = request.getParameter("address");
                  String zipcode = request.getParameter("zipcode");
                  String city = request.getParameter("city");
                  
                  userlandlordServices user1 = new userlandlordServices();
                 
                  HttpSession session=request.getSession(true);
                  session.setAttribute("first_name",firstname);
                  session.setAttribute("last_name",lastname);
                  session.setAttribute("email_id",email_id);
                  session.setAttribute("demand",demand);
                  session.setAttribute("zipcode",zipcode);
                  session.setAttribute("address",address);
}
}