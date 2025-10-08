import java.util.ArrayList;
public class J17{
    public static void main(String[] args){
	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	int square;
	for(int i=5;i<11;i++){
	   list1.add(i);
	   list2.add(i*i);
	}
	for(int i=0;i<5;i++){
	    System.out.println("The square of "+list1.get(i)+" is "+list2.get(i));
	}
    }
}
