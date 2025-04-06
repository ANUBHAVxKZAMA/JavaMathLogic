import java.util.*;
	class Fibonacci {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int n=sc.nextInt();
		        int i,x=1,y=0,sum=0;
		        if(n==1){
		        System.out.print("0");
		        }
		        else if(n==2)
		        {
		            System.out.print("0 1");
		        }
		        else
		        {
		            System.out.print("0 ");
		        for(i=2;i<=n;i++){
		            sum=x+y;
		            System.out.print(sum+" ");
		            x=y;
		            y=sum;
		        }
		        }
		        }
  }
