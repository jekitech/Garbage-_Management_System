/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.contoller;

import Admin.dataAccess.EmailUtility;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kebre
 */
@WebServlet(name = "EmailSending", urlPatterns = {"/EmailSending"})
public class EmailSending extends HttpServlet {
    
    private String host = "smtp.gmail.com";
    private String port = "587";
    private String user = "jekithetech@gmail.com";
    private String pass = "kevtech123";
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String recipient = request.getParameter("recipient");
        String subject = request.getParameter("subject");
        String content = request.getParameter("content");
        
        String resultMessage = "";
        try {
            EmailUtility.sendMail(host, port, user, pass, recipient, subject, content);
            resultMessage = "The e-mail was sent successfully";
        } catch (Exception e) {
            e.printStackTrace();
            resultMessage = "There was an error: "+ e.getMessage();
        }finally{
            request.setAttribute("message", resultMessage);
            getServletContext().getRequestDispatcher("/email.jsp").forward(request, response);
        }
        
    }


}
