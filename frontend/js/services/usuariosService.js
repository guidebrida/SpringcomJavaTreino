angular.module("appPostagens").factory("usuarioAPI", function($http, config){


    var _getUsuarios = function(){
        return $http.get(config.baseUrl + "/usuarios")
    }

    return{
        getUsuarios:_getUsuarios,
    }
})