package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer>list = Arrays.asList(3,4,6,1,7,1,10);
		Stream<Integer>st1 = list.stream().map(p -> p*10);
		System.out.println(Arrays.toString(st1.toArray()));
		
		int sum = list.stream().reduce(0, (x,y) -> x+y);//0 é o elemento neutro
		int mult = list.stream().reduce(1, (x,y) -> x*y);//1 é o elemento neutro
		
		System.out.println("Sum: "+ sum);
		System.out.println("mult: " + mult);
		
		List<Integer>newList = list.stream()
				.filter(x -> x%2 == 0)
				.map(x -> x*10)
				.collect(Collectors.toList());
		
		System.out.println(Arrays.toString(newList.toArray()));
		
	}

}

















