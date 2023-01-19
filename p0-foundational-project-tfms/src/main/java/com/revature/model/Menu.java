package com.revature.model;
import java.sql.SQLException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.dao.impl.BatchDetailsImplementation;

public class Menu {
	private static final Logger logger = Logger.getLogger(Menu.class);
	public void menu() {
		Scanner sc=new Scanner(System.in);
		logger.info("**Menu**");
		logger.info("1.Add Batch Details");
		logger.info("2.Show Batch Details");
		logger.info("3.Delete Batch Details");
		logger.info("4.Update Batch Details");
		int a=sc.nextInt();
		BatchDetailsImplementation b1=new BatchDetailsImplementation();
		switch(a)
		{
			case 1:
				logger.info("\nenter topic name: ");
				String topicName = sc.next();
				logger.info("\nenter start date: ");
				String sDate = sc.next();
				logger.info("\nenter end date: ");
				String eDate = sc.next();
				logger.info("\nenter batch duration: ");
				int duration = sc.nextInt();
				logger.info("\nenter trainer id: ");
				String tId = sc.next();
				logger.info("\nenter associate id: ");
				String associateId = sc.next();
				Batch batch=new Batch(topicName,sDate,eDate,duration,tId,associateId);
				logger.info(b1.addBatchDetails(batch));
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
				logger.info("please select a valid option");
		}
		sc.close();

	}
}
