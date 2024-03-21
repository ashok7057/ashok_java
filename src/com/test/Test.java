package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hi this is my test app");
		
		
		//IntStream values=IntStream.of(6,8,90,34,55,73,21);
		
		List<String> al=new ArrayList<>();
		
		al.add("ashok");
		al.add("reddy");
		al.add("badam");
		al.add("lumar");
		al.add("raju");
		al.add("oammy");
		al.add("jalu");
		al.add("minnu");
		al.add("kasu");
		al.add("sudolf");
		for(String s:al) {
			System.out.print(s+" ");
		}
		System.out.println("---------------------------------");
		List<String> sortedStringInAssending=al.stream().sorted().collect(Collectors.toList());
		for(String s:sortedStringInAssending) {
			System.out.print(s+" ");
		}
		
		System.out.println("---------------------------------");
		List<String> sortedStringInDecending=al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		for(String s:sortedStringInDecending) {
			System.out.print(s+" ");
		}
		
	

	}

}
