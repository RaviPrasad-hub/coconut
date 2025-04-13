package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountNumsGreaterThan5 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList( 4,2,5,3,1);
		long count = nums.stream().filter(num -> num > 5).count();
		
		System.out.println(count);
	}

}
