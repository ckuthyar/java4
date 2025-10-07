package pkg1;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class J2 {

	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>();
		List<Integer> even2 = new ArrayList<>();
		even.add(2);
		even.add(4);
		even.add(5);
		even.add(8);
		even2=even.stream().filter(num1->num1%2==0).collect(Collectors.toList());
		System.out.println(even2);
		System.out.println(even.stream().filter(num1->num1%2==0).collect(Collectors.toList()));
	}

}
