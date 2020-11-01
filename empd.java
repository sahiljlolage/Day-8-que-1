import java.util.Scanner;
 class empdemo
{
	String name;
	int age;
	double salary;
	String designation;
	
	void getdata()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name ");
		name=sc.nextLine();
		System.out.println("Enter employee age ");
		age=sc.nextInt();
		System.out.println("Enter employee salary ");
		salary=sc.nextDouble();
		System.out.println("Enter employee designation ");
		designation=sc.next();
		
	}
	
	void displaydata()
	{
		System.out.println(" employee name "+name);
		System.out.println(" employee age "+age);
		System.out.println(" employee salary "+salary);
		System.out.println(" employee designation "+designation);
		
	}	
	
		
	
}
 class empd extends empdemo
{
	public static void main(String args[])
		{
			Scanner s=new Scanner(System.in);
			int n;
			System.out.println("How many employee details you want :");
			n=s.nextInt();
			empd ed=new empd();
			for(int i=0;i<n;i++)
			{
			ed.getdata();
			}
			for(int i=0;i<n;i++)
			{
			ed.displaydata();
			}
		}	
	
	
	
}

/*output :

E:\prac>javac empd.java

E:\prac>java empd
How many employee details y
2
Enter employee name
sahil
Enter employee age
23
Enter employee salary
12000
Enter employee designation
abc
Enter employee name
guru
Enter employee age
22
Enter employee salary
130000
Enter employee designation
xyz
 employee name guru
 employee age 22
 employee salary 130000.0
 employee designation xyz
 employee name guru
 employee age 22
 employee salary 130000.0
 employee designation xyz
		
	*/
	
	