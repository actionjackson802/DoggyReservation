/**
 * Created by JacksonChang408 on 6/13/2016.
 */
app.controller('ReservationController', ['$scope', '$http', function($scope, $http){


    $scope.getAllReservations = function() {

        $http({method : 'GET',
            url : '/reservation/getallreservations'})
            .success(function(data, status) {
                $scope.reservationData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert("Error");
            });
    };
    $scope.addReservation = function(startDate,endDate,meetAndGreet,netAmount){//,customer,dogs){
        console.log(startDate);
        $http({method : 'PUT',
            url : '/reservation/addreservation',
            params : {"startDate": startDate,
                "endDate": endDate,
                "meetAndGreet": meetAndGreet,
                "netAmount": netAmount
                //"customer": customer,
                //"dogs" : dogs
            }})
            .success(function(data, status) {
                $scope.reservationData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert(status);
            });
    };

}]);