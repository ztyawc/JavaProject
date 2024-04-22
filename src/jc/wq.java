package jc;

public class wq {
    public static void main(String[] args) {
        int a,b,c;
        for (int i=200;i<=300;i++){
            a=i%10;
            b=(i/10)%10;
            c=i/100;
            if(a*b*c==42&&a+b+c==12){
                System.out.println(i);
            }

        }
    }
}
