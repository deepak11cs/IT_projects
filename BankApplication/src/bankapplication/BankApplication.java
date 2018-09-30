/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

/**
 *
 * @author dev
 */
import java.util.Scanner;


public class BankApplication {

    static BankAccount b=new BankAccount();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan;
        System.out.println("your account no. is "+b.getaccountno());
        char ch='y';
        while(ch!='n'){
            System.out.println("a. deposit\nb. withdraw\nc. balance\nn. exit");
            scan=new Scanner(System.in);
            ch=scan.nextLine().charAt(0);
            if(ch=='a'){
                float am;
                System.out.println("enter amount to deposit : ");
                scan=new Scanner(System.in);
                am=scan.nextFloat();
                b.deposit(am);
            }
            else if(ch=='b'){
                float am;
                System.out.println("enter amount to withdraw : ");
                scan=new Scanner(System.in);
                am=scan.nextFloat();
                b.withdraw(am);
            }
            else if(ch=='c'){
                System.out.println("Balance in your account "+b.getaccountno()+" is "+b.getBalance()+" rupees");
            }
        }
    }
    
}
