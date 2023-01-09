use project_tfms;

insert into trainer values
('T001','Trainer1','Java','MS','12'),
('T002','Trainer2','dotnet','MBA','8'),
('T003','Trainer3','mainframe','B.Tech','5'),
('T004','Trainer4','testing','MCA','5');

insert into trainee values
('A001','Trainee1','dotnet','B.Tech','1'),
('A002','Trainee2','testing','B.Tech','1'),
('A003','Trainee3','Java','M.Tech','2'),
('A004','Trainee4','mainframe','BE','1');

insert into batch values
('Core Java','3600','2022-12-19','2023-03-19','T001','A001'),
('MAven','2400','2022-12-19','2023-03-19','T004','A002'),
('Angular','4200','2022-12-19','2023-03-19','T003','A004'),
('Sprint','1500','2022-12-19','2023-03-19','T002','A003');

insert into question_management values
('Q001','Instructor','How does instructor communicate with the class'),
('Q002','Course Material','Have instructor provided proper course study material'),
('Q003','Learning Effectiveness','Are your all doubts being addressed and solved by the instructor'),
('Q004','Environment','How is the environment of the class'),
('Q005','Job Impact','How did the course help you in your job or project');

insert into capture_feedback values 
('T001','A003','Core Java','Q001','Instructor','How does instructor communicate with the class',4),
('T001','A003','Core Java','Q002','Course Material','Have instructor provided proper course study material',3),
('T001','A003','Core Java','Q003','Learning Effectiveness','Are your all doubts being addressed and solved by the instructor',4),
('T001','A003','Core Java','Q004','Environment','How is the environment of the class',5),
('T001','A003','Core Java','Q005','Job Impact','How did the course help you in your job or project',3);