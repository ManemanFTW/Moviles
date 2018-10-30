angular.module('app.controllers', [])
  
.controller('pageCtrl', ['$scope', '$stateParams',  // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {


}])
   
.controller('page2Ctrl', ['$scope', '$stateParams', '$http', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
	function ($scope, $stateParams, $http) {
		appid = 'demo';
		comp = $stateParams.comp;
		url = "https://www.alphavantage.co/query?function=GLOBAL_QUOTE&symbol=" + comp + "&apikey=" + appid;
		$http.get(url).then(function(response){
		$scope.symbol = response.data["Global Quote"]["01. symbol"];
		$scope.current = response.data["Global Quote"]["05. price"];
		$scope.date = response.data["Global Quote"]["07. latest trading day"];
		$scope.dif = response.data["Global Quote"]["09. change"];
		$scope.noo = dif - current;
	}, function(error){
		alert("Unable to load");
	})

}])
 