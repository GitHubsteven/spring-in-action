package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * @version 1.0.0 COPYRIGHT © 2001 - 2018 VOYAGE ONE GROUP INC. ALL RIGHTS RESERVED.
 * @Author rongbin.xie
 * @Description:
 * @Date: Created at 11:20 2018/4/18.
 */
public class ConnectUtil {
    private static Logger logger = LoggerFactory.getLogger(ConnectUtil.class);

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/study?useSSL=false";
            String userName = "root";
            String password = "123456";
            connection = DriverManager.getConnection(url, userName, password);
            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            logger.error("error when build connection", e);
        }
        return null;
    }

    public static void close(ResultSet st , PreparedStatement ps, Connection con){
        try {
            if(null != st) st.close();
            if(null != ps) ps.close();
            if(null != con) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
