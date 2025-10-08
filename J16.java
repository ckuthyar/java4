import java.util.ArrayList;
public class J16{
    public static void main(String[] args){
	ArrayList<Integer> list1=new ArrayList<>();
	ArrayList<Integer> list2=new ArrayList<>();
	int square;
	for(int i=5;i<11;i++){
	   list1.add(i);
	   list2.add(i*i);
	}
	System.out.println(list1);
	System.out.println(list2);
    }
}
