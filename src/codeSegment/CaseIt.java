package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CaseIt {

	public static void main(String args[]) {		
		List<String> animals = Arrays.asList("zebra" , "lion");
		                             List<String> alsoUpperCasedAnimals = animals.stream()
			    .map(String::toUpperCase)
			    .collect(Collectors.toList());
		List<String> upperAnimals = animals.stream().map(String::toUpperCase).collect(Collectors.toList());
				System.out.println("OUtput --> " +alsoUpperCasedAnimals);
	}
}
