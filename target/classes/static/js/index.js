var index = angular.module('index', []);

index.controller('UserControl', function ($scope, $http)
{

    $scope.loadUsers = function() {
        $http.get("listusers/")
            .success(function(data)
            {
                $scope.users = data;
            });
    }

    $scope.getUser = function() {
        $http.get("user/" + $scope.userIdToSearch)
            .success(function(data)
            {
                $scope.founduser = data;
            });
    }

    $scope.addUser = function() {
        $http.post("user/" + $scope.new_email +
                            "?firstName=" + $scope.new_firstName +
                            "&lastName=" + $scope.new_lastName +
                            "&password=" + $scope.new_password)
            .success(function(data)
            {
                $scope.loadUsers();
            });
    }

    $scope.deleteUser = function(userId) {
        $http.delete("user/" + userId)
            .success(function(data)
            {
                $scope.loadUsers();
            });
    }

    $scope.loadUsers();

});