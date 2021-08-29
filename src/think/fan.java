package think;

public class fan 
{
	private int price;
	private String color;
	
	fan(int price,String color)
	{
		this.price = price;
		this.color = color;
	}
	
	void start()
	{
		System.out.println("fan is working");
		
	}

	public int getPrice() 
	{
		return price;
	}

	public void setPrice(int price) 
	{
		this.price = price;
	}

	public String getColor() 
	{
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
