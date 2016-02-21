<!doctype html>
<html ng-app="todoApp">
	<head>
		<title>Company Demo</title>
		<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
    	<script src="demo.js"></script>
	</head>

	<body ng-controller="DemoController">
	<div>
	<button ng-click="getCompaniesNames()">Get all companies</button>
	<table cellpading="2" cellspacing="2" border="1" ng-if= "companies != null">
     <tr>
     <th>CompanyId</th>
     <th>Name</th>
     <th>Address</th>
     <th>City</th>
     <th>Country</th>    
       </tr>  
    <tr ng-repeat= "x in companies">

    <td>{{x.companyId}}</td>
    <td>{{x.name}}</td>
    <td>{{x.address}}</td>
    <td>{{x.city}}</td>
    <td>{{x.country}}</td>
    
     </tr>

   </table>
	</div>
	
	
	<div>
	<input type="text" ng-model="companyName"/>
	<button ng-click="getCompanyByName(companyName)"> Get Company</button>
	<table cellpading="2" cellspacing="2" border="1" ng-if= "companyData != null">
     <tr>
     <th>CompanyId</th>
     <th>Name</th>
     <th>Address</th>
     <th>City</th>
     <th>Country</th> 
     <th colspan={{companyData.beneficialOwners.length}}>Owners </th>	 
       </tr>  
    <tr>

    <td>{{companyData.companyId}}</td>
    <td>{{companyData.name}}</td>
    <td>{{companyData.address}}</td>
    <td>{{companyData.city}}</td>
    <td>{{companyData.country}}</td>
	<td ng-repeat= "y in companyData.beneficialOwners">{{y}}</td>
    
     </tr>

   </table>
	</div>
	
	<!-- addnew company -->
	
	<div>
	Add new company>
	<table cellpading="2" cellspacing="2" border="1" >
	 <tr>
	 <td>Name</td>
	 <td>Address</td>
	 <td>City</td>
	 <td>Country</td>
	</tr>
	<tr>
	<td><input type="text" ng-model="newCompany.name"/></td>
	<td><input type="text" ng-model="newCompany.address"/></td>
	<td><input type="text" ng-model="newCompany.city"/></td>
	<td><input type="text" ng-model="newCompany.country"/></td>
	</tr>
	</table>
	<button ng-click="addCompany(newCompany)"> Add Company</button>
	{{companyAdded.message}}
	</div>
	
	
</body>
</html>