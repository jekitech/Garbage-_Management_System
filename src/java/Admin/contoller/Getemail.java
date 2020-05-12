/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.contoller;

import Admin.dataAccess.Admin_DataAccess;
import User.UserModel;
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
@WebServlet(name = "Getemail", urlPatterns = {"/Getemail"})
public class Getemail extends HttpServlet {

   
   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String username = request.getParameter("username");
        PrintWriter out = response.getWriter();
        //out.print(id);
        Admin_DataAccess access = new Admin_DataAccess();
        List<UserModel> details = access.getEmail(username);
        out.print(details);
        HttpSession session = request.getSession();
        session.setAttribute("details", details);
        
        getServletContext().getRequestDispatcher("/email.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   

}
