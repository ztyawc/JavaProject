package JDBC;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;





public class UserDao {
    public void selectUsers() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "SELECT * FROM student1";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("id: " + id + ", name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResource(conn, stmt, rs);
        }
    }

    public boolean insertUser(String tableName, int id, String name) {
        Connection conn = null;
        PreparedStatement stmt = null;
        // 确保tableName是安全的，比如来自受信任的静态列表，而不是直接用户输入
        try {
            conn = JDBCUtils.getConnection(); // 使用JDBCUtils获取数据库连接
            String sql = "INSERT INTO " + tableName + " (id, name) VALUES (?, ?)"; // 构建插入SQL语句
            stmt = conn.prepareStatement(sql);

            // 设置SQL语句中的参数
            stmt.setInt(1, id);
            stmt.setString(2, name);

            int affectedRows = stmt.executeUpdate(); // 执行插入操作
            System.out.println("插入成功！受影响的行数：" + affectedRows);
            return affectedRows > 0; // 如果影响的行数大于0，则插入成功
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("插入失败！");
            return false; // 发生异常，插入失败
        } finally {
            JDBCUtils.closeResource(conn, stmt, null); // 使用JDBCUtils关闭资源
        }
    }


}
