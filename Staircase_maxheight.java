package jan19;
import java.util.Scanner;

public class StarElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); int arr[] =new int[n];
		
		for(int i=0;i<n;i++)
		{
		   int input=s.nextInt();
		   arr[i]=height(input);
		}
		for(int i=0;i<n;i++)
		{
		    System.out.println(arr[i]);
		}
		
		}
	
	public static int height(int input)
	{
	    int sum=1;
	    int n=1;
	    while(sum<input)
	    {
	        n++;
	        sum=((n*(1+n))/2);
	    } 
	    if(sum==input)
	    {
	        return n;
	    }
	    else
	    {
	        return n-1;
	    }
	}
	
		
		
		
		
		
	
}
