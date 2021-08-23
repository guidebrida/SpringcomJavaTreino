angular.module("appPostagens").controller("postagensCtrl", function ($scope, postagensAPI, $location) {
    $scope.app = "appPostagens";
    $scope.post = {};


    var _formatarcomentarios = function (post) {
        return post.comentario
            .map(function (comentario) {
                return "id: " + comentario.id  + " Conteudo: " + comentario.text;
            })
            .join(", ");
    };
    
    var getPostagens = function () {
        postagensAPI.getPostagens().then(function (retorno) {
            $scope.postagens = retorno.data;
            console.log( $scope.postagens)
        });
    };

    $scope.adicionarPostagem  =function(post){
        postagensAPI.postPostagens(post).then(function (data) {
            delete $scope.post;
            $location.path("/postagens")
            $scope.newPostForm.$setPristine();
            getPostagens(); 

            
        });
    }

        
    $scope.excluirPost = function (postid) {
   
        console.log(postid)
        postagensAPI.deletePostagens(postid).then(function (retorno)  {
            
        })
}



    $scope.formatarComentarios = _formatarcomentarios;
    getPostagens()
});
