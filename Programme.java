import java.util.Scanner;
import java.io.IOException;


public class Programme {	
	public static void main(String args[])  throws Exception{
		Scanner sc = new Scanner(System.in);
		String x,y; 
		Constellation c = new Constellation();

		System.out.println("Enter the name of the hemisphere (North/South): ");
		x = sc.nextLine();
		c.setType(x);
		c.showConstList();

		System.out.println("Enter the name of the constellation: ");
		y = sc.nextLine();
		c.setName(y);
		c.openFile();
	} 
}
