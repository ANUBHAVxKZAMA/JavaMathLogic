import java.util.*;
	class Lcm {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER 1ST NUMBER:");
		        int x=sc.nextInt();
		        System.out.println("ENTER 2ND NUMBER:");
		        int y=sc.nextInt();
		        int max,i,lcm=0;
		        if(x>y){
		        max=x;
		        }
		        else{
		           max=y;
		        }
		        for(i=max;i<=x*y;i++){
		            if(i%x==0 && i%y==0){
		                lcm=i;
		                break;
		            }
		        }
		       System.out.println("LCM OF THE GIVEN NUMBERS IS "+lcm);
		        }
	}
