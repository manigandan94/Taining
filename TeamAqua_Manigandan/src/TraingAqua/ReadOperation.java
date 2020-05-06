package TraingAqua;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class ReadOperation 
{ 
	public static void main(String[] args) {
	    try {
	      File myObj = new File("C:\\Users\\manigandang\\Desktop\\Sample\\Demo\\Files\\file1.txt");
	      Scanner myReader = new Scanner(myObj);
	      System.out.println("File Read Successfully");
	      while (myReader.hasNextLine()) {
	        String data = myReader.nextLine();
	        System.out.println(data);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("File not Found");
	      e.printStackTrace();
	    }
    } }


/*
output:
	File Read Successfully
	Java
	Python
	Ruby
	Selenium
	SoapUI
	*/