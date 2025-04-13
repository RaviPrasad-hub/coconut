package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxValue {

	public static void main(String args[]) {		
		List<Integer> numbers = Arrays.asList(4,3,5,7,9);
		Optional<Integer> max = numbers.stream().min(Integer::compareTo);
				System.out.println("OUtput --> " +max.orElseThrow());
	}
}
