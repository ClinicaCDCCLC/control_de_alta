/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.controllers;

import country.local.Reporting.services.TicketHomeService;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author ctorrest
 */
@Controller
@RequestMapping("/ticketHome")
public class TicketHomeController {
    
    @Autowired
    TicketHomeService service;
    
    @GetMapping("/all")
    public String getTicketHome(Model model){
        LocalDateTime ini = LocalDateTime.now();
        LocalDateTime end = ini.minusMonths(6);
        model.addAttribute("ticketHomeResults", service.findAll(ini, end));
        return "ticketHomeView";
    }
}