import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class J6{
    public static void main(String[] args) throws FileNotFoundException, IOException{
	String info1="";
	File f1=new File("in2.txt");
	FileWriter fw1=new FileWriter("out1.txt");
        Scanner sc1=new Scanner(f1);
	String s1=sc1.nextLine();
	ArrayList list1=new ArrayList();
	String[] arr1=s1.split(",");
	System.out.println(arr1[0]);
	System.out.println(arr1[1]);
	int num1=Integer.parseInt(arr1[0]);
	int num2=Integer.parseInt(arr1[1]);
	
	for(int j=num1;j<num2+1;j++){
	    for(int i=1;i<11;i++){
	        info1=j+"*"+i+"="+(j*i);
	        System.out.println(info1);	
                fw1.write(info1);
		fw1.write("\n");

	    }
	    System.out.println();
	    fw1.write("\n");
	}
	fw1.close();
	
    }
}