import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class J12{
   public static void main(String[] args)throws FileNotFoundException{
	String info1="";
	File f1=new File("in2.txt");
	Scanner sc1=new Scanner(f1);
	String s1=sc1.nextLine();
	String[] arr1=s1.split(",");

	int num1=Integer.parseInt(arr1[0]);
	int num2=Integer.parseInt(arr1[1]);
	
	for(int j=num1;j<num2+1;j++){
	   for(int i=1;i<11;i++){
	      info1=j+"*"+i+"="+(j*i);
	      System.out.println(info1);
	   }
	   System.out.println();
        }
	
	
		
}
}