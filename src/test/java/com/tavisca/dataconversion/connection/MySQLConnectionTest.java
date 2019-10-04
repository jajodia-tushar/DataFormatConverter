package com.tavisca.dataconversion.connection;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.Assert.assertTrue;

public class MySQLConnectionTest {

    @Test
    public void canEstablishConnectionWithMySQLServer() throws SQLException, ClassNotFoundException {
        Connection connection = MySQLConnection.getConnection();
        assertTrue(connection != null);
    }
}
