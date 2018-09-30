/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author dev
 */
public class PatternServlet extends HttpServlet {

    PrintWriter out;
    boolean flag=true;
    //int i;

   
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.service(req, resp);
        int i=0;
        out=resp.getWriter();
        try{
            i=Integer.parseInt(req.getParameter("num"));
        }
        catch(NumberFormatException e){
            flag=false;
        }
        
        if(flag){
            for(int x=0;x<i;++x){
                for(int y=0;y<=x;++y){
                    out.print((y+1)+" ");
                }
                out.println("");
            }
        }
        else{
            out.println("please enter a valid numeric input");
        }
    }
}
