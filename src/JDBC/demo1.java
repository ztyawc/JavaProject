package JDBC;

import java.sql.*;

public class demo1 {
    public static void main(String[] args) {
        try {
            String url="jdbc:mysql://1.15.155.221:3310/mysql?useUnicode=true&characterEncoding=utf8&useSSL=false";
            String username="root";
            String password="123456";

            // 建立连接
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            // SQL 查询语句
            String sql = "select * from student1";
            ResultSet resultSet = statement.executeQuery(sql);

            // 获取结果集的元数据
            ResultSetMetaData rsmd = resultSet.getMetaData();

            // 通过元数据获取列的数量
            int columnCount = rsmd.getColumnCount();

            // 处理结果集
            while (resultSet.next()) {
                // 对于每一行，遍历所有列
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + " ");
                }
                System.out.println(); // 每打印完一行数据后换行
            }

            // 关闭资源
            resultSet.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}