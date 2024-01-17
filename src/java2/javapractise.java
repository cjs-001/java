package java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class javapractise {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("how many subjects?");
//	    int n = Integer.parseInt(br.readLine());
//	    int[] marks = new int[n];
//	    for(int i =0; i<n;i++)
//	    {
//	    	System.out.println("enter marks :");
//	    	marks[i]= Integer.parseInt(br.readLine());
//	    }
//	    int total =0;
//	    for(int i =0; i<n;i++)
//	    {
//	   
//	     total=	total+marks[i];
//	    }
//	    	System.out.println("total marks ="+total);
//	    	float percent =(float) total/n;
//	    	System.out.println("total precent"+ percent);
//	    
//	    
//	    
//	 /*   
//	    StringTokenizer st = new StringTokenizer(str,",");
//	    String s1 = st.nextToken();
//	    String s2 = st.nextToken();
//	    String s3 = st.nextToken();
//	    
//	    String name= s1;
//	    int age =Integer.parseInt(s2);
//	    int salary = Integer.parseInt(s3);
//		System.out.println("name: "+s1 );
//		System.out.println("age: "+s2 );
//		System.out.println("salary: "+s3 );
//		*/
		
		String str = "hello, this is a book on java";
		for(int j=0;j<7;j++)
		{
			//String str = "hello, this is a book on java";
			String str2 = str.split(" ")[j];
			//System.out.println(str2);
			for(int i=str2.length()-1;i>=0;i--)
			{
				char ch = str2.charAt(i);	
				System.out.print(ch);
			}
			System.out.print(" ");
		}
	}	
}
	
