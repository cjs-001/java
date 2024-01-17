package java2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class java4 {

	

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		//String str = "hello, this is a book on java";
//		char array[] = new char[20];
//		str.getChars(7, 21, array, 0);
//		System.out.println(array);
//		System.out.println(str.contains("z"));
//		System.out.println(str.toUpperCase());
//		Locale local = new Locale(str);
//		
//		System.out.println(str.toUpperCase(local));
//		String[] split = str.split(",");
//		
//		System.out.println(split[1].split(" ")[1]);
//		StringBuilder str1 =new StringBuilder(str);
//		str1.append(str);
		//System.out.println(str1.reverse());
		String str = "hello, this is a book on java";
		//String str2 = str.split(" ")[1];
		
		
		
//		for(int i= str.length()-1;i>=0;i--)
//		{
//			for(int j=0;j<=7;j++)
//			{
//				//String str = "hello, this is a book on java";
//				String str2 = str.split(" ")[j];
//				System.out.println(str2);
//			}
////			String str2 = str.split(",")[0];
////			System.out.println(str2);
//	        char ch = str.charAt(i);	
//			System.out.print(ch);
//		}
		//StringBuffer sb = new StringBuffer();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("Enter sur name :");
//		String sur = br.readLine();
//		System.out.println("sur name =" +sur);
//		System.out.print("Enter middle name :");
//		String mid = br.readLine();
//		System.out.print("Enter last name :");
//		String last = br.readLine();
//		
//		int i =sur.length();
//		String name =sur.concat(mid);
//		System.out.println(name);
		
//		sb.append(sur);
//		sb.append(mid);
//		sb.append(last);
//		System.out.println("name = "+sb);
//		int n = sur.length();
//		sb.insert(9, mid);
//		System.out.println("full name = "+sb);
//		System.out.println(sb.reverse());
		
		
		String asd = "malayalam";
		String str2 = "";
		String reverse="";
		String str3="";
		for(int i=asd.length()-1;i>=0;i--)
		{
			char ch= asd.charAt(i);
			str2 =""  + ch;
			
			char ch1 = asd.charAt(i);
			str3 = Character.toString(ch);


		
			System.out.print(str2);
			
		}	
		System.out.println();
			if(asd.equalsIgnoreCase(str3))
			{
				System.out.println("is palindrome");
			}else
			{
				System.out.println("is palindrome");
			}
		}
			
		
		
		
		
		
		
		
		
	}


