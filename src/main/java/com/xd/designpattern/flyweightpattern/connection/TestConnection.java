package com.xd.designpattern.flyweightpattern.connection;

import org.junit.Test;

import java.sql.Connection;

/**
 * Description
 *
 * @author xd
 * Created on 八月/20 22:04
 */
public class TestConnection {

    @Test
    public void test1() {
        ConnectionPool connectionPool = new ConnectionPool();
        Connection connection = connectionPool.getConnection();
        connectionPool.closeConnection(connection);
    }
}
