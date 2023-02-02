use project_tfms;
drop table batch;
create table batch(
topic_name varchar(255),
start_date varchar(255),
end_date varchar(255),
batch_duration int, 
trainer_id varchar(15),
Associate_id varchar(40),
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
FOREIGN KEY (Associate_id) REFERENCES Associate(Associate_id)
);

insert into batch values ('CoreJava','2022-12-19','2023-03-19',3600,'1001','101');
insert into batch values('JDBC','2022-12-19','2023-03-19',2400,'1004','102');
insert into batch values('Spring','2022-12-19','2023-03-19',1500,'1002','104');
insert into batch values('maven','2022-12-19','2023-03-19',3000,'1003','103');