/**
 * Created by JacksonChang408 on 6/12/2016.
 */
app.controller('DogController', ['$scope', '$http', function($scope, $http){


    $scope.getAllDogs = function() {

        $http({method : 'GET',
            url : '/dog/getalldogs'})
            .success(function(data, status) {
                $scope.dogData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert("Error");
            });
    };
    $scope.addDog = function(dogName,dogSex,dogWeight,dogBreed,dogSpayed,dogNotes){
        $http({method : 'PUT',
            url : '/dog/adddog',
            params : {"dogName": dogName,
                "dogSex": dogSex,
                "dogWeight": dogWeight,
                "dogBreed": dogBreed,
                "dogSpayed": dogSpayed,
                "dogNotes" : dogNotes
            }})
            .success(function(data, status) {
                $scope.dogData = data;
                $scope.status = status;
            })
            .error(function(data, status) {
                alert(status);
            });
    };

}]);


