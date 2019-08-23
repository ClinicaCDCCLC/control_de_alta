/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.dbo;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 *
 * @author ctorrest
 */
public interface DBO {

    public Connection getConnection() throws SQLException;
    public String dateFormat(LocalDateTime date);
}
