package think;
///progam for planet;;
public class prog2 
{
	 
	private String name; 
	prog2()
	{
	    System.out.println("hello");
	    
	}  
	prog2(String name)
	{
	    	this.name = name;
	    
	}
	public String setname(String name)
	{
		this.name = name;
		return name;
	}
	public String getname()
	{
	    return name;
	}
	 
	public static void main(String args[])
	{  
	    prog2 p1 =new prog2(); 
	    System.out.println(p1);
	    prog2 p2 =new prog2(); 
	    p2.setname("sun");
		System.out.println(p2);
		System.out.println(p2.getname());
	    
	}  
} 

