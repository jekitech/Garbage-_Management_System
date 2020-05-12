/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.contoller;

import Admin.dataAccess.Admin_DataAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
@WebServlet(name = "UpdateDate", urlPatterns = {"/UpdateDate"})
public class UpdateDate extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
        //out.print(id);
        HttpSession session = request.getSession();
        session.setAttribute("id", id);
        String url = "/updatedate.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String id = request.getParameter("id");
        Date date1 =Date.valueOf(request.getParameter("date"));
        PrintWriter out = response.getWriter();
        //out.print(id+" "+date1);
        Admin_DataAccess access = new Admin_DataAccess();
        access.update_date(date1, id);
        
        HttpSession session = request.getSession();
        session.setAttribute("getalert", "Yes"); //initialize a random variable
        
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/updatedate.jsp");
        dispatcher.forward(request, response);
    }

   

}
