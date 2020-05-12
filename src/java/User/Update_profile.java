/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author kebre
 */
@WebServlet(name = "Update_profile", urlPatterns = {"/Update_profile"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,maxFileSize = 1024 * 1024 * 10,maxRequestSize = 1024 * 1024 * 50)
public class Update_profile extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession sess = request.getSession();
        String name = (String)sess.getAttribute("userid");
        
        String id = request.getParameter("id");
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
        
        Part part = request.getPart("image");
        String filename = extractFileName(part);
        String savepath = "C:\\Users\\kebre\\Documents\\NetBeansProjects\\Garbage Management System\\web\\img\\" + File.separator + filename;
        File filesaveDir = new File(savepath);
        
        part.write(savepath + File.separator);
        
        PrintWriter out = response.getWriter();
        //out.print(filename);
        UserModel model = new UserModel(username, fname, lname, filename, password, residence, mobile, email, county);
        User_DataAccess access = new User_DataAccess();
        
        access.update_profile(model,id);
        
        String url = "/profile.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
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
