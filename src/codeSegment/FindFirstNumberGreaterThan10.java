package codeSegment;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindFirstNumberGreaterThan10 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList( 4,6,5,3,6);
		Optional<Integer> filterdList = nums.stream().filter(num -> num > 10).findFirst();
		
		filterdList.ifPresentOrElse(System.out::println, () -> System.out.println("Not present"));
	}

}
