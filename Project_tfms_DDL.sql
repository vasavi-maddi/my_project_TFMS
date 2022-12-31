DROP DATABASE IF EXISTS Project_TFMS;
CREATE DATABASE Project_TFMS;
USE Project_TFMS;

DROP TABLE IF EXISTS Trainer;
CREATE TABLE Trainer
(
	Trainer_id INT PRIMARY KEY,
    Trainer_name VARCHAR(50),
    Track ENUM('Java','dotnet','mainframe','testing'),
    Qualification VARCHAR(20),
    Experience VARCHAR(15)
);

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee
(
	Trainee_id INT PRIMARY KEY,
    Trainee_name VARCHAR(50),
    Track ENUM('Java','dotnet','mainframe','testing'),
    Qualification VARCHAR(20),
    Experience VARCHAR(15)
);

DROP TABLE IF EXISTS Batch;
CREATE TABLE Batch
(
	Topic_name VARCHAR(50),
    Duration INT,
    Start_date DATE,
    End_date DATE,
    Trainer_id INT REFERENCES Trainer(Trainer_id),
    Trainee_id INT REFERENCES Trainee(Trainee_id)
);

DROP TABLE IF EXISTS Question_management;
CREATE TABLE Question_management
(
	Question_id INT PRIMARY KEY,
    Question_section ENUM('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
    Question_text TEXT
);

DROP TABLE IF EXISTS Capture_feedback;
CREATE TABLE Capture_feedback
(
	Topic_name VARCHAR(50),
    Question_section ENUM('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
    Question_text TEXT,
    Rating INT,
    Question_id INT REFERENCES Question_management(Question_id),
    Trainer_id INT REFERENCES Trainer(Trainer_id),
    Trainee_id INT REFERENCES Trainee(Trainee_id)
);
