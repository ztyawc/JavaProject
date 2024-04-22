package jc;

import java.util.Random;
import java.util.Scanner;

public class lian {

    public static void main(String[] args) {
        final Random random = new Random();
        int s=random.nextInt(99);
        System.out.println("请输入一个数字");
        while (true){
            Scanner scanner=new Scanner(System.in);
            int b=scanner.nextInt();
            if(b>s){
                System.out.println("大了");
            }else if (b<s){
                System.out.println("小了");
            }else {
                System.out.println("对了");
                break;
            }
        }

    }
}
