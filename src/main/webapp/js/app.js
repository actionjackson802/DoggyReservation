/**
 * Created by JacksonChang408 on 5/21/2016.
 */
var app = angular.module('ReservationApp', ['ngRoute']);
//var app = angular.module('ReservationApp', ['ui.router']);
app.config(function ($routeProvider) {
    $routeProvider
        .when('/', {
            controller: 'HomeController',
            templateUrl: 'views/home.html'
        })
        /*.when('/photos/:id',{
            controller: 'PhotoController',
            templateUrl: 'views/photo.html'
        })*/
        .when('/allcustomers', {
            controller: 'CustomerController',
            templateUrl: 'views/AllCustomers.html'
        })
        .when('/addcustomer', {
            controller: 'CustomerController',
            templateUrl: 'views/AddCustomer.html'
        })
        .when('/alldogs', {
            controller: 'DogController',
            templateUrl: 'views/AllDogs.html'
        })
        .when('/adddog', {
            controller: 'DogController',
            templateUrl: 'views/AddDog.html'
        })
        .when('/allreservations', {
            controller: 'ReservationController',
            templateUrl: 'views/AllReservations.html'
            //templateUrl: 'views/temp.html'
        })
        .when('/addreservation', {
            controller: 'ReservationController',
            templateUrl: 'views/AddReservation.html'
        })
        .otherwise({
            redirectTo: '/'
        });
});