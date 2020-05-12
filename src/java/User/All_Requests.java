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
@WebServlet(name = "All_Requests", urlPatterns = {"/All_Requests"})
public class All_Requests extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        HttpSession session = request.getSession();
        String name =(String) session.getAttribute("userid");
        
        PrintWriter out = response.getWriter();
        //out.print(name);
        User_DataAccess access = new User_DataAccess();
        List<RequestModel>show = access.all_requests(name);
        
        List<UserModel> details = access.user_profile(name);
        
        String url = "/requests.jsp";
        HttpSession session1 = request.getSession();
        session1.setAttribute("show", show);
        
        HttpSession sess = request.getSession();
        sess.setAttribute("details", details);
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   

}
