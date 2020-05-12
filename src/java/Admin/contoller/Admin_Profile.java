/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.contoller;

import Admin.dataAccess.Admin_DataAccess;
import Admin.model.Admin_Model;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author kebre
 */
@WebServlet(name = "Admin_Profile", urlPatterns = {"/Admin_Profile"})
public class Admin_Profile extends HttpServlet {

    
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("admin");
        
        PrintWriter out = response.getWriter();
        //out.print(username);
        Admin_DataAccess access = new Admin_DataAccess();
        List<Admin_Model> details = access.admin_profile(username);
        
        //out.print(details);
        
        HttpSession session1 = request.getSession();
        session1.setAttribute("details", details);
        
        getServletContext().getRequestDispatcher("/adminProfile.jsp").forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }


}
