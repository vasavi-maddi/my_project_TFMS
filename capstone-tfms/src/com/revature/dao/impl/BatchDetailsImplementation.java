package com.revature.dao.impl;

import java.util.Iterator;
import java.util.Scanner;
import com.revature.dao.BatchDetails;
import com.revature.model.Batch;
import com.revature.model.Menu;

public class BatchDetailsImplementation implements BatchDetails {
	Scanner sc = new Scanner(System.in);
	Menu m = new Menu();

	@Override
	public void addBatchDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter Topic Name: ");
		String topicName = sc.nextLine();
		System.out.println("Enter Start Date: ");
		String startDate = sc.nextLine();
		System.out.println("Enter end Date: ");
		String endDate = sc.nextLine();
		System.out.println("Enter duration: ");
		int duration = sc.nextInt();

		Batch batchDetails = new Batch(topicName, duration, startDate, endDate);

		batchList.add(batchDetails);

		System.out.println("Do you want to continue?");
		System.out.println("to continue press 1");
		System.out.println("else press 2");

		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			System.out.println("Thankyou");
		}

	}

	@Override
	public void showBatchDetails() {
		// TODO Auto-generated method stub
		System.out.println("The Batch details are: ");
		for (Batch batch : batchList) {
			System.out.println(batch.toString());
		}
		System.out.println("Do you want to continue?");
		System.out.println("to continue press 1");
		System.out.println("else press 2");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			System.out.println("Thankyou");
		}

	}

	@Override
	public void deleteBatchDetails() {
		// TODO Auto-generated method stub
		Iterator<Batch> it = batchList.iterator();
		while (it.hasNext()) {
			System.out.println("enter topic name you want to delete");
			String tName = sc.nextLine();
			if (it.next().getTopicName() == tName) {
				it.remove();
				System.out.println("Topic name deleted successfully");
				break;
			}
		}
		System.out.println("Do you want to continue?");
		System.out.println("to continue press 1");
		System.out.println("else press 2");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			System.out.println("Thankyou");
		}

	}

	@Override
	public void updateBatchDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter TopicName to update: ");
		String tName = sc.nextLine();
		System.out.println(
				"Which field you want to update \nPress 1:Update Topic name\nPress 2:Update Duration\nPress 3:Update Start Date\nPress 4:Update End Date");
		int press = sc.nextInt();

		switch (press) {
		case 1:
			for (Batch b : batchList) {

				if (tName == (b.getTopicName())) {

					System.out.println("Enter the updated topic name :-");
					String newTName = sc.nextLine();
					b.setTopicName(newTName);
				} else {
					System.out.println("Please provide correct TopicName");
				}

			}
			;
			break;
		case 2:
			for (Batch b : batchList) {

				if (tName == (b.getTopicName())) {

					System.out.println("Enter the updated Duration :-");
					int newDuration = sc.nextInt();
					b.setDuration(newDuration);
				} else {
					System.out.println("Please provide correct TopicName");
				}

			}
			;
			break;
		case 3:
			for (Batch b : batchList) {

				if (tName == (b.getTopicName())) {

					System.out.println("Enter the updated StartDate :-");
					String newSDate = sc.nextLine();
					b.setStartDate(newSDate);
				} else {
					System.out.println("Please provide correct TopicName");
				}

			}
			;
			break;
		case 4:
			for (Batch b : batchList) {

				if (tName == (b.getTopicName())) {

					System.out.println("Enter the updated End Date :-");
					String newEDate = sc.nextLine();
					b.setEndDate(newEDate);
				} else {
					System.out.println("Please provide correct TopicName");
				}

			}
			;
			break;

		default:
			System.out.println("please enter a valid number");

		}

		System.out.println("Do you want to continue?");
		System.out.println("to continue press 1");
		System.out.println("else press 2");
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			System.out.println("Thankyou");
		}
	}
}
