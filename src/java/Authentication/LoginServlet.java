/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String radio_button = request.getParameter("sample-radio");
            MessageDigest alg = MessageDigest.getInstance("MD5");
            //alg.reset();
            alg.update(password.getBytes());
            
            byte[] digest = alg.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i< digest.length;i++){
                sb.append(Integer.toString((digest[i] & 0xff)+ 0x100,16).substring(1));
            }
            String hashed = sb.toString();
            
            PrintWriter out = response.getWriter();
            //out.print(useid+""+password+""+radio_button);
            
            Login log = new Login();
            
            
            if(radio_button.equals("1")){
                
                try {
                    Boolean authenticate = log.auth(username, hashed, "user_details");
                    out.print(authenticate);
                    if(authenticate == true){
                        
                        HttpSession session = request.getSession();
                        session.setAttribute("userid", username);
                        String url = "/index.jsp";
                        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                        dispatcher.forward(request, response);
                    }else{
                        out.print("Wrong");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                //out.print(radio_button);
                try {
                    
                    Boolean authenticate = log.auth(username, hashed, "admin");
                    
                    if(authenticate== true){
                        
                        HttpSession session = request.getSession();
                        session.setAttribute("admin", username);
                        String url = "/admin_dashboard.jsp";
                        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
                        dispatcher.forward(request, response);
                        
                    }
                    else{
                        out.print("Wrong");
                    }
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                
            }} catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
    }

}
