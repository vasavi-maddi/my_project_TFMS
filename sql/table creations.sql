DROP DATABASE IF EXISTS Project_TFMS;
CREATE DATABASE Project_TFMS;
USE project_tfms;

create table trainer_details(
trainer_id VARCHAR(15),
trainer_name VARCHAR(55) NOT NULL,
track ENUM('java', 'dot net', 'mainframe', 'testing') NOT NULL,
qualification VARCHAR(55) NOT NULL,
experience VARCHAR(15) NOT NULL,
PRIMARY KEY(trainer_id)
);

INSERT INTO trainer_details VALUES('1001','GANGADHR PARDE', 'java', 'M.TECH', '10 YRS');
INSERT INTO trainer_details VALUES('1002','GANGADHR PARDE', 'java', 'M.TECH', '10 YRS');
INSERT INTO trainer_details VALUES('1003','PREETI AGRWAL', 'mainframe', 'M.TECH', '10 YRS');
INSERT INTO trainer_details VALUES('1004','AKASH SOLANKE', 'testing', 'M.TECH', '10 YRS');

select * from trainer_details;

drop table Associate;
CREATE TABLE Associate
(    
    Associate_id VARCHAR(40) NOT NULL,
    Associate_name VARCHAR(30),
    Associate_track ENUM('java','dotnet','mainframe','testing') NOT NULL,
    Associate_qualification VARCHAR(10),
    Associate_experience VARCHAR(20),
    PRIMARY KEY(Associate_id)
);

INSERT INTO Associate VALUES('101','Aakash','Java','M-Tech','5');
INSERT INTO Associate VALUES('102','krunal','Mainframe','M.sc','6');
INSERT INTO Associate VALUES('103','vasavi','testing','MCA','8');
INSERT INTO Associate VALUES('104','prathamesh','DotNet','B-Tech','7');
INSERT INTO Associate VALUES('105','Ankita','Java','M-Tech','10');
INSERT INTO Associate VALUES('106','Swaraj','Mainframe','MCA','12');
INSERT INTO Associate VALUES('107','ram','testing','MCA','12');
INSERT INTO Associate VALUES('108','shriram','DotNet','B.tech','20');
INSERT INTO Associate VALUES('109','veera','Java','M-Tech','12');
INSERT INTO Associate VALUES('110','hemlata','Mainframe','M.sc','12');

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

Drop table if exists question_management;
create table question_management(
question_id varchar(10) primary key,
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(300)
);


Drop table if exists capture_feedback;
create table caShowBatchDetailsAddBatchDetailspture_feedback(
trainer_id varchar(15),
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
Associate_id varchar(40),
FOREIGN KEY (Associate_id) REFERENCES Associate(Associate_id),
topic_name varchar(255),
question_id varchar(10),
foreign key (question_id) references question_management(question_id),
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(255),
rating int
);

