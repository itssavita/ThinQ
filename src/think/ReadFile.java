package think;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 

public class ReadFile 
{
	public static void main(String[] args) 
	{
		try 
		{
			File fr = new File("f:\\file.txt");
			Scanner myReader = new Scanner(fr);
			while (myReader.hasNextLine()) 
			{
				String data = myReader.nextLine();
				System.out.println(data);
			}
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}