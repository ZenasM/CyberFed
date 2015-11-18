var group = angular.module('group', []);

group.controller('UserControl', function ($scope, $http)
{

    $scope.loadGroup = function() {
        $http.get("listgroups/")
            .success(function(data)
            {
                $scope.users = data;
            });
    }

    $scope.addGroup = function() {
        $http.post("group/" + "?groupName=" + $scope.groupName)
            .success(function(data)
            {
                $scope.loadGroup();
            });
    }

    $scope.deleteGroup = function(groupName) {
        $http.delete("group/" + groupName)
            .success(function(data)
            {
                $scope.loadGroup();
            });
    }

    $scope.loadGroup();

});