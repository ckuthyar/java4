import java.util.Scanner;
public class J3{
    public static void main(String[] args){
	String info1="";
        Scanner sc1=new Scanner(System.in);
	System.out.println("Enter starting number");
	int num1=Integer.valueOf(sc1.nextLine());
	System.out.println("Enter ending number");
	int num2=Integer.valueOf(sc1.nextLine());
	for(int j=num1;j<num2+1;j++){
	    for(int i=1;i<11;i++){
	        info1=j+"*"+i+"="+(j*i);
	        System.out.println(info1);
	    }
	    System.out.println();
	}	
}
}