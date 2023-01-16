package com.revature.practise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import com.revature.model.Batch;

public class collectionUsage {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		Batch b1=new Batch("Core Java",3600,"2022-12-19","2023-03-19");
		Batch b2=new Batch("Maven",2400,"2022-12-19","2023-03-19");
		Batch b3=new Batch("Angular",4200,"2022-12-19","2023-03-19");
		Batch b4=new Batch("Sprint",1500,"2022-12-19","2023-03-19");
		
		ArrayList<Batch> list= new ArrayList<Batch>();
	
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		Collections.sort(list, Comparator.comparing(Batch::getTopicName));
		System.out.println(list);
	}

	
}
