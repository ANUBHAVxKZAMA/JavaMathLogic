import java.util.*; 
class PrimeNumber { 
public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
      System.out.println("ENTER A NUMBER:");
      int x=sc.nextInt(); 
      int i, count=0; 
      if(x<2){ 
      System.out.println(x+" IS NOT A PRIME NUMBER");
       }
        else{ 
        for(i=2;i<=x/2;i++){ 
        if(x%i==0){ 
        count++;
        break;
        } 
        } 
        if (count==0)
        System.out.println(x+" IS A PRIME NUMBER!");
        else System.out.println(x+" IS NOT A PRIME NUMBER!");
        }
      }
}
