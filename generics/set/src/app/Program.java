package app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("HASH SET EXAMPLE: ");
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		System.out.println(set.contains("Notebook"));
		
		for(String p : set) {
			System.out.println(p);
			
		}
		
		System.out.println("------------------------------");
		
		System.out.println("TREE SET EXAMPLE: ");
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("TV");
		treeSet.add("Notebook");
		treeSet.add("Tablet");
		
		System.out.println(treeSet.contains("Notebook"));
		
		for(String s : treeSet) {
			System.out.println(s);
		}
		
		System.out.println("------------------------------");
		
		System.out.println("TREE SET EXAMPLE: ");
		Set<String> linkedSet = new LinkedHashSet<>();
		
		linkedSet.add("TV");
		linkedSet.add("Notebook");
		linkedSet.add("Tablet");
		
		linkedSet.remove("Tablet");
		linkedSet.removeIf(x -> x.length() == 2); //tv
		
		System.out.println(linkedSet.contains("Notebook"));
		
		for(String s : linkedSet) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		
		Set<Integer> a = new TreeSet<>(Arrays.asList(0,2,4,6,8,10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(1,3,5,7,9,10));
		
		//union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println("a union b: " + c );
		
		//intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println("a intersection b: " + d);
		
		//difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println("a difference b: " + e);
	}
}
