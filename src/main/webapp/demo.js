angular.module('todoApp', [])
      .controller('DemoController',	
	function($scope, $http) {
    $scope.companies={};
	$scope.getCompaniesNames= function(){
	 $http.get('http://localhost:8080/MyCompany/rest/companies')
    .then(function(response) {
        $scope.companies = response.data;
    });
	}
	$scope.getCompanyByName=function(companyName){
	 $http.get('http://localhost:8080/MyCompany/rest/companies/'+companyName)
    .then(function(response) {
        $scope.companyData = response.data;
    });
	}
	
	$scope.addCompany=function(addCompany){
	 $http.post('http://localhost:8080/MyCompany/rest/companies',addCompany)
    .then(function(response) {
        $scope.companyAdded = response.data;
    });}
	
	
});

