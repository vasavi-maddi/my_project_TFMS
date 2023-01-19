package com.revature.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.model.Menu;
import com.revature.dao.BatchDetails;

import org.apache.log4j.Logger;

public class BatchDetailsImplementation implements BatchDetails {
	private static final Logger logger = Logger.getLogger(BatchDetailsImplementation.class);
	Scanner sc = new Scanner(System.in);
	Menu m = new Menu();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet res = null;
	Statement stm = null;

	@Override
	public void addBatchDetails() {
		try {

			con = DatabaseConnection.getConnection();
			String insertQuery = Constant.INSERT_QUERY;

			ps = con.prepareStatement(insertQuery);
			logger.info("\nenter topic name: ");
			String topicName = sc.nextLine();
			logger.info("\nenter start date: ");
			String sDate = sc.nextLine();
			logger.info("\nenter end date: ");
			String eDate = sc.nextLine();
			logger.info("\nenter batch duration: ");
			int duration = sc.nextInt();
			logger.info("\nenter trainer id: ");
			String tId = sc.next();
			logger.info("\nenter associate id: ");
			String associateId = sc.next();
			ps.setString(1, topicName);
			ps.setString(2, sDate);
			ps.setString(3, eDate);
			ps.setInt(4, duration);
			ps.setString(5, tId);
			ps.setString(6, associateId);
			int n = ps.executeUpdate();
			logger.info(n);

		} catch (SQLException e) {
			logger.error(e.getMessage());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}
		}

		logger.info(Constant.CONTINUE_OR_NOT);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info(Constant.END);
			break;
		default:
			break;
		}

	}

	@Override
	public void showBatchDetails() {

		try {
			con = DatabaseConnection.getConnection();

			stm = con.createStatement();
			res = stm.executeQuery("SELECT * FROM batch");
			while (res.next()) {
				logger.info("\nTopic Name is :-  " + res.getString("Topic_name"));
				logger.info("\nDuration is  :- " + res.getString("Batch_Duration"));
				logger.info("\nStart Date is :- " + res.getString("start_date"));
				logger.info("\nEnd Date is  :- " + res.getString("end_date"));
				logger.info("\nTrainer Id is:-" + res.getString("trainer_id"));
				logger.info("\nAssociate Id is:-" + res.getString("Associate_id"));
			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		} finally {
			try {
				res.close();
				stm.close();
				con.close();
			} catch (SQLException e) {
				logger.error(e.getMessage());

			}

		}

		logger.info(Constant.CONTINUE_OR_NOT);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info(Constant.END);
		}

	}

	@Override
	public void deleteBatchDetails() {
		try {
			con = DatabaseConnection.getConnection();
			String deleteQuery = Constant.DELETE_QUERY;
			ps = con.prepareStatement(deleteQuery);
			logger.info(Constant.ENTER_TOPIC);
			String topicName = sc.nextLine();
			ps.setString(1, topicName);
			int n = ps.executeUpdate();
			logger.info(n);

		} catch (SQLException e) {
			logger.info(e.getMessage());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				logger.error(e.getMessage());
			}

		}

		logger.info(Constant.CONTINUE_OR_NOT);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info(Constant.END);
			break;
		default:
			break;
		}

	}

	@Override
	public void updateBatchDetails() {
		try {
			con = DatabaseConnection.getConnection();

			logger.info(
					"\nWhich field you want to update \nPress 1:Update Topic name\nPress 2:Update Duration\nPress 3:Update Start Date\nPress 4:Update End Date");
			int press = sc.nextInt();

			switch (press) {
			case 1:
				logger.info(Constant.ENTER_TOPIC);
				String topicName = sc.next();
				logger.info("\nenter new topic name: ");
				String newTopicName = sc.next();
				String updateQuery = Constant.UPDATE_TOPICNAME_QUERY;
				ps = con.prepareStatement(updateQuery);
				ps.setString(1, newTopicName);
				ps.setString(2, topicName);
				int n = ps.executeUpdate();
				logger.info(n);
				;
				break;
			case 2:
				logger.info(Constant.ENTER_TOPIC);
				topicName = sc.next();
				logger.info("\nenter new end duration: ");
				int duration = sc.nextInt();
				updateQuery = Constant.UPDATE_DURATION_QUERY;
				ps = con.prepareStatement(updateQuery);
				ps.setInt(1, duration);
				ps.setString(2, topicName);
				n = ps.executeUpdate();
				logger.info(n);
				break;
			case 3:
				logger.info(Constant.ENTER_TOPIC);
				topicName = sc.next();
				logger.info("enter new start date: ");
				String sDate = sc.next();
				updateQuery = Constant.UPDATE_STARTDATE_QUERY;
				ps = con.prepareStatement(updateQuery);
				ps.setString(1, sDate);
				ps.setString(2, topicName);
				n = ps.executeUpdate();
				logger.info(n);
				break;
			case 4:
				logger.info(Constant.ENTER_TOPIC);
				topicName = sc.next();
				logger.info("enter new end date: ");
				String eDate = sc.next();
				updateQuery = Constant.UPDATE_ENDDATE_QUERY;
				ps = con.prepareStatement(updateQuery);
				ps.setString(1, eDate);
				ps.setString(2, topicName);
				n = ps.executeUpdate();
				logger.info(n);
				break;

			default:
				logger.info("\nplease enter a valid number");

			}

		} catch (SQLException e) {
			logger.error(e.getMessage());
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {

				logger.error(e.getMessage());
			}
		}

		logger.info(Constant.CONTINUE_OR_NOT);
		int i = sc.nextInt();

		switch (i) {
		case 1:
			m.menu();
			break;
		case 2:
			logger.info(Constant.END);
			break;
		default:
			break;
		}

	}
}

