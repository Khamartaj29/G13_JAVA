use suretrust
create table registration(name varchar(25),username varchar(20),email varchar(30),Mobile varchar(10),password varchar(20),gender char(10),age int, Designation varchar(8));
desc registration;
select*from registration;
drop table registration;
create table Patient(PId varchar(10) , PName varchar(30) ,Gender varchar(10), Mobile bigint, Address varchar(50));

CREATE TABLE `Patient` (
  `PId` varchar(20) NOT NULL primary key,
  `PName` varchar(30) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Mobile` bigint NOT NULL,
  `Address` varchar(50) NOT NULL
);

desc patient;
drop table patient;
select*from patient;


CREATE TABLE `doctor_record` (
  `id` varchar(200) NOT NULL primary key,
  `DoctorName` text NOT NULL,
  `Specialization` text NOT NULL
);

select*from doctor_record;
drop table doctor_record;

