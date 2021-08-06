angular.module("appPostagens").controller("usuariosCtrl", function ($scope, usuarioAPI) {



    var carregarUsuarios = function () {
        usuarioAPI.getUsuarios(function (retorno) {
            $scope.usuarios = retorno.data;
        });
    };

    carregarUsuarios();
});
