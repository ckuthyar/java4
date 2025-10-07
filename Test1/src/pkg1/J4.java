package pkg1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
public class J4 {

	public static void main(String[] args) {
		List<Integer> even = new ArrayList<>();
		even.add(14);
		even.add(2);
		even.add(4);
		even.add(42);
		even.add(6);
		System.out.println(even);
		//Collections.sort(even);
		System.out.println(even);
		System.out.println(even.stream().sorted().collect(Collectors.toList()));
		System.out.println(even)

	}

}
