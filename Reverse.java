import java.lang.*;
import java.util.Scanner;

class Reverse
{
     static void fun(int[]arr,int L,int R)
    {
        if(L>R)
        return;
        int t=arr[L];
        arr[L]=arr[R];
        arr[R]=t;
        fun(arr,L+1,R-1);
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int[] arr=new int[num1];
        for(int i=0;i<num1;i++)
        {
            System.out.println("Enter "+i+"element");
            arr[i]=sc.nextInt();

        }

        fun(arr,0,arr.length-1);
        for(int j=0;j<num1;j++)
        {
            System.out.println(arr[j]);
        }
    }
}
