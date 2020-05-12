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
@WebServlet(name = "Get_Users", urlPatterns = {"/Get_Users"})
public class Get_Users extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Admin_DataAccess access = new Admin_DataAccess();
        List<UserModel> users = access.getUsers();
        
        PrintWriter out = response.getWriter();
        out.print(users);
        HttpSession session = request.getSession();
        session.setAttribute("users", users);
        
        getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
