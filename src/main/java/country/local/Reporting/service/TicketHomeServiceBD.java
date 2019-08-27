/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.reporting.service;

import country.local.reporting.model.TicketHomeResult;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import country.local.reporting.dbo.MSSqlDBO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author ctorrest
 */
@Service
public class TicketHomeServiceBD implements TicketHomeService {

    @Autowired
    private MSSqlDBO dbo;

    @Value("${reporting.tickethome.view}")
    private String ticketHomeView;

    @Override
    public List<TicketHomeResult> findAll() {
        List<TicketHomeResult> thr_list = new ArrayList<>();
        try (Connection con = dbo.getConnection()) {
            ResultSet rs = con.createStatement().executeQuery(String.format("select * from %s;", ticketHomeView));
            while (rs.next()) {
                TicketHomeResult thr = new TicketHomeResult();
                ticketHomeMapping(rs, thr);
                thr_list.add(thr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketHomeServiceBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return thr_list;
    }

    private void ticketHomeMapping(ResultSet rs, TicketHomeResult thr) {
        try {
            thr.setId_atencion(rs.getInt(1));
            thr.setPaciente(rs.getString(2));
            thr.setGenero(rs.getString(3));
            thr.setCodigo_CIE10(rs.getString(4));
            thr.setDiagnostico(rs.getString(5));
            thr.setFecha_ingreso(new Timestamp(rs.getDate(6).getTime()).toLocalDateTime());
            thr.setFecha_probable_salida(new Timestamp(rs.getDate(7).getTime()).toLocalDateTime());
            thr.setCod_cama(rs.getInt(8));
            thr.setMedico_tratante(rs.getString(9));
            thr.setDias_postergacion(rs.getInt(10));
            thr.setCausal(rs.getString(11));
            thr.setUsuario(rs.getString(12));
            thr.setFecha_registro(new Timestamp(rs.getDate(13).getTime()).toLocalDateTime());

        } catch (SQLException ex) {
            Logger.getLogger(TicketHomeServiceBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
