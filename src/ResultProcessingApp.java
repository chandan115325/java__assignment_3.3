import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ResultProcessingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,roll_no,no_of_subjects=5;
		String student_name;
		float maths,science,english,hindi,computer_science,total_marks = 500.0f,marks_percentage,marks_obtained,max_marks;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the No of students:- ");
		size = sc.nextInt();
		
		StudentRecord[] s = new StudentRecord[size];
		
		
		for(int i=0; i<size; i++)
			{
			
			System.out.println("Enter the name of the student:");
			student_name = sc.next();
			
			System.out.println("Enter the roll_no(only counting nubers.):");
			roll_no = sc.nextInt(); 
			
			System.out.println("Enter the marks in maths(always <=100 ):");
			maths = sc.nextFloat();
			
			System.out.println("Enter the marks in science(always <=100 ):");
			science = sc.nextFloat();
			
			System.out.println("Enter the marks in english(always <=100 ):");
			hindi = sc.nextFloat();
			
			System.out.println("Enter the marks in hindi(always <=100 ):");
			english = sc.nextFloat();
			
			System.out.println("Enter the marks in computer science(always <=100 ):");
			computer_science = sc.nextFloat();
			if(maths<=100 && science <=100 && english <= 100 && hindi<=100 && computer_science<=100)
			{	
			marks_obtained = (maths+science+english+hindi+computer_science);
			
			marks_percentage = (marks_obtained*100)/total_marks;
			
			s[i] = new StudentRecord(student_name,roll_no,marks_obtained,marks_percentage,maths,science,english,hindi,computer_science);
			}
			
			else
			{
				System.out.println("Invalid Input");
			}
			
		}
		
		ArrayList<StudentRecord>al = new ArrayList<StudentRecord>();
		for(int i=0; i<size;i++)
		{
			al.add(s[i]);
		}
		
		System.out.print(" 		"+"student_name" );
		System.out.print("		"+"maths" );
		System.out.print("  	"+"science" );
		System.out.print("      "+"english" );
		System.out.print("   	"+"hindi" );
		System.out.print("  	"+"computer_science ");
		System.out.print("   	"+"total_marks" );
		System.out.print("   	"+"marks_obtained" );
		System.out.println("  	"+"marks_percentage");
		System.out.println("");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			StudentRecord student = (StudentRecord)itr.next();
			
			
			
			
			
			System.out.print(" 		"+student.student_name );
			System.out.print("			"+student.maths );
			System.out.print("  	"+student.science );
			System.out.print("      	"+student.english );
			System.out.print("   	"+student.hindi );
			System.out.print("  		"+student.computer_science );
			System.out.print("   		  "+student.total_marks );
			System.out.print("   	"+student.marks_obtained );
			System.out.println("  			  "+student.marks_percentage );
		}
		
	}

}

class StudentRecord{
	
	String student_name;
	int subject_no,roll_no;
	float maths,science,english,hindi,computer_science,total_marks = 500.0f,marks_percentage,marks_obtained,max_marks;
	public StudentRecord(String student_name,int roll_no,float marks_obtained,float marks_percentage,float maths,float science,float english, float hindi, float computer_science)
	{
		this.student_name = student_name;
		this.roll_no=roll_no;
		this.science =science;
		this.maths =maths;
		this.english = english;
		this.hindi = hindi;
		this.computer_science = computer_science;
		this.marks_obtained = marks_obtained;
		this.marks_percentage = marks_percentage; 
	}
}