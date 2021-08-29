package think;

public class car extends auto
{
	private String color;
	car(String product)
	{
		super(product);
		this.color="black";
	}
	car(String product,String color)
	{
		super(product);
		this.color = color;
	}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	
}
