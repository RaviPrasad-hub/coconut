package codeSegment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {				
		List<Integer> numbers = Arrays.asList(1,2,3,4,2,3,4,2,6);
		System.out.println("Input stream -> " + numbers);
		
		List<Integer> evenNumbers = numbers.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
		System.out.println(" -> " + numbers);		
	}   }
