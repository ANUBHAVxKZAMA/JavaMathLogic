import java.util.*;
	class Factorial {
		public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        System.out.println("ENTER A NUMBER:");
		        int x=sc.nextInt();
		        int i,fact=1;
		        for(i=2;i<=x;i++){
		            fact*=i;
		        }
		        System.out.println("FACTORIAL OF "+x+" IS "+fact);
		        }
	}
