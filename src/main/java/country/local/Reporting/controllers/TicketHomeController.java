/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.controllers;

import country.local.Reporting.services.TicketHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String getAllTicketHome(Model model) {
        model.addAttribute("ticketHomeResults", service.findAll());
        return "ticketHomeView";
    }

    @GetMapping("/idUbicacion={id_ubicacion}")
    public String getTicketHomeByIdUbicacion(@PathVariable int id_ubicacion, Model model) {
        model.addAttribute("ticketHomeResults", service.findAllbyIdUbicacion(id_ubicacion));
        return "ticketHomeView";
    }
}
