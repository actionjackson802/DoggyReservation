/**
 * Created by JacksonChang408 on 6/3/2016.
 */
app.controller('CustomerController', ['$scope', '$http', function($scope, $http){


    $scope.getAllCustomers = function() {

        $http({method : 'GET',
                url : '/customer/getallcustomers'})
            .success(function(data, status) {
                $scope.customerData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert("Error");
            });
    };
    $scope.addCustomer = function(firstName,lastName,email,phoneNumber,source) {
        $http({method : 'PUT',
                url : '/customer/addcustomer',
             params : {"firstName": firstName,
                        "lastName": lastName,
                        "email": email,
                        "phoneNumber": phoneNumber,
                        "source": source}})
            .success(function(data, status) {
                $scope.customerData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert(status);
            });
    };

}]);