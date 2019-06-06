import java.io.*;
import java.util.*;
  public class SortCheck{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int l=0,status=0;
      //System.out.println("Enter N value:");
      int N=sc.nextInt();
      int a[]=new int[N];
      //System.out.println("Enter the Array element one by one...");
        for(int i=0;i<N;i++)
        {
           a[i]=sc.nextInt();
        }
        for(int i=0;i<N-1;i++)
        {
          if(a[i]<a[i+1])
          {
            status=0;
          }
          else
          {
          status=1;
          }
        }
        if(status==1)
        {
        System.out.println("No");
        }
        else
        {
        System.out.println("Yes");
        }
     }
   }  
