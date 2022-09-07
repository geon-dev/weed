package test;

import java.util.*;

public class ASDLFKJASJDLF {

	public static void main(String[] args) {
		aslkdfj();
	}

	private static void aslkdfj() {
		// list to array
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("d");
		list.add("e");
		list.add("5");
		
		String[] arr = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
		
		// array to list
		List<String> converList = new ArrayList<>(Arrays.asList(arr));
		System.out.println(converList);
		
		
		
		
	}
}
