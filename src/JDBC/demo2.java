package JDBC;

public class demo2 {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.insertUser("student1",2,"张三");
        userDao.selectUsers();
    }
}
