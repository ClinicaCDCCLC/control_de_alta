/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var home = (function () {
    let timed_call = function () {
        updateEventCount();
        setTimeout(timed_call, 10000);
    };

    let updateEventCount = function () {
        $.get("/ticketHome/r", function (fragment) {
            $("#table_home").replaceWith(fragment);
        });
    };

    return {
        timed_call: timed_call
    };
})();