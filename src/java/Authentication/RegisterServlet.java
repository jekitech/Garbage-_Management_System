/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authentication;

import User.UserModel;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author kebre
 */
@WebServlet(name = "RegisterServlet", urlPatterns = {"/RegisterServlet"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,maxFileSize = 1024 * 1024 * 10,maxRequestSize = 1024 * 1024 * 50)
public class RegisterServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        try {
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            //String desc = request.getParameter("desc");
            String username = request.getParameter("username");
            String residence = request.getParameter("residence");
            //Date dob = Date.valueOf(request.getParameter("dob"));
            String email = request.getParameter("email");
            String mobile = request.getParameter("mobile");
            //String image = request.getParameter("image");
            String password = request.getParameter("password");
            //String userid = request.getParameter("id");
            String county = request.getParameter("nationality");
            
            MessageDigest alg = MessageDigest.getInstance("MD5");
            //alg.reset();
            alg.update(password.getBytes());
            
            byte[] digest = alg.digest();
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i< digest.length;i++){
                sb.append(Integer.toString((digest[i] & 0xff)+ 0x100,16).substring(1));
            }
            String hashed = sb.toString();
            
            Part part = request.getPart("image");
            String filename = extractFileName(part);
            String savepath = "C:\\Users\\kebre\\Documents\\NetBeansProjects\\Garbage Management System\\web\\img\\" + File.separator + filename;
            File filesaveDir = new File(savepath);
            
            part.write(savepath + File.separator);
            
            PrintWriter out = response.getWriter();
            //out.print(fname+" "+lname+" "+desc+" "+county+" "+dob+" "+email+" "+mobile+" "+image+" "+username+" "+residence+" "+password+" "+userid);
            UserModel model = new UserModel(username, fname, lname, filename, hashed, residence, mobile, email, county);
            Login reg = new Login();
            reg.register(model);
            
            String url = "/register.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegisterServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    private String extractFileName(Part part){
        
        String contentDisp = part.getHeader("content-disposition");
        String items[] = contentDisp.split(";");
        for(String s: items){
            if(s.trim().startsWith("filename")){
                return s.substring(s.indexOf("=") + 2,s.length()-1);
            }
             
        }
        return "";
    }

}
