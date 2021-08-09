angular.module("appPostagens").controller("postagensCtrl", function ($scope, postagensAPI) {
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


    $scope.formatarComentarios = _formatarcomentarios;
    getPostagens()
});
