import java.util.Scanner;

/**
 * Created by Admin on 16.3.2016 г..
 */
public class PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int counter=2;


        for (int j = 0; j <n*2 ; j++) {

            if (j<=n) {


                for (char i = 'a'; i < 97 + j; i++) {    //the ascii number of 'a'is 97
                    System.out.print(i + " ");


                }
                System.out.println();
            }
            else {

                for (char i = 'a'; i < 97 + (j - counter); i++) {
                    System.out.print(i + " ");


                }
                counter+=2;
                System.out.println();

            }


        }

    }
}
