/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author dev
 */
public class Reverse extends SimpleTagSupport {
    String input;

    public void setInput(String input) {
        this.input = input;
    }

    

    @Override
    public void doTag() throws JspException, IOException {
        //super.doTag(); //To change body of generated methods, choose Tools | Templates.
        JspWriter out=getJspContext().getOut();
        String rev = "";
        int len = input.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + input.charAt(i);
        }
        out.println("Reverse of Given String is :");
        out.println(" " + rev);
    }
    
    
    
}
