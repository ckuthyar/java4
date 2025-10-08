import java.util.ArrayList;
public class J15{
    public static void main(String[] args){
	ArrayList<Integer> list1=new ArrayList<>();
	int square;
	for(int i=5;i<11;i++){
	   square=i*i;
	   list1.add(square);
	}
	System.out.println(list1);
    }
}
