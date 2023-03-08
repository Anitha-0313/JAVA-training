
// create a class by name Employeee with following details:

//id,name, experience,place and salary
//1.read the data from user to store the details
//2.Create an array of 5 mem
//3.display the details of employee

//in this code we display single one display one by one display here
package Demo;
import java.util.Scanner;
class employee
{
	int id;
	String name;
	int Exp ;
	String place;
	float sal;
	void read_data()
	{
		Scanner sc =new Scanner(System.in);
		employee e[]=new employee[5];
		for(int i=0;i<=4;i++)
		{
		e[i]=new employee();
		System.out.println("Enter the Employee details"+(i+1));
		System.out.println("-------------------------------------");
		System.out.println("Enter the Employee id");
		e[i].id=sc.nextInt();
		System.out.println("Enter the Employee name");
		e[i].name=sc.next();
		System.out.println("Enter the Employee exp");
		e[i].Exp=sc.nextInt();
		System.out.println("Enter the Employee place");
		e[i].place=sc.next();
		System.out.println("Enter the Employee sal");
		e[i].sal=sc.nextFloat();
		e[i].dis();
	}
}
	void dis()
	{
		System.out.println("Employee details are");
		
			System.out.println("==========================================");
			System.out.println("Name:"+name);
			System.out.println("id:"+id);
			System.out.println("EXp"+Exp);
			System.out.println("place"+place);
			System.out.println("sal"+sal);
		
		
	}
}
public class em {
	public static void main (String args[])
	{
		employee ob=new employee();
		ob.read_data();
		
	}
}


