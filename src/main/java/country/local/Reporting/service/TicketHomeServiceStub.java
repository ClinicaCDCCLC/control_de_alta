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
@Service
public class TicketHomeServiceStub implements TicketHomeService {

    private ArrayList<TicketHomeResult> results;

    @Override
    public List<TicketHomeResult> findAll(LocalDateTime ini_date, LocalDateTime end_date) {
        if (results == null) {
            results = new ArrayList<>();
        }
        return results;
    }
}
