package think;
import java.util.*;
import java.io.*;
public class bankacc 
{
	
	 	Scanner s=new Scanner(System.in);
	    String name;
	    int accno;
	    void getdata()
	    {
	        System.out.println("enter name \n");
	        name=s.next();
	        System.out.println("enter account no \n");
	        accno=s.nextInt();
	    }
	    void putdata()
	    {
	        System.out.println("name is::"+name);
	        System.out.println("accno is::"+accno);
	    }
}

class Current extends bankacc
{
	int balance;
    void deposit1()
    {
        
        System.out.println("enter balance \n");
        balance=s.nextInt();
        int interest;
        System.out.println("enter interest \n");
        interest=s.nextInt();
        balance=balance+interest;
    }
    void withdraw()
    {
        int withdraw_amt;
        System.out.println("enter withdraw_amt");
        withdraw_amt=s.nextInt();
        balance=balance-withdraw_amt;
        if(withdraw_amt>balance)
        {
            //balance=balance+withdraw_amt;
            System.out.println("You can withdraw");
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
    
}


class Saving extends bankacc 
{
    void deposit1()
    {
        int balance;
        System.out.println("enter balance");
        balance=s.nextInt();
    }
    void withdraw1()
    {
        int withdraw_amt1,saving1;
        System.out.println("enter withdraw_amt");
        withdraw_amt1=s.nextInt();
        System.out.println("enter saving");
        saving1=s.nextInt();
        saving1=saving1-withdraw_amt1;
        if(withdraw_amt1>saving1)
        {
            //saving1=saving1+withdraw_amt1;
            System.out.println("you can withdraw");
        }
        else
        {
            System.out.println("you cannot withdraw");
        }
    }
}
