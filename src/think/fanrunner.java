package think;

public class fanrunner 
{
	public static void main(String args[])
	{
		fan f = new fan(1,"red");
		f.start(); 
	    f.setPrice(1);
		System.out.println(f.getPrice());
		f.setColor("red");
		System.out.println(f.getColor());
	}

}
