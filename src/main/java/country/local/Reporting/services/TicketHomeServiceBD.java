/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.services;

import country.local.Reporting.dao.TicketHomeMapper;
import country.local.Reporting.models.TicketHomeResult;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ctorrest
 */
@Service
public class TicketHomeServiceBD implements TicketHomeService {

    @Autowired
    private TicketHomeMapper th_mapper;

    @Override
    public List<TicketHomeResult> findAll() {
        return th_mapper.findAll();
    }

    @Override
    public List<TicketHomeResult> findAllbyIdUbicacion(int idUbicacion) {
        return th_mapper.findByIdUbicacion(idUbicacion);
    }
}
