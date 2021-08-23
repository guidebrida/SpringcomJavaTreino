angular.module("appPostagens").controller("usuariosCtrl", function ($scope, usuarioAPI, $route) {
    $scope.app = "appPostagens";
    $scope.us = {};


    var _formatarusuarios = function (us) {
        return us.postagem
            .map(function (postagem) {
                return "id: " + postagem.id  + " Titulo: " + postagem.titulo + " Postagem: " + postagem.body;
            })
            .join(", ");
    };

    var carregarUsuarios = function () {
        usuarioAPI.getUsuarios().then(function (retorno) {
            $scope.usuarios = retorno.data;
        });
    };

    $scope.adicionarUsuario = function (us) {
        usuarioAPI.postUsuarios(us).then(function (data) {
            delete $scope.us;
            $scope.newUserForm.$setPristine();
            carregarUsuarios();          
            $route.reload()
        });
    };

    carregarUsuarios();
    $scope.formatarUsuarios = _formatarusuarios;
});
