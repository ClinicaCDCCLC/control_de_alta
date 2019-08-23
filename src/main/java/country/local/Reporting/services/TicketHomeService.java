/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.services;

import country.local.Reporting.dbo.DBO;
import country.local.Reporting.dbo.queries.TicketHomeQuery;
import country.local.Reporting.dbo.queries.results.TicketHomeResult;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ctorrest
 */
@Service
public class TicketHomeService {

    @Autowired
    private DBO dbo;

    public List<TicketHomeResult> findAll(LocalDateTime ini_date, LocalDateTime end_date) {
        List<TicketHomeResult> thr_list = new ArrayList<>();
        try ( Connection con = dbo.getConnection();  Statement smt = con.createStatement();) {
            TicketHomeQuery thq = new TicketHomeQuery(dbo.dateFormat(ini_date), dbo.dateFormat(end_date));
            smt.execute(thq.getSetUp());
            ResultSet rs = smt.executeQuery(thq.getResult());
            smt.execute(thq.getCleanUp());
            while (rs.next()) {
                TicketHomeResult thr = new TicketHomeResult();
                ticketHomeMapping(rs, thr);
                thr_list.add(thr);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketHomeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return thr_list;
    }

    private void ticketHomeMapping(ResultSet rs, TicketHomeResult thr) {
        try {
            thr.setIdAtencion(rs.getInt(1));
            thr.setPaciente(rs.getString(2));
            thr.setGenero(rs.getString(3));
            thr.setCodigo_CIE10(rs.getString(4));
            thr.setDiagnostico(rs.getString(5));
            thr.setFecha_Ingreso(new Timestamp(rs.getDate(6).getTime()).toLocalDateTime());
            thr.setFecha_Probable_Salida(new Timestamp(rs.getDate(7).getTime()).toLocalDateTime());
            thr.setCodCama(rs.getInt(8));
            thr.setMedico_Tratante(rs.getString(9));
            thr.setFecha_Egreso(new Timestamp(rs.getDate(10).getTime()).toLocalDateTime());
            thr.setDiasPostergacion(rs.getInt(11));
            thr.setCausal(rs.getString(12));
            thr.setUsuario(rs.getString(13));
            thr.setFecha_Registro(new Timestamp(rs.getDate(14).getTime()).toLocalDateTime());
            thr.setEdad(rs.getString(15));
            thr.setCodCie1(rs.getString(16));
            thr.setNomDiagnostico1(rs.getString(17));
            thr.setCodCie2(rs.getString(18));
            thr.setNomDiagnostico2(rs.getString(19));
            thr.setCodCie3(rs.getString(20));
            thr.setNomDiagnostico3(rs.getString(21));
            thr.setCodCie4(rs.getString(22));
            thr.setNomDiagnostico4(rs.getString(23));
            thr.setCodCie5(rs.getString(24));
            thr.setNomDiagnostico5(rs.getString(25));
            thr.setCodCie6(rs.getString(26));
            thr.setNomDiagnosticoEgreso(rs.getString(27));

        } catch (SQLException ex) {
            Logger.getLogger(TicketHomeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
