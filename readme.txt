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
This project has gone through very basic level of testing.

URI exposed in this project are:
 http://localhost:8080/MyCompany/rest/companies
 http://localhost:8080/MyCompany/rest/companies/{companyName}
 http://localhost:8080/MyCompany/rest/companies/update 
 http://localhost:8080/MyCompany/rest/companies/addOwner;owner=newOwner
 
 I have tested all URIs with postman crome plugin.
 To access using Crome browser with URL http://localhost:8080/MyCompany/ which is having Anguilar client. 
 The angular client demonstrates to get the list of all companies, addition of companies and search of a company using a name.
 Negative cases has not been handled or tested.
 
 
