import java.lang.*;
import java.util.*;  

class Amstrong
{
	public static void fun(int no1,int no2)
	{
		int ans=1;
		int myNum = 5;
		// int no;
		
		for(int i=0;i<no2;i++)
		{
			ans=ans*no1;

		}
		System.out.println("ans="+ans);
	}
	// -------------------------------------------
	public static int count(int iNum)
	{
		int ans=0;
		while(iNum!=0)
		{
			ans++;
			iNum=iNum/10;
		}
		return ans;
	}
	// --------------------------------------------
	public static int raiseTo(int iNum,int count)
	{
		int ans=1;
		for(int i=0;i<count;i++)
		{
			ans=ans*iNum;
		}
		return ans;
	}
	// ---------------------------------------
	public static int amstrang(int iNum,int count)
	{
		int ans=0,temp=0;
		while(iNum!=0)
		{
			temp=iNum%10;
			ans=ans+raiseTo(temp,count);
			iNum=iNum/10;
		}
		if(ans==iNum)
		{
		System.out.println(ans+"is a amstrong number is");
		}
		else
		{
			System.out.println(ans+"is not a amstrong nummber.");
		}
		return ans;
	}
	public static void main(String Arg[])
	{

		Scanner sc=new Scanner(System.in); 
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		int ans=0;
	   	fun(no1,no2);

		 Scanner sc1=new Scanner(System.in);
		 int iNum=sc1.nextInt();
         int count=count(iNum);
		 amstrang(iNum,count);

		// System.out.println("ans="+ans);
	}
	
}
