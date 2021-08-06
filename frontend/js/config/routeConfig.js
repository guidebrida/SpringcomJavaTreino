angular.module("appPostagens").config(function($routeProvider, $locationProvider){

    $locationProvider.hashPrefix('');
    $routeProvider.when("/usuarios", {
        templateUrl: './view/usuarios.html',
        controller: "usuariosCtrl",
    });
    $locationProvider.hashPrefix('');
    $routeProvider.when("/inicio", {
        templateUrl: './view/inicio.html',
        controller: "usuariosCtrl",
    });
    $locationProvider.hashPrefix('');
    $routeProvider.when("/postagens", {
        templateUrl: './view/postagens.html',
        controller: "postagensCtrl",
    });



    $routeProvider.otherwise({
        redirectTo: "/inicio"
    });
     
})