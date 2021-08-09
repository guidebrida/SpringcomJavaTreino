angular.module("appPostagens").factory("postagensAPI", function($http, config){


    var _getPostagens = function(){
        return $http.get(config.baseUrl + "/postagens")
    }

  
    return{
        getPostagens:_getPostagens,
    }

})