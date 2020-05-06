package TraingAqua;

public class Fibonacci
{
    public static void main(String[] args) {

    	int i=1;
    	int count = 10;
    	int num1 = 0, num2 = 1;
        while(i<=count)
        {
            System.out.println(num1+" ");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            i++;
        }   
        System.out.println("Fibonacci Series of "+count+" numbers");

        
    }
}

/*
 * Output :
 * 
 * 0 1 1 2 3 5 8 13 21 34 Fibonacci Series of 10 numbers
 */