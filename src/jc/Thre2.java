package jc;

public class Thre2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("兔子");
        }
    }

    public static void main(String[] args) {
        Thre2 thre2 =new Thre2();
        new Thread(thre2).start();
        for (int i = 0; i < 400; i++) {

            System.out.println("乌龟");
        }
    }
}
