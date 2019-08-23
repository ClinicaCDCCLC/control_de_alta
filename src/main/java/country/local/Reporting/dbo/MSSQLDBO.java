/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package country.local.Reporting.dbo;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author ctorrest
 */
@Service
public class MSSQLDBO implements DBO {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    SQLServerDataSource ds;

    @Value("${mssql.server}")
    private String server;

    @Value("${mssql.portnumber}")
    private int portnumber;

    @Value("${mssql.database.cty_pri}")
    private String database;

    @Value("${mssql.user}")
    private String user;

    @Value("${mssql.password}")
    private String password;

    @Override
    public Connection getConnection() throws SQLException {
        if (ds == null) {
            ds = new SQLServerDataSource();
            ds.setIntegratedSecurity(false);
            ds.setServerName(server);
            ds.setPortNumber(portnumber);
            ds.setDatabaseName(database);
            ds.setUser(user);
            ds.setPassword(password);
        }
        return ds.getConnection();
    }

    @Override
    public String dateFormat(LocalDateTime date) {
        return date.format(formatter);
    }
}
