import java.util.*;
	class SqrtUsingLoopLinear{
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i,count=0;
		        for(i=1;i<=x/2;i++){
		            if(i*i==x){
		                count++;
		                break;
		            }
		        }
		        if(count==1)
		        {
		       System.out.println(x+" IS A PERFECT SQUARE");
		        }
		        else
		        {
		            System.out.println(x+" IS NOT A PERFECT SQUARE");
		        }
		}
  }
