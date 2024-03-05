package test;

public class program {
    public static void main(String[] args) {
        int s = 0;
        int x = 1;
        while (x < 10){
            s += x;
            x+=2;
        }
        System.out.println(s);
    }
}