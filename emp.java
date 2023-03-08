package Demo;
//create a class by name Employeee with following details:

//id,name, experience,place and salary
//1.read the data from user to store the details
//2.Create an array of 5 mem
//3.display the details of employee
//4.display the details of the employee with highest salary
import java.util.Scanner;

class employe
{
	int id;
	String name;
	int Exp ;
	String place;
	int sal;
	employe e[]=new employe[5];
	void read_data()
	{
		Scanner s =new Scanner(System.in);
		
	
		System.out.println("Enter the Employee id");
		id=s.nextInt();
		System.out.println("Enter the Employee name");
		name=s.next();
		System.out.println("Enter the Employee exp");
		Exp=s.nextInt();
		System.out.println("Enter the Employee place");
		place=s.next();
		System.out.println("Enter the Employee sal");
	sal=s.nextInt();
		
	}

	
	void dis()
	{
		
			System.out.println("Name:"+name);
			System.out.println("id:"+id);
			System.out.println("EXp"+Exp);
			System.out.println("place"+place);
			System.out.println("sal"+sal);
		
		
	}
}

public class emp {
	public static void main (String args[])
	{
		int i;
		employe e[]=new employe[5];
		for(i=0;i<=4;i++)
		{
			e[i]=new employe();
			System.out.println("Enter the Employee details"+(i+1));
			System.out.println("-------------------------------------");
			e[i].read_data();
		}
		System.out.println(" the Employee details");
		System.out.println("-------------------------------------");
		for(i=0;i<=4;i++)
		{
			System.out.println("Details of the Employee"+(i+1));
			System.out.println("==========================================");
			e[i].dis();
		}
		//in this the data will be display the all at a time after the reading of the data done 
 // now we are checking highest salary of 4 members
   System.out.println("Employee details with max salary");
   System.out.println("++++++++++++++++++++++++++");  
   int maxii=0;
      for(i=0;i<=4;i++)
   {
	   if(e[i].sal>e[maxii].sal) 
		   maxii=i;
	   
   }
   e[maxii].dis();
	
		
	}
	
}
