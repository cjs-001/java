package java2;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,5,6};
		for(int a:arr)
		{
			System.out.println(a);
			if(a==3)
			{
				System.out.println(a);
			}
			else if(a==6)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println("none");
			}
		}
	}

}
