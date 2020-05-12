/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
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
@WebServlet(name = "Edit_Request", urlPatterns = {"/Edit_Request"})
public class Edit_Request extends HttpServlet {

   
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
       
        User_DataAccess access = new User_DataAccess();
        List<RequestModel> list = access.edit_requests(id);
        out.print(list);
        HttpSession session = request.getSession();
        session.setAttribute("list", list);
        
        HttpSession session2 = request.getSession();
        session2.setAttribute("getAlert", "Yes");
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/edit_request.jsp");
        dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
