/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userShow;
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
@WebServlet(name = "showChecker1823", urlPatterns = {"/showChecker1823"})
public class showChecker1823 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("home.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
                  String id = request.getParameter("occupier_id");
                  String lid = request.getParameter("landlord_id");
                  String firstname = request.getParameter("first_name");
                  String  lastname = request.getParameter("last_name");
                  String  mailid = request.getParameter("email_id");
                  String Oname = request.getParameter("Oname");
                  String Oaddress = request.getParameter("Oaddress");
                  String age = request.getParameter("age");
                  String dob = request.getParameter("dob");
                  String Mexpectation = request.getParameter("Mexpectation");
                  String demand = request.getParameter("demands");
                  String address = request.getParameter("address");
                  String address2 = request.getParameter("address2");
                  String city = request.getParameter("city");
                  String state = request.getParameter("state");
                  String zipcode = request.getParameter("zipcode");
                  String phoneNo = request.getParameter("phone_no");
                 userShow user1 = new userShow();
                 HttpSession session=request.getSession(true);
                      session.setAttribute("landlord_id",lid);
                      session.setAttribute("email_id",mailid);
                 
}
}
