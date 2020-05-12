/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin.contoller;

import Admin.dataAccess.Admin_DataAccess;
import Admin.model.Admin_Model;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
@WebServlet(name = "RegisterAdmin", urlPatterns = {"/RegisterAdmin"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,maxFileSize = 1024 * 1024 * 10,maxRequestSize = 1024 * 1024 * 50)
public class RegisterAdmin extends HttpServlet {

    

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            String name = request.getParameter("name");
            String id = request.getParameter("idno");
            String username = request.getParameter("username");
            String mobile = request.getParameter("mobile");
            String staff = request.getParameter("staff");
            String password = request.getParameter("password");
            
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
            String filename = extract(part);
            
            String savepath = "C:\\Users\\kebre\\Documents\\NetBeansProjects\\Garbage Management System\\web\\img\\" + File.separator + filename;
            File filesaveDir = new File(savepath);
            
            part.write(savepath + File.separator);
            
            Admin_Model model = new Admin_Model(id, name, username, staff, hashed, filename, Integer.parseInt(mobile));
            Admin_DataAccess access = new Admin_DataAccess();
            access.register(model);
            
            String url = "/registeradmin.jsp";
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request, response);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegisterAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
   private String extract(Part part){
       
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
