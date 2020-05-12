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
@WebServlet(name = "UpdateRequest", urlPatterns = {"/UpdateRequest"})
public class UpdateRequest extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String location = request.getParameter("location");
        String description = request.getParameter("editor1");
        int id = Integer.parseInt(request.getParameter("id"));
        
        PrintWriter out = response.getWriter();
        //out.print(location+""+description+""+id);
        RequestModel model = new RequestModel(location, description);
        User_DataAccess access = new User_DataAccess();
        
        access.update_request(model, id);
        String url = "/edit_request.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
    }

    
}
