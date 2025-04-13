package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterNameStartingWithJ {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Rohit" , "Sunita" , "Babita" , "Tom" , "Jigar" , "Jumbish");
		List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).collect(Collectors.toList());		
		System.out.println(filteredNames);
		
	}

}
