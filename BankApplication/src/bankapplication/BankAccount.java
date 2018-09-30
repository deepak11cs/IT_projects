package bankapplication;

import static java.lang.Math.abs;
import java.util.Random;


public class BankAccount {
    private float balance;
    private String name;
    private String accountno;
 
    BankAccount(){
        balance=0;
        accountno=null;
    }

    public BankAccount(float balance, String name) {
        this.balance = balance;
        this.name = name;
        accountno= getaccountno();
        System.out.println(name+" your account with accountno. "+accountno+" has been successfully created ...");
    }

    public String getName() {
        return name;
    }

  
    public void setName(String name) {
        this.name = name;
    }
    float deposit(float amount){
        if(amount>0){
            float tax=taxDeduction(amount);
            amount-=tax;
            balance+=amount;
        }
        else{
            System.out.println("Please enter a valid value");
        }
        return balance;
    }
    float withdraw(float amount){
        if(amount>balance){
            System.out.println("only "+balance+" rupees are available in your accoount no. "+accountno);
        }
        else{
            balance-=amount;
        }
        return balance;
    }
    String getaccountno(){
        if(accountno==null){
            accountno=generateAccountNo();
        }
        return accountno;
    }
    String generateAccountNo(){
        String accno=new String();
        Random random=new Random();
        
            accno+="ACCN"+abs(random.nextInt());
        
        return accno;
    }
    float getBalance(){
        return balance;
    }
    float taxDeduction(float amount){
        if(amount<100000){
            return 0;
        }
        else if(amount<200000){
            return (0.1f * amount);
        }
        else {
            return (0.2f * amount);
        }
    }
}
