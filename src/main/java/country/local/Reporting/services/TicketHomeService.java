/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.services;

import country.local.Reporting.dbo.queries.model.TicketHomeResult;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author caman
 */
public interface TicketHomeService {

    public List<TicketHomeResult> findAll(LocalDateTime ini_date, LocalDateTime end_date);
}
