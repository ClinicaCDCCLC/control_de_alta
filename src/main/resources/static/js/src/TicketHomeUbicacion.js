/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var ubc = (function () {
    let ubicacion;

    let timed_call = function (id_ubicacion) {
        if (typeof ubicacion === 'undefined') {
            ubicacion = id_ubicacion;
        }
        updateEventCount();
        setTimeout(timed_call, 10000);
    };

    let updateEventCount = function () {
        $.get(`/ticketHome/idUbicacion=${ubicacion}/r`, function (fragment) {
            $("#table_ubc").replaceWith(fragment);
        });
    };

    return {
        timed_call: timed_call
    };
})();