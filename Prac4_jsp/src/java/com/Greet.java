/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author dev
 */
public class Greet extends SimpleTagSupport {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void doTag() throws JspException, IOException {
        //super.doTag(); //To change body of generated methods, choose Tools | Templates.
        SimpleDateFormat formatter=new SimpleDateFormat("HH:mm:ss");
        Date d=new Date();
        JspWriter out=getJspContext().getOut();
        String s=formatter.format(d);
        //out.println(formatter.format(d));
        String ar[]=s.split(":");
        int h=Integer.parseInt(ar[0]);
        if(h>=5 && h<12){
            out.print("good morning ");
        }
        else if(h>=12 && h<17){
            out.print("good afternoon ");
        }
        else if(h>=17 && h<=21){
            out.print("good evening ");
        }
        else{
            out.print("good night ");
        }
        out.println(name);
    }
}
