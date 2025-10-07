import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class J4{
    public static void main(String[] args) throws FileNotFoundException{
	String info1="";
	File f1=new File("in1.txt");
        Scanner sc1=new Scanner(f1);
	int num1=Integer.parseInt(sc1.nextLine());
	int num2=Integer.parseInt(sc1.nextLine());
	
	for(int j=num1;j<num2+1;j++){
	    for(int i=1;i<11;i++){
	        info1=j+"*"+i+"="+(j*i);
	        System.out.println(info1);
	    }
	    System.out.println();
	}	
}
}