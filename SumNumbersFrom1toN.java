import java.util.Scanner;

/**
 * Created by Admin on 17.3.2016 г..
 */
public class SumNumbersFrom1toN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        for (int i = 1; i <=n ; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
