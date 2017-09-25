import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner imput=new Scanner(System.in);
        int x,a,b,c,d,e;
        System.out.print("請輸入五位數謝謝:");
        x=imput.nextInt();
        a=x/10000;
        b=x/1000%10;
        c=x/100%10;
        d=x/10%10;
        e=x%10;
        System.out.printf("%d %d %d %d %d",a,b,c,d,e);


    }
}
