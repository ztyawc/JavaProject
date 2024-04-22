package jc;

//继承Thread
public class Thre1 extends Thread {
    @Override
    public void run(){

        for (int i = 0; i < 2000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thre1 thre =new Thre1();
        thre.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println(i);
        }
    }
}
