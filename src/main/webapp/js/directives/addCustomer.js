/**
 * Created by JacksonChang408 on 6/11/2016.
 */
app.directive('addCustomer', function() {
    return {
        restrict: 'E',
        scope: false,
        templateUrl: 'js/directives/addCustomer.html'
    };
});