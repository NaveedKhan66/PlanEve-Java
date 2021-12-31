create database PlanEve_DB;
GO
use PlanEve_DB;

create table Vendors
(
    vendorID int,
    name varchar(100),
    type varchar(100),
    description varchar(500),
    Email varchar(50),
    password varchar(10)
);
GO
