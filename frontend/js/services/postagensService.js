angular.module("appPostagens").factory("postagensAPI", function($http, config){


    var _getPostagens = function(){
        return $http.get(config.baseUrl + "/postagens")
    }

    var _postPostagens = function(post){
        return $http.post(config.baseUrl + "/postagens", post)
    }

    var _deletePostagens = function(postid){
        return $http.delete(config.baseUrl + "/postagens/"+ postid)
    }

    return{
        getPostagens:_getPostagens,
        postPostagens:_postPostagens,
        deletePostagens:_deletePostagens,
    }

})