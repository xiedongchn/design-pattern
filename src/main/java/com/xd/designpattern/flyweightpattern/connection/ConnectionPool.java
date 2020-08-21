package com.xd.designpattern.flyweightpattern.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * 享元模式设计的数据库连接池，避免重复创建数据库连接，浪费资源
 *
 * @author xd
 * Created on 八月/20 21:54
 */
public class ConnectionPool {
    private final Vector<Connection> pool;
    private static final int poolSize = 100;
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String username = "root";
    private static final String password = "87654321";
    private static final String driverClassName = "com.mysql.cj.jdbc.Driver";

    public ConnectionPool() {
        this.pool = new Vector<>(poolSize);
        try {
            Class.forName(driverClassName);
            pool.add(DriverManager.getConnection(url, username, password));
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection connection = pool.get(0);
            pool.remove(connection);
            return connection;
        }
        return null;
    }

    public synchronized void closeConnection(Connection connection) {
        pool.add(connection);
    }
}
