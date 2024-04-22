package Excep;

public class demo1 {
    public static void main(String[] args) {
        try {
            System.out.println(11/0);
        }catch (Exception e){
        System.out.println("出现上述异常才会执行我");
        e.printStackTrace();
        }finally {
            System.out.println("无论是否出现异常都会执行我");
        }
    }
}
