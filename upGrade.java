/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class student
{
    private String name;
    private float cgpa;
    private int token;

public student(String name,float cgpa, int token)
{
    this.name=name;
    this.cgpa=cgpa;
    this.token=token;
}
public String getName()
{
    return name;
}
public int getToken()
{
    return token;
}
public float getCgpa()
{
    return cgpa;
}
}
class service
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		
		PriorityQueue<student> pq = new PriorityQueue<student>(
				
				new Comparator<student>() 
				{
				    
				    public int compare(student student1, student student2)
				    {
				    if (student1.getCgpa() != student2.getCgpa())
				    { 
							if(student1.getCgpa() > student2.getCgpa())
								return -1;
							else
								return 1;						
					}
						else 
						{
							if (  ( student1.getName().compareTo(student2.getName()) ) != 0)
							{
								return student1.getName().compareTo(student2.getName());
						    }
						else
								return student1.getToken() - student2.getToken(); 
						}
					}
	            }
	   );
	   for (int i = 0; i < total; i++) 
	   {
			String event = sc.next();
            
            if (event.equals("ENTER")) 
            {
                String name = sc.next();
                float cgpa = sc.nextFloat();
                int token = sc.nextInt();
                
                student student = new student(name, cgpa,token);
                
                pq.add(student);			
            } else if (event.equals("SERVED"))
            {
            	pq.poll(); 	
            }
		}
		
		if ( pq.isEmpty() ) 
		{
			System.out.println("EMPTY");
		} else 
		{
			for (int i = 0; i < total; i++) 
			{
				student stu = pq.poll();

					System.out.println(stu.getName());	
				
			}
		}
	}
}
