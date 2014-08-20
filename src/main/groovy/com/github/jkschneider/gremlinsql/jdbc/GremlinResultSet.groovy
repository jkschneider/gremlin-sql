package com.github.jkschneider.gremlinsql.jdbc

import com.tinkerpop.gremlin.java.GremlinPipeline

import java.sql.Array
import java.sql.Blob
import java.sql.Clob
import java.sql.NClob
import java.sql.Ref
import java.sql.ResultSet
import java.sql.ResultSetMetaData
import java.sql.RowId
import java.sql.SQLException
import java.sql.SQLWarning
import java.sql.SQLXML
import java.sql.Statement
import java.sql.Time
import java.sql.Timestamp

class GremlinResultSet implements ResultSet {
    GremlinPipeline pipeline
    Object result
    boolean afterLast = false
    boolean first = true

    public GremlinResultSet(GremlinPipeline pipeline) {
        this.pipeline = pipeline
    }

    @Override
    boolean next() throws SQLException {
        first = false
        boolean hasNext = pipeline.hasNext()
        if(hasNext)
           result = pipeline.next()
        else
            afterLast = true
        return hasNext
    }

    @Override
    void close() throws SQLException {
    }

    @Override
    boolean wasNull() throws SQLException {
        return false
    }

    @Override
    String getString(int columnIndex) throws SQLException {
        return null
    }

    @Override
    boolean getBoolean(int columnIndex) throws SQLException {
        return false
    }

    @Override
    byte getByte(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    short getShort(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    int getInt(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    long getLong(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    float getFloat(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    double getDouble(int columnIndex) throws SQLException {
        return 0
    }

    @Override
    BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
        return null
    }

    @Override
    byte[] getBytes(int columnIndex) throws SQLException {
        return new byte[0]
    }

    @Override
    java.sql.Date getDate(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Time getTime(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Timestamp getTimestamp(int columnIndex) throws SQLException {
        return null
    }

    @Override
    InputStream getAsciiStream(int columnIndex) throws SQLException {
        return null
    }

    @Override
    InputStream getUnicodeStream(int columnIndex) throws SQLException {
        return null
    }

    @Override
    InputStream getBinaryStream(int columnIndex) throws SQLException {
        return null
    }

    private void checkHasColumn(String columnLabel, Class<?>... cs) throws SQLException {
        if(!result.hasProperty(columnLabel))
            throw new SQLException("Unknown column $columnLabel")
        def resultType = result[columnLabel].class
        if(cs.inject(false) { acc, c -> acc || c.isAssignableFrom(resultType) })
            throw new SQLException("Column $columnLabel is not of the correct type")
    }

    @Override
    String getString(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, String.class)
        return result[columnLabel] as String
    }

    @Override
    boolean getBoolean(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Boolean.class)
        return result[columnLabel] as Boolean
    }

    @Override
    byte getByte(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Byte.class)
        return result[columnLabel] as Byte
    }

    @Override
    short getShort(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Short.class)
        return result[columnLabel] as Short
    }

    @Override
    int getInt(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Integer.class)
        return result[columnLabel] as Integer
    }

    @Override
    long getLong(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Long.class)
        return result[columnLabel] as Long
    }

    @Override
    float getFloat(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Float.class)
        return result[columnLabel] as Float
    }

    @Override
    double getDouble(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Double.class)
        return result[columnLabel] as Double
    }

    @Override
    BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
        checkHasColumn(columnLabel, BigDecimal.class)
        return result[columnLabel] as BigDecimal
    }

    @Override
    byte[] getBytes(String columnLabel) throws SQLException {
        // TODO implement me
        return new byte[0]
    }

    @Override
    java.sql.Date getDate(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Long.class, Date.class, java.sql.Date.class)
        def result = result[columnLabel]
        if(result instanceof Long)
            return new java.sql.Date(result as Long)
        if(result instanceof Date)
            return new java.sql.Date((result as Date).getTime())
        return result // result is already java.sql.Date
    }

    @Override
    Time getTime(String columnLabel) throws SQLException {
        checkHasColumn(columnLabel, Long.class, Time.class)
        def result = result[columnLabel]
        if(result instanceof Long)
            return new Time(result as Long)
        return result // result is already java.sql.Time
    }

    @Override
    Timestamp getTimestamp(String columnLabel) throws SQLException {
        def result = result[columnLabel]
        if(result instanceof Long)
            return new Timestamp(result as Long)
        if(result instanceof Date)
            return new Timestamp((result as Date).getTime())
        return result // result is already java.sql.Timestamp
    }

    @Override
    InputStream getAsciiStream(String columnLabel) throws SQLException {
        def result = result[columnLabel]
        return new ByteArrayInputStream(result.toString().getBytes("UTF-8"))
    }

    @Override
    InputStream getUnicodeStream(String columnLabel) throws SQLException {
        return null
    }

    @Override
    InputStream getBinaryStream(String columnLabel) throws SQLException {
        return null
    }

    @Override
    SQLWarning getWarnings() throws SQLException {
        return null
    }

    @Override
    void clearWarnings() throws SQLException {
    }

    @Override
    String getCursorName() throws SQLException {
        return null
    }

    @Override
    ResultSetMetaData getMetaData() throws SQLException {
        return null
    }

    @Override
    Object getObject(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Object getObject(String columnLabel) throws SQLException {
        return null
    }

    @Override
    int findColumn(String columnLabel) throws SQLException {
        return 0
    }

    @Override
    Reader getCharacterStream(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Reader getCharacterStream(String columnLabel) throws SQLException {
        return null
    }

    @Override
    BigDecimal getBigDecimal(int columnIndex) throws SQLException {
        return null
    }

    @Override
    BigDecimal getBigDecimal(String columnLabel) throws SQLException {
        return null
    }

    @Override
    boolean isBeforeFirst() throws SQLException {
        return result == null
    }

    @Override
    boolean isAfterLast() throws SQLException {
        return afterLast
    }

    @Override
    boolean isFirst() throws SQLException {
        return first
    }

    @Override
    boolean isLast() throws SQLException {
        return !pipeline.hasNext()
    }

    @Override
    void beforeFirst() throws SQLException {
        pipeline.reset()
        result = null
        afterLast = false
        first = true
    }

    @Override
    void afterLast() throws SQLException {

    }

    @Override
    boolean first() throws SQLException {
        return false
    }

    @Override
    boolean last() throws SQLException {
        return false
    }

    @Override
    int getRow() throws SQLException {
        return 0
    }

    @Override
    boolean absolute(int row) throws SQLException {
        return false
    }

    @Override
    boolean relative(int rows) throws SQLException {
        return false
    }

    @Override
    boolean previous() throws SQLException {
        return false
    }

    @Override
    void setFetchDirection(int direction) throws SQLException {

    }

    @Override
    int getFetchDirection() throws SQLException {
        return 0
    }

    @Override
    void setFetchSize(int rows) throws SQLException {

    }

    @Override
    int getFetchSize() throws SQLException {
        return 0
    }

    @Override
    int getType() throws SQLException {
        return 0
    }

    @Override
    int getConcurrency() throws SQLException {
        return 0
    }

    @Override
    boolean rowUpdated() throws SQLException {
        return false
    }

    @Override
    boolean rowInserted() throws SQLException {
        return false
    }

    @Override
    boolean rowDeleted() throws SQLException {
        return false
    }

    @Override
    void updateNull(int columnIndex) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBoolean(int columnIndex, boolean x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateByte(int columnIndex, byte x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateShort(int columnIndex, short x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateInt(int columnIndex, int x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateLong(int columnIndex, long x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateFloat(int columnIndex, float x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateDouble(int columnIndex, double x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateString(int columnIndex, String x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBytes(int columnIndex, byte[] x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateDate(int columnIndex, java.sql.Date x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateTime(int columnIndex, Time x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateObject(int columnIndex, Object x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateNull(String columnLabel) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBoolean(String columnLabel, boolean x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateByte(String columnLabel, byte x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateShort(String columnLabel, short x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateInt(String columnLabel, int x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateLong(String columnLabel, long x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateFloat(String columnLabel, float x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateDouble(String columnLabel, double x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateString(String columnLabel, String x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBytes(String columnLabel, byte[] x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateDate(String columnLabel, java.sql.Date x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateTime(String columnLabel, Time x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateBinaryStream(String columnLabel, InputStream x, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateCharacterStream(String columnLabel, Reader reader, int length) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void updateObject(String columnLabel, Object x) throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void insertRow() throws SQLException {
        throw new SQLException("Insert not supported")
    }

    @Override
    void updateRow() throws SQLException {
        throw new SQLException("Update not supported")
    }

    @Override
    void deleteRow() throws SQLException {
        throw new SQLException("Delete not supported")
    }

    @Override
    void refreshRow() throws SQLException {

    }

    @Override
    void cancelRowUpdates() throws SQLException {

    }

    @Override
    void moveToInsertRow() throws SQLException {

    }

    @Override
    void moveToCurrentRow() throws SQLException {

    }

    @Override
    Statement getStatement() throws SQLException {
        return null
    }

    @Override
    Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
        return null
    }

    @Override
    Ref getRef(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Blob getBlob(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Clob getClob(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Array getArray(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
        return null
    }

    @Override
    Ref getRef(String columnLabel) throws SQLException {
        return null
    }

    @Override
    Blob getBlob(String columnLabel) throws SQLException {
        return null
    }

    @Override
    Clob getClob(String columnLabel) throws SQLException {
        return null
    }

    @Override
    Array getArray(String columnLabel) throws SQLException {
        return null
    }

    @Override
    java.sql.Date getDate(int columnIndex, Calendar cal) throws SQLException {
        return null
    }

    @Override
    java.sql.Date getDate(String columnLabel, Calendar cal) throws SQLException {
        return null
    }

    @Override
    Time getTime(int columnIndex, Calendar cal) throws SQLException {
        return null
    }

    @Override
    Time getTime(String columnLabel, Calendar cal) throws SQLException {
        return null
    }

    @Override
    Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
        return null
    }

    @Override
    Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
        return null
    }

    @Override
    URL getURL(int columnIndex) throws SQLException {
        return null
    }

    @Override
    URL getURL(String columnLabel) throws SQLException {
        return null
    }

    @Override
    void updateRef(int columnIndex, Ref x) throws SQLException {

    }

    @Override
    void updateRef(String columnLabel, Ref x) throws SQLException {

    }

    @Override
    void updateBlob(int columnIndex, Blob x) throws SQLException {

    }

    @Override
    void updateBlob(String columnLabel, Blob x) throws SQLException {

    }

    @Override
    void updateClob(int columnIndex, Clob x) throws SQLException {

    }

    @Override
    void updateClob(String columnLabel, Clob x) throws SQLException {

    }

    @Override
    void updateArray(int columnIndex, Array x) throws SQLException {

    }

    @Override
    void updateArray(String columnLabel, Array x) throws SQLException {

    }

    @Override
    RowId getRowId(int columnIndex) throws SQLException {
        return null
    }

    @Override
    RowId getRowId(String columnLabel) throws SQLException {
        return null
    }

    @Override
    void updateRowId(int columnIndex, RowId x) throws SQLException {

    }

    @Override
    void updateRowId(String columnLabel, RowId x) throws SQLException {

    }

    @Override
    int getHoldability() throws SQLException {
        return 0
    }

    @Override
    boolean isClosed() throws SQLException {
        return false
    }

    @Override
    void updateNString(int columnIndex, String nString) throws SQLException {

    }

    @Override
    void updateNString(String columnLabel, String nString) throws SQLException {

    }

    @Override
    void updateNClob(int columnIndex, NClob nClob) throws SQLException {

    }

    @Override
    void updateNClob(String columnLabel, NClob nClob) throws SQLException {

    }

    @Override
    NClob getNClob(int columnIndex) throws SQLException {
        return null
    }

    @Override
    NClob getNClob(String columnLabel) throws SQLException {
        return null
    }

    @Override
    SQLXML getSQLXML(int columnIndex) throws SQLException {
        return null
    }

    @Override
    SQLXML getSQLXML(String columnLabel) throws SQLException {
        return null
    }

    @Override
    void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {

    }

    @Override
    void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {

    }

    @Override
    String getNString(int columnIndex) throws SQLException {
        return null
    }

    @Override
    String getNString(String columnLabel) throws SQLException {
        return null
    }

    @Override
    Reader getNCharacterStream(int columnIndex) throws SQLException {
        return null
    }

    @Override
    Reader getNCharacterStream(String columnLabel) throws SQLException {
        return null
    }

    @Override
    void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {

    }

    @Override
    void updateNCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {

    }

    @Override
    void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {

    }

    @Override
    void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {

    }

    @Override
    void updateAsciiStream(String columnLabel, InputStream x, long length) throws SQLException {

    }

    @Override
    void updateBinaryStream(String columnLabel, InputStream x, long length) throws SQLException {

    }

    @Override
    void updateCharacterStream(String columnLabel, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateBlob(int columnIndex, InputStream inputStream, long length) throws SQLException {

    }

    @Override
    void updateBlob(String columnLabel, InputStream inputStream, long length) throws SQLException {

    }

    @Override
    void updateClob(int columnIndex, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateClob(String columnLabel, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {

    }

    @Override
    void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {

    }

    @Override
    void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {

    }

    @Override
    void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {

    }

    @Override
    void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {

    }

    @Override
    void updateCharacterStream(int columnIndex, Reader x) throws SQLException {

    }

    @Override
    void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {

    }

    @Override
    void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {

    }

    @Override
    void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {

    }

    @Override
    void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {

    }

    @Override
    void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {

    }

    @Override
    void updateClob(int columnIndex, Reader reader) throws SQLException {

    }

    @Override
    void updateClob(String columnLabel, Reader reader) throws SQLException {

    }

    @Override
    void updateNClob(int columnIndex, Reader reader) throws SQLException {

    }

    @Override
    void updateNClob(String columnLabel, Reader reader) throws SQLException {

    }

    @Override
    def <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
        return null
    }

    @Override
    def <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
        return null
    }

    @Override
    def <T> T unwrap(Class<T> iface) throws SQLException {
        return null
    }

    @Override
    boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false
    }
}
