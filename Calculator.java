import java.util.Scanner;
/**
 * Created by Виталий on 03.02.2016.
 */
public class Calculator {
    public static void main(String[] args){
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int t1 = sc.nextInt();
        System.out.println("Введите второе число:");
        int t2 = sc.nextInt();
        System.out.println("Введите знак операции:");
        String op = sc.next();
        switch(op){
            case "+": res = t1 + t2;
                break;
            case "-": res = t1 - t2;
                break;
            case "*": res = t1 * t2;
                break;
            case "/": res = t1 / t2;
                break;
        }
        System.out.println(res);
    }
}
