use project_tfms;
drop procedure if exists AddBatchDetails;
DELIMITER $$
CREATE PROCEDURE AddBatchDetails(
IN topic_name varchar(255),
IN start_date date,
IN end_date date,
IN batch_duration integer,
trainer_id varchar(10),
trainee_id varchar(10))
BEGIN
	INSERT INTO BATCH VALUES (topic_name,start_date,end_date,batch_duration,trainer_id,trainee_id);
END $$
DELIMITER ;
CALL AddBatchDetails('CoreJava','2022-12-19','2023-03-19',3600,'1001','101');
CALL AddBatchDetails('JDBC','2022-12-19','2023-03-19',2400,'1004','102');
CALL AddBatchDetails('Spring','2022-12-19','2023-03-19',1500,'1002','104');
CALL AddBatchDetails('maven','2022-12-19','2023-03-19',3000,'1003','103');
drop procedure if exists ShowBatchDetails;
DELIMITER $$
CREATE PROCEDURE ShowBatchDetails()
BEGIN
	select * from batch;
END $$
delimiter ;
call ShowBatchDetails();


DELIMITER $$
CREATE PROCEDURE DeleteBatchDetails(IN del_topic_name varchar(255))
BEGIN
	DELETE FROM BATCH WHERE topic_name=del_topic_name;
END $$
delimiter ;
call DeleteBatchDetails("spring");


drop procedure if exists UpdateBatchTopicName;
DELIMITER $$
CREATE PROCEDURE UpdateBatchTopicName(IN old_topic_name varchar(255),IN new_topic_name varchar(255))
BEGIN
	UPDATE batch
    SET topic_name=new_topic_name
    WHERE topic_name=old_topic_name;
END $$
delimiter ;
call UpdateBatchTopicName('CoreJava','sprint');

drop procedure if exists UpdateBatchDuration;
DELIMITER $$
CREATE PROCEDURE UpdateBatchDuration(IN new_duration int,IN user_topic_name varchar(255))
BEGIN
	UPDATE batch
    SET batch_duration=new_duration
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchDuration(3000,'JDBC');

drop procedure if exists UpdateBatchStartDate;
DELIMITER $$
CREATE PROCEDURE UpdateBatchStartDate(IN new_StartDate varchar(255),IN user_topic_name varchar(255))
BEGIN
	UPDATE batch
    SET start_date=new_StartDate
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchStartDate('2022-10-15','JDBC');

drop procedure if exists UpdateBatchEndDate;
DELIMITER $$
CREATE PROCEDURE UpdateBatchEndDate(IN new_EndDate varchar(255),IN user_topic_name varchar(255))
BEGIN
	UPDATE batch
    SET end_date=new_EndDate
    WHERE topic_name=user_topic_name;
END $$
delimiter ;
call UpdateBatchEndDate('2023-02-15','JDBC');