import java.util.ArrayList; 
import java.util.Scanner;
public class ArrayLis {
	@SuppressWarnings("resource")
	public static void main(String args[]){ 
		try{
		Scanner s=new Scanner(System.in);
		ArrayList<String> names=new ArrayList<String>();
		int choice;
		do{
		System.out.println("1.View");
		System.out.println("2.Add");
		System.out.println("3.Remove");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");		
		choice=s.nextInt();
		if(choice==2)
		{
		System.out.println("Enter how many elements you want to enter");
		int n=s.nextInt();
		System.out.println("Enter the names one by one");
		String str;
		int i=1;
		do
		{
		str=s.next();
		names.add(str);
		i++;
		}while(i<=n);
		}
		if(choice==1)
		{	System.out.println("Values inside arraylist are");
			for(String st:names)
		{
		System.out.println(st);
		}
			System.out.println("\n");
		}
		if(choice==3)
		{	System.out.println("Enter the value you want remove");
		String str=s.next();
		names.remove(str);
		System.out.println("Selected value is removed");
		}
		if(choice==4)
		{
		System.out.println("Bye");
		}
		}while(choice<4);
		}catch(Exception e)
		{
		System.out.println("Exception occured");

		System.out.println("Line added for testing");
		System.out.println("Line added for bug by jana");
		}
		}
		}
		