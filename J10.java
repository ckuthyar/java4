import java.util.Scanner;

public class J10{
   public static void main(String[] args){
	String info1="";
	Scanner sc1=new Scanner(System.in);
	System.out.print("Enter first number: ");
	int num1=sc1.nextInt();
	System.out.print("Enter second number: ");
	int num2=sc1.nextInt();
	for(int j=num1;j<num2+1;j++){
	   for(int i=1;i<11;i++){
	      info1=j+"*"+i+"="+(j*i);
	      System.out.println(info1);
	   }
	   System.out.println();
        }
	
	
		
}
}