package Demo;
//create a class by name Employeee with following details:

//id,name, experience,place and salary
//1.read the data from user to store the details
// create using constructor
//this is the same code as  the data but using the constructor here
//this is other version of employee data


import java.util.Scanner;

class empp

{
	int id;
	String name;
	int Exp ;
	String place;
	int sal;
	empp(int id,String name,int Exp,String place,int sal)
	{
		this.id=id;
		this .name=name;
		this.Exp=Exp;
		this.place=place;
		this.sal=sal;
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
public class conemp{
	public static void main(String args[]) {
		int i;
		empp e[]=new empp[5];
		for(i=0;i<=4;i++)
		{
			Scanner s =new Scanner(System.in);
			
			
			System.out.println("Enter the Employee id");
			 int id=s.nextInt();
			System.out.println("Enter the Employee name");
			String name=s.next();
			System.out.println("Enter the Employee exp");
			int Exp=s.nextInt();
			System.out.println("Enter the Employee place");
			String place=s.next();
			System.out.println("Enter the Employee sal");
		 int sal=s.nextInt();
		 e[i]=new empp(id, name,Exp, place, sal);
		}
		System.out.println(" the Employee details");
		System.out.println("-------------------------------------");
		for(i=0;i<=4;i++)
		{System.out.println("Details of the Employee"+(i+1));
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

