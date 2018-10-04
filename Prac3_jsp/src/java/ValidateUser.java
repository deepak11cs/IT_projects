
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dev
 */
public class ValidateUser implements Serializable{
    //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
    //Date date = new Date();  
    //System.out.println(formatter.format(date));
    String name;
    Date dob;
    String email;
    int luckyno;
    String favfood;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLuckyno() {
        return luckyno;
    }

    public void setLuckyno(int luckyno) {
        this.luckyno = luckyno;
    }

    public String getFavfood() {
        return favfood;
    }

    public void setFavfood(String favfood) {
        this.favfood = favfood;
    }
    
    public int validate(String name,Date dob,String email,int luckyno,String favfood){
        return 0;
    }
}
