================================================
Mycompany REST demo mini project
================================================
Author:Himanshu Singh
Date: 15th Feb, 2016.

 API that supports the following: 
+ Create new company 
+ Get a list of all companies 
+ Get details about a company 
+ Able to update a company 
+ Able to add beneficial owner(s) of the company 

A company has the following attributes: 
+ Company ID 
+ Name 
+ Address 
+ City 
+ Country 
+ E­mail (not required) 
+ Phone Number (not required) 
+ One or more beneficial owner(s) 
This project has goen through very basic level of testing.

URI exposed in this project are:
 http://localhost:8080/MyCompany/companies
 http://localhost:8080/MyCompany/companies/{companyName}
 http://localhost:8080/MyCompany/companies/update 
 http://localhost:8080/MyCompany/companies/addOwner;owner=newOwner
