/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ticketHome = (function () {
    var GREEN = 1;
    var YELLOW = 2;
    var RED = 3;

    var getColorClass = function (id, color) {
        console.log(id + "," + color);
        let _color = color === GREEN ? "table-success" :
                color === YELLOW ? "table-warning" :
                color === RED ? "table-danger" :
                "table-default";

        $(`#${id}`).addClass(_color);
    };

    return {getColorClass: getColorClass()};
})();