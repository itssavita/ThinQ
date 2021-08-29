package think;

import java.util.Scanner;

public class bankacc_runner 
{
	public static void main(String args[])
	{
        Scanner s=new Scanner(System.in);
        Current cr=new Current();
        cr.getdata();
        cr.putdata();
        cr.deposit1();
        cr.withdraw();
        Saving sr=new Saving();
        sr.getdata();
        sr.putdata();
        sr.withdraw1();
	}

}
