
// in this we are performing the the student data in the class and the object here
package Demo;
class student{
	String name;
	int id;
	float marks;
	void dis()
	{
		System.out.println("name:"+name);
		System.out.println("id:"+id);
		System.out.println("marks:"+marks);
	}
}
public class classob {
	public static void main(String args[]) {
		student s=new student();
		s.name="Ani";
		s.id=03;
		s.marks=13.0f;//for float f is mandatory
		s.dis();
		student s2=s;//assiging s to s2 
		//now s2 and s pointing to the same location 
		System.out.println("==============");
		s2.dis();
	}
	
	

}
