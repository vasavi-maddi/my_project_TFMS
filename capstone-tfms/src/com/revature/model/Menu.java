package com.revature.model;
import java.util.Scanner;
import com.revature.dao.impl.BatchDetailsImplementation;

public class Menu {
	public void menu() {
		Scanner sc=new Scanner(System.in);
		System.out.println("**Menu**");
		System.out.println("1.Add Batch Details");
		System.out.println("2.Show Batch Details");
		System.out.println("3.Delete Batch Details");
		System.out.println("4.Update Batch Details");
		int a=sc.nextInt();
		BatchDetailsImplementation b1=new BatchDetailsImplementation();
		
		switch(a)
		{
			case 1:
				b1.addBatchDetails();
				break;
			case 2:
				b1.showBatchDetails();
				break;
			case 3:
				b1.deleteBatchDetails();
				break;
			case 4:
				b1.updateBatchDetails();
				break;
			default:
				System.out.println("please select a valid option");
		}
		sc.close();

	}
}
