use project_tfms;
Create table User(
username varchar(20),
password varchar(10),
role varchar(10)
);

insert into User values('pp','@123','admin'),
('aa','@123','associate'),
('kk','@123','trainer');

select * from User;