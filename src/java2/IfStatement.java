package java2;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//	    System.out.println("Enter number");
//
//	    int num = myObj.nextInt();  // Read user input
//	    System.out.println("number is: " + num);  // Output user input
	    for(int i=1;i<10;i++)
	    {
	    	System.out.println(i);
//	    	int j= i;
//	    	System.out.println(j);
        if(i%2==0)
        {
        	System.out.println("number is even");
        }
        else {
        	System.out.println("number is odd");
        }
	    }
	}

}
