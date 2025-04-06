import java.util.*;
	class HcfOrGcd {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER 1ST NUMBER:");
		        int x=sc.nextInt();
		        System.out.println("ENTER 2ND NUMBER:");
		        int y=sc.nextInt();
		        int small,i,hcf=1;
		        if(x<y){
		        small=x;
		        }
		        else{
		           small=y;
		        }
		        for(i=small/2;i>=1;i--){
		            if(x%i==0 && y%i==0){
		                hcf=i;
		                break;
		            }
		        }
		       System.out.println("HCF OF THE GIVEN NUMBERS IS "+hcf);
		        }
  }
