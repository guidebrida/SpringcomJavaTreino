angular.module("appPostagens").controller("usuariosCtrl", function ($scope, usuarioAPI) {



    var carregarUsuarios = function () {
        usuarioAPI.getUsuarios().then(function (retorno) {
            $scope.usuarios = retorno.data;
        });
    };

    carregarUsuarios();
});
