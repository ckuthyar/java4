package pkg1;
import java.util.List;
import java.util.ArrayList;
public class J1 {

	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>();
		List<Integer> even2 =new ArrayList<>();
		even.add(2);
		even.add(4);
		even.add(5);
		even.add(8);
		int num1;
		System.out.println(even);
		int len1=even.size();
		for(int i=0;i<len1;i++) {
			num1=even.get(i);
			if(num1%2==0) {
				even2.add(num1);
			}
		}
		System.out.println(even2);
		
	}

}
