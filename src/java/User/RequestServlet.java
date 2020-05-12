/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
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
@WebServlet(name = "RequestServlet", urlPatterns = {"/RequestServlet"})
public class RequestServlet extends HttpServlet {

   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        out.print("Hello");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //Date date = Date.valueOf(request.getParameter("date"));
        String desc = request.getParameter("editor1");
        
        String str = "2020-03-13";
        Date collection_date = Date.valueOf(str);
        //Date collection_date = new Date(99+21, 02, 11);
        HttpSession session = request.getSession();
        String name =(String) session.getAttribute("userid");
        
        String radio = request.getParameter("radio");
        PrintWriter out = response.getWriter();
        
        int status = 0;
        //out.print(collection_date);
        //check if the radio button clicked is for the current residence
        
        if(radio.equals("1")){
            
            User_DataAccess access = new User_DataAccess();
            String location = access.User_residence(name);
            //out.print(location);
            RequestModel model = new RequestModel(name, location, desc,collection_date,status);
            Boolean s = access.make_request(model);
             //out.print(s);
             
             if(s == true){
                 HttpSession session2 = request.getSession();
                 session2.setAttribute("getAlert", "Yes");
                 //session2.setMaxInactiveInterval(1);
             }
             //initialize a random variable
            
//            if(session2 != null){
//                session2.setMaxInactiveInterval(1);
//            }
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/make_request.jsp");
            dispatcher.forward(request, response);
        }
       
        
    }

   

}
