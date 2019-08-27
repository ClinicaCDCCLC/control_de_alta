/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.reporting.controller;

import country.local.reporting.service.TicketHomeService;
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

    @GetMapping
    public String getTicketHome(Model model) {
        model.addAttribute("ticketHomeResults", service.findAll());
        return "ticketHomeView";
    }
}
