package TraingAqua;

import java.util.Scanner;

public class Palindrome 
{
    static Scanner s=new Scanner(System.in);
    public static void main(String args[])     
    {
    String a, b="";
    
    System.out.println("Enter the string :");
    a=s.nextLine();
    int n=a.length();
    for (int i=n-1; i>=0; i--)
    {
        b=b+a.charAt(i);
    }
    if(a.equalsIgnoreCase(b))
    {
        System.out.println("The string is palindrome :" +a);
    }
    else
    {
        System.out.println("The string is not palindrome :" +a);
    }
    }    
}

/*
 * output :
 * 
 * Enter the string : EYE The string is palindrome :EYE
 */