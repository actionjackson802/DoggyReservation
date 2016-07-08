/**
 * Created by JacksonChang408 on 6/12/2016.
 */
app.directive('addDog', function() {
    return {
        restrict: 'E',
        scope: false,
        templateUrl: 'js/directives/addDog.html'
    };
});