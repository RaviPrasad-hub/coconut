package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstStringNotEmpty {

	public static void main(String args[]) {
		List<String> listOfStrings = Arrays.asList("Eena" , "meena" , "deeka" , "" , "pom");
		Optional<String> indexOfEmptyString = listOfStrings
				.stream()
				.map(String::trim)
				.filter(s -> !s.isEmpty())
				.findFirst();
		indexOfEmptyString.ifPresent(System.out::println);
	}
}
