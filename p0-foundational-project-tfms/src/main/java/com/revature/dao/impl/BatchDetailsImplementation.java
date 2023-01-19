package com.revature.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.revature.config.DatabaseConnection;
import com.revature.constants.Constant;
import com.revature.model.Batch;
import com.revature.model.Menu;
import com.revature.dao.BatchDetails;

import org.apache.log4j.Logger;

public class BatchDetailsImplementation implements BatchDetails {
	private static final Logger logger = Logger.getLogger(BatchDetailsImplementation.class);
	Scanner sc = new Scanner(System.in);
	Menu m = new Menu();
	public static int v = 0;
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet res = null;
	Statement stm = null;

	@Override
	public Batch getBatch(Batch toBeInserted) throws SQLException {
		Connection con = null;
		con = DatabaseConnection.getConnection();
		boolean found=false;
		Batch obj=new Batch();
		try {
			String topicName=toBeInserted.getTopicName();
			stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM BATCH");
			
			while(rs.next()) {
				if(topicName.equals(rs.getString(1))) {
					found=true;
					obj.setTopicName(topicName);
					obj.setStartDate(rs.getString(2));
					obj.setEndDate(rs.getString(3));
					obj.setDuration(rs.getInt(4));
					obj.setTrainerId(rs.getString(5));
					obj.setAssociateId(rs.getString(6));
				}
			}
			
			
		} catch (SQLException e) {
		}
		// TODO Auto-generated method stub
		if(found==true) {
			return obj;
		}
		return null;
	}

	@Override
	public int addBatchDetails(Batch batch) {
		int n = 0;
		con = DatabaseConnection.getConnection();
		try {
			String insertQuery = Constant.INSERT_QUERY;
			ps = con.prepareStatement(insertQuery);
			ps.setString(1, batch.getTopicName());
			ps.setString(2, batch.getStartDate());
			ps.setString(3, batch.getEndDate());
			ps.setInt(4, batch.getDuration());
			ps.setString(5, batch.getTrainerId());
			ps.setString(6, batch.getAssociateId());
			n = ps.executeUpdate();
			logger.info(n);

		} catch (SQLException e) {
			logger.error(e.getMessage());
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
		return n;
	}

	@Override
	public void showBatchDetails() {
		con = DatabaseConnection.getConnection();
		try {
			stm = con.createStatement();
			res = stm.executeQuery("SELECT * FROM batch");
			while (res.next()) {
				v = v + 1;
				logger.info("\nTopic Name is :-  " + res.getString("Topic_name"));
				logger.info("\nDuration is  :- " + res.getString("Batch_Duration"));
				logger.info("\nStart Date is :- " + res.getString("start_date"));
				logger.info("\nEnd Date is  :- " + res.getString("end_date"));
				logger.info("\nTrainer Id is:-" + res.getString("trainer_id"));
				logger.info("\nAssociate Id is:-" + res.getString("Associate_id"));
			}
			logger.info(v);
		} catch (SQLException e) {
			logger.error(e.getMessage());
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
		con = DatabaseConnection.getConnection();
		try {
			String deleteQuery = Constant.DELETE_QUERY;
			ps = con.prepareStatement(deleteQuery);
			logger.info(Constant.ENTER_TOPIC);
			String topicName = sc.nextLine();
			ps.setString(1, topicName);
			int n = ps.executeUpdate();
			logger.info(n);

		} catch (SQLException e) {
			logger.info(e.getMessage());
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
		con = DatabaseConnection.getConnection();
		try {

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
