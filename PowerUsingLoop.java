import java.util.*;
	class PowerUsingLoop {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER THE BASE NUMBER:");
		        int x=sc.nextInt();
		        System.out.println("ENTER THE POWER NUMBER:");
		        int pow=sc.nextInt();
		        int i,val=x;
		        if(x==0&&pow==0)
		        {
		            System.out.println("NOT DEFINED FOR 0^0");
		        }
		        else if(x==1 || pow==0){
		            System.out.println("VALUE= 1");
		        }
		        else if(x==0){
		            System.out.println("VALUE= 0");
		        }
		        else{
		        for(i=2;i<=pow;i++){
		            val*=x;
		            }
		       System.out.println("VALUE= "+val);
		        }
		}
	}
