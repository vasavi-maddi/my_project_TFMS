use project_tfms;

insert into trainer values
(1,'gangadhar','Java','MS','12'),
(2,'preethi','dotnet','MBA','8'),
(3,'krishna','mainframe','MCA','5'),
(4,'sathya','testing','B.tech','5');

insert into trainee values
(1,'Vasavi','dotnet','B.tech','1'),
(2,'prathamesh','testing','B.tech','1'),
(3,'aakash','Java','M.tech','2'),
(4,'krunal','mainframe','BE','1');

insert into batch values
('Core Java',3600,'2022-12-19','2023-03-19',1,4),
('Maven',2400,'2022-12-19','2023-03-19',4,3),
('Angular',4200,'2022-12-19','2023-03-19',3,2),
('Sprint',1500,'2022-12-19','2023-03-19',2,1);

insert into question_management values
(1,'Instructor','How does instructor communicate with the class'),
(2,'Course Material','Have instructor provided proper course study material'),
(3,'Learning Effectiveness','Are your all doubts being addressed and solved by the instructor'),
(4,'Environment','How is the environment of the class'),
(5,'Job Impact','How did the course help you in your job or project');

insert into capture_feedback values 
('Core Java','Instructor','How does instructor communicate with the class',5,1,1,1),
('Core Java','Course Material','Have instructor provided proper course study material',4,1,1,2),
('Core Java','Learning Effectiveness','Are your all doubts being addressed and solved by the instructor',3,3,1,1),
('Core Java','Environment','How is the environment of the class',4,3,1,1),
('Core Java','Job Impact','How did the course help you in your job or project',5,5,1,1);