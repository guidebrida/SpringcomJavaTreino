angular.module("appPostagens").factory("usuarioAPI", function($http, config){


    var _getUsuarios = function(){
        return $http.get(config.baseUrl + "/usuarios")
    }

    var _postUsuarios = function(us){
        return $http.post(config.baseUrl + "/usuarios", us)
    }

    return{
        getUsuarios:_getUsuarios,
        postUsuarios:_postUsuarios,
    }
})