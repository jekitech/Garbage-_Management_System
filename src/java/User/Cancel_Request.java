/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kebre
 */
@WebServlet(name = "Cancel_Request", urlPatterns = {"/Cancel_Request"})
public class Cancel_Request extends HttpServlet {

    
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
        //out.print(id);
        User_DataAccess access = new User_DataAccess();
        access.del(id);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/requests.jsp");
        dispatcher.forward(request, response);
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }


}
