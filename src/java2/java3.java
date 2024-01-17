package java2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=5;i>0;i--)
		{
			
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			for(int l=0;l<i-1;l++)
			{
				System.out.print("*");
			}
				
			System.out.println("");
		}
		
/*String name = "my name is tom";

String[] result = name.split(" ");
	
	int a = result.length;
	
	for(int i=0;i<a;i++)
	{	
		char[] abc = result[i].toCharArray();
		System.out.println(result[i]+"old ");
		for(int j= abc.length-1; j>=0 ;j--)
	{
		
		System.out.print(abc[j]);
		System.out.print(" ");

	}
	}*/
}
}
