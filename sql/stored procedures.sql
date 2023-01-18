use project_tfms;
drop procedure if exists AddBatchDetails;
DELIMITER $$
CREATE PROCEDURE AddBatchDetails(
IN topic_name varchar(255),
IN batch_duration integer, 
IN start_date date,
IN end_date date,
trainer_id varchar(10),
trainee_id varchar(10))
BEGIN
	INSERT INTO BATCH VALUES (topic_name,batch_duration,start_date,end_date,trainer_id,trainee_id);
END $$
DELIMITER ;
CALL AddBatchDetails('CoreJava','3600','2022-12-19','2023-03-19','1001','101');
CALL AddBatchDetails('JDBC','2400','2022-12-19','2023-03-19','1004','102');
CALL AddBatchDetails('Spring','1500','2022-12-19','2023-03-19','1002','104');

drop procedure if exists ShowBatchDetails;
DELIMITER $$
CREATE PROCEDURE ShowBatchDetails()
BEGIN
	select * from batch;
END $$
delimiter ;
call ShowBatchDetails();


DELIMITER $$
CREATE PROCEDURE DeleteBatchDetails(IN del_topic_name varchar(15))
BEGIN
	DELETE FROM BATCH WHERE topic_name=del_topic_name;
END $$
delimiter ;
call DeleteBatchDetails("Core Java");


drop procedure if exists UpdateBatchTopicName;
DELIMITER $$
CREATE PROCEDURE UpdateBatchTopicName(IN old_topic_name varchar(15),IN new_topic_name varchar(15))
BEGIN
	UPDATE batch
    SET topic_name=new_topic_name
    WHERE topic_name=old_topic_name;
END $$
delimiter ;
call UpdateBatchDetails('CoreJava','sprint');

drop procedure if exists UpdateBatchDuration;
DELIMITER $$
CREATE PROCEDURE UpdateBatchDuration(IN new_duration varchar(15),IN user_topic_name varchar(15))
BEGIN
	UPDATE batch
    SET topic_duration=new_duration
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchDuration(3000,'JDBC');

drop procedure if exists UpdateBatchStartDate;
DELIMITER $$
CREATE PROCEDURE UpdateBatchStartDate(IN new_StartDate date,IN user_topic_name varchar(15))
BEGIN
	UPDATE batch
    SET start_date=new_startDate
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchDuration('2022-10-15','JDBC');

drop procedure if exists UpdateBatchEndDate;
DELIMITER $$
CREATE PROCEDURE UpdateBatchEndDate(IN new_EndDate date,IN user_topic_name varchar(15))
BEGIN
	UPDATE batch
    SET end_date=new_EndtDate
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchDuration('2023-02-15','JDBC');