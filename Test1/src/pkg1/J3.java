package pkg1;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class J3 {

	public static void main(String[] args) {
		List<Integer> even = List.of(2,14,6,8,10);
		List<Integer> even2 = new ArrayList<>();
		int max1=Collections.max(even);
		int min1=Collections.min(even);
		
		System.out.println(max1);
		System.out.println(min1);

	}

}
