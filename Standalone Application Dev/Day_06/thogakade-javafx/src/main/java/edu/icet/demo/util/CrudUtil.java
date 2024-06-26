package edu.icet.demo.util;

import edu.icet.demo.db.DBConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;


public class CrudUtil {
    public static <T> T execute(String sql, Object... args) throws SQLException, ClassNotFoundException {
        PreparedStatement psTm = DBConnection.getInstance().getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            psTm.setObject((i + 1), args[i]);
        }
        if (sql.startsWith("SELECT") || sql.startsWith("select")) {
            return (T) psTm.executeQuery();
        }
        return (T) (Boolean) (psTm.executeUpdate() > 0);

    }

    public static void setAutoCommitFalse() throws SQLException, ClassNotFoundException {
        DBConnection.getInstance().getConnection().setAutoCommit(false);
    }

    public static void setAutoCommitTrue() throws SQLException, ClassNotFoundException {
        DBConnection.getInstance().getConnection().setAutoCommit(true);
    }

    public static void rollback() throws SQLException, ClassNotFoundException {
        DBConnection.getInstance().getConnection().rollback();
    }
}

