/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.services;

import country.local.Reporting.models.TicketHomeResult;
import java.util.List;

/**
 *
 * @author caman
 */
public interface TicketHomeService {

    public List<TicketHomeResult> findAll();
    public List<TicketHomeResult> findAllbyIdUbicacion(int idUbicacion);
}
