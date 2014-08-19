package com.github.jkschneider.gremlinsql.jdbc

import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.sql.SQLException
import java.sql.SQLFeatureNotSupportedException
import java.util.logging.Logger

class GremlinDriver implements Driver {
    @Override
    Connection connect(String url, Properties info) throws SQLException {
        return null
    }

    @Override
    boolean acceptsURL(String url) throws SQLException {
        return false
    }

    @Override
    DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
        return new DriverPropertyInfo[0]
    }

    @Override
    int getMajorVersion() {
        return 0
    }

    @Override
    int getMinorVersion() {
        return 0
    }

    @Override
    boolean jdbcCompliant() {
        return false
    }

    @Override
    Logger getParentLogger() throws SQLFeatureNotSupportedException {
        return null
    }
}
