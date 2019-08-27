/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.reporting.service;

import country.local.reporting.model.TicketHomeResult;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author caman
 */
//@Service
public class TicketHomeServiceStub implements TicketHomeService {

    private ArrayList<TicketHomeResult> results;

    @Override
    public List<TicketHomeResult> findAll() {
        if (results == null) {
            results = new ArrayList<>();

            TicketHomeResult thr = new TicketHomeResult();
            thr.setId_atencion(1);
            thr.setPaciente("CAMILO TORRES");
            thr.setGenero("Masculino");
            thr.setCodigo_CIE10("J46X");
            thr.setDiagnostico("ESTADO ASMATICO - (J46X)");
            thr.setFecha_ingreso(LocalDateTime.now());
            thr.setFecha_probable_salida(LocalDateTime.now());
            thr.setCod_cama(504);
            thr.setMedico_tratante("DIANA MARCELA BUSTOS TRIANA");
            thr.setDias_postergacion(0);
            thr.setCausal("NULL");
            thr.setUsuario("ASTRID CAMARGO");
            thr.setFecha_registro(LocalDateTime.now());

            results.add(thr);
        }
        return results;
    }
}
