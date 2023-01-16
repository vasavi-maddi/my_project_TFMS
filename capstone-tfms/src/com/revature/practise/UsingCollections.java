package com.revature.practise;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

import com.revature.model.Batch;


public class UsingCollections {
	public static void main(String[] args) {
		TreeSet<Batch> ob= new TreeSet<Batch>(new DurationComparator());
		ob.add(new Batch("java",2600,"2022-12-19","2023-03-19"));
		ob.add(new Batch("maven",1500,"2022-12-19","2023-03-19"));
		ob.add(new Batch("angular",3600,"2022-12-19","2023-03-19"));
		System.out.println("Sort by duration");
		System.out.println(ob);
		
		System.out.println();
		
		TreeSet<Batch> ob1= new TreeSet<Batch>(new TopicNameComparator());
		ob1.add(new Batch("java",2600,"2022-12-19","2023-03-19"));
		ob1.add(new Batch("maven",1500,"2022-12-19","2023-03-19"));
		ob1.add(new Batch("angular",3600,"2022-12-19","2023-03-19"));
		System.out.println("sort by topic name");
		System.out.println(ob1);
		
		
		usingAnonymous();
	
}

	private static void usingAnonymous() {
		
		
		Batch java=new Batch("java",2600,"2022-12-19","2023-03-19");
		Batch maven=new Batch("maven",1500,"2022-12-19","2023-03-19");
		Batch angular=new Batch("angular",3600,"2022-12-19","2023-03-19");
		TreeSet<Batch> ob2= new TreeSet<Batch>(new Comparator<Batch>(){
			@Override
			public int compare(Batch o1,Batch o2) {
				return o1.getTopicName().compareTo(o2.getTopicName());
			}
		});
		ob2.add(java);
		ob2.add(maven);
		ob2.add(angular);
	}
}
