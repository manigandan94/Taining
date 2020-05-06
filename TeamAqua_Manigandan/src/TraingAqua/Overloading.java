package TraingAqua;

import java.util.Scanner;
interface Interface
{
   public void display();
   public void display(String name, int age);
}
public class Overloading implements Interface
{
   String name;
   int age;
   static Scanner sc = new Scanner(System.in);
   public void display() 
   {
      System.out.println("Implements the display method");
   }
   public void display(String name, int age) 
   {
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
   }
   public static void main(String args[]) 
   {
      
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      Overloading obj = new Overloading();
      obj.display();
      obj.display(name, age);
   }
}

/*Output:
	
	Enter your name: 
		Mani
		Enter your age: 
		25
		Implements the display method
		Name: Mani
		Age: 25
		*/
