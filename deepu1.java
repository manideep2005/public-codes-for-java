// this is the file for the average marks for a student
import  java.util.Scanner;

public class deepu1{
public static void main(String[] args) {
Scanner myObj = new Scanner(System.in);

System.out.println("Enter your name:");
String name = myObj.nextLine();

System.out.println("Name:" + name);
System.out.println("Enter your maths marks:"); 
double maths = myObj.nextInt();

System.out.println("your maths marks are: " + maths);
System.out.println("Enter your physics marks:");
double physics = myObj.nextDouble();

System.out.println("your physics marks are: " + physics); 
System.out.println("Enter your chemistry marks:");
double chemistry = myObj.nextDouble();
System.out.println("your chemistry marks are:" + chemistry); 
double total = maths+physics+chemistry;

System.out.println("your total is "+ total);
double average = total/3;
System.out.println("your average is "+average);
if (average > 90)

System.out.println("you got s grade"); 
else if (average > 80)
System.out.println("you got a grade"); 
else if (average > 70)
System.out.println("you got b grade"); 

else if (average > 60)
System.out.println("you got c grade");
else if (average > 50)
System.out.println("you got d grade");
else
System.out.println("you are fail ");
}
}
