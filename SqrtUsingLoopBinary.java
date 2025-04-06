import java.util.*;
	class SqrtUsingLoopBinary{
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i,min=1,max=x/2,mid,count=0;
		        if(x==0||x==1){
		            System.out.println(x+" IS A PERFECT SQUARE");
		        }
		        else if(x>1){
		        for(;min<=max;){
		            mid=(max+min)/2;
		            if(mid*mid==x){
		                count++;
		                break;
		            }
		            else if(mid*mid<x){
		             min=mid+1;  
		             }
		        else{
		            max=mid-1;
		        }
		        }
		        if(count==1){
		            System.out.println(x+" IS A PERFECT SQUARE");
		        }
		        else
		        {
		            System.out.println(x+" IS NOT A PERFECT SQUARE");
		        }
		        }
		        else{
		            System.out.println("ENTER A VALID NUMBER");
		}
	}
