/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapplication;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dev
 */
public class MultipleAccounts {
    
    public static void main(String args[]){
        MultipleAccountManager manager=new MultipleAccountManager();
        Scanner scan;
        char ch;
        Scanner sc;
        do{
            System.out.println("a.add account\nb.deposit amount\nc.withdraw amount\nd.find account by name\ne.account status\nf.display all accounts\npress anything else to exit");
            scan=new Scanner(System.in);
            ch=scan.nextLine().charAt(0);
            switch(ch){
                case 'a':
                    
                    System.out.println("enter accountholder name : ");
                    sc=new Scanner(System.in);
                    String name=sc.nextLine();
                    System.out.println("enter starting balance : ");
                    float bal=sc.nextFloat();
                    manager.addAccount(name, bal);
                    break;
                case 'b':
                    System.out.println("enter account no : ");
                    sc=new Scanner(System.in);
                    String acc=sc.nextLine();
                    System.out.println("enter amount to deposit : ");
                    float amt=sc.nextFloat();
                    manager.addToAccount(acc, amt);
                    break;
                case 'c':
                    System.out.println("enter account no : ");
                    sc=new Scanner(System.in);
                    acc=sc.nextLine();
                    System.out.println("enter amount to withdraw : ");
                    amt=sc.nextFloat();
                    manager.withdrawFromAccount(acc, amt);
                    break;
                case 'd':
                    System.out.println("enter name of accountholder : ");
                    sc=new Scanner(System.in);
                    name=sc.nextLine();
                    ArrayList<BankAccount> a=new ArrayList<>();
                    a=manager.getAccountByName(name);
                    for(int i=0;i<a.size();++i){
                        System.out.println("\nName : "+a.get(i).getName()+"\naccount no. : "+a.get(i).getaccountno()+"\nbalance : "+a.get(i).getBalance());
                    }
                    break;
                case 'e':
                    System.out.println("enter account no. : ");
                    sc=new Scanner(System.in);
                    acc=sc.nextLine();
                    manager.getAccountDetails(acc);
                    break;
                case 'f':
                        
                    manager.displayAll();
                    break;
                default:
                    ch='n';
            }
        }while(ch!='n');
    }
}
