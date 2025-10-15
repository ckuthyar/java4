import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class J29{
   public static void main(String[] args) throws FileNotFoundException{
   	String s1="";
   	ArrayList<String> names = new ArrayList<>();
   	ArrayList<Integer> sub1 = new ArrayList<>();
   	File f1=new File("marks.txt");
   	Scanner sc1=new Scanner(f1);
   	while(sc1.hasNext()){
   		s1=sc1.nextLine();
   		String[] arr1=s1.split(",");
   		names.add(arr1[0]);
   		String[] arr2=arr1[3].split(":");
   		sub1.add(Integer.parseInt(arr2[1]));

   	}
   	int maxSub1=0;
      int maxSub11=0;
   	int len1=sub1.size();
   	for(int i=0;i<len1;i++){
   		if (sub1.get(i)>maxSub1){
   			maxSub1=sub1.get(i);
   		}
   	}
      
   	
   	
      maxSub11=Collections.max(sub1);
      System.out.println(sub1);
      System.out.println(maxSub11);

      System.out.println(maxSub1);
      System.out.println(names);
	
   }
}

