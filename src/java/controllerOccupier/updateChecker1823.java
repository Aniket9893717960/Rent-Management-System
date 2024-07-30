/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerOccupier;

import dtb.occupier.userUpdate;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.occupier.updateAuthenticator1823;

/**
 *
 * @author INDIA
 */
@WebServlet(name = "updateChecker1823", urlPatterns = {"/updateChecker1823"})
public class updateChecker1823 extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.sendRedirect("login18-22.jsp");
}
public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
                   String id = request.getParameter("occupier_id");
                  String firstname = request.getParameter("first_name");
        String lastname = request.getParameter("last_name");
        String Oname = request.getParameter("Oname");
        String Oaddress = request.getParameter("Oaddress");
        String age = request.getParameter("age");
        String dob = request.getParameter("dob");
        String Mexpectation = request.getParameter("Mexpectation");
        String demand = request.getParameter("demand");
        String address= request.getParameter("address");
        String address2 = request.getParameter("address2");
        String zipcode = request.getParameter("zipcode");
        String phoneNo=request.getParameter("phoneNo");
        
                 userUpdate user1 = new userUpdate();
                 
                 
           user1.setId(id);                 
                 user1.setFirstname(firstname);
         user1.setLastname(lastname);
         user1.setOname(Oname);
         user1.setOaddress(Oaddress);
         user1.setAge(age);
         user1.setDob(dob);
         user1.setMexceptation(Mexpectation);
         user1.setDemand(demand);
         user1.setAddress(address);
         user1.setAddress2(address2);
         user1.setZipcode(zipcode);
         user1.setPhoneNo(phoneNo);
         
         updateAuthenticator1823 uauthenticator = new updateAuthenticator1823();
         boolean update = uauthenticator.isUpdate(user1);
         
          if(update){
        HttpSession session=request.getSession(true);
        session.setAttribute("occupier_id",id);
        response.sendRedirect("occupierprofile23-30.jsp");
    }
    else
    {
        response.sendRedirect("occuierupdate23-30.jsp");
    }
}         
}